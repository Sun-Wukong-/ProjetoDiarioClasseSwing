package persistencia;

import apresentacao.AulaAlterarFrame;
import apresentacao.AulaFrame;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.entidades.Aluno;
import modelo.entidades.Aula;

public class AulaDao {
    
   // a conexão com o banco de dados
   private Connection connection;
   
   public AulaDao() {
     this.connection = new ConnectionFactory().getConnection();
   }
   
      //Adicionar no BD
    public void adicionar(Aula aula, Aluno aluno) {
        String sql = "insert into aula " +
             "(data,presente,codigoAluno)" +
             " values (?,?,(select idAluno from aluno where matricula = ? limit 1))";
 
        try {
            // prepared statement para inserção
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, aula.getData());
            stmt.setString(2, aula.getPresencaS());
            stmt.setInt(3, aluno.getMatricula());
            // executa
            stmt.execute();
            stmt.close();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


      //Alterar BD
   @SuppressWarnings("empty-statement")
    public void alterar(Aula aula) {
        String sql = "update aula set "+
            "presente=?  where idAula=?";
        
        try {
         PreparedStatement stmt = connection
            .prepareStatement(sql);
         stmt.setString(1, aula.getPresencaS());;
         stmt.setInt(2, aula.getIdAula());
         stmt.execute();
         stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }   
    }
   
   //Remover BD
    public void remover(Aula aula, int id) {
        try {
             PreparedStatement stmt = connection
                     .prepareStatement("delete from aula where idAula=?");
             stmt.setInt(1, id);
             stmt.execute();
             stmt.close();
         } catch (SQLException e) {
             throw new RuntimeException(e);
         }
     } 
   
    //Atualizar Tabela
    public ResultSet atualizarTabela(){
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            String sql;
            sql = "select idAula as CodigoAula, data as DataAula, "
                    + "(select turma.nome from turma join aluno where codigoTurma = idTurma limit 1) as Turma,"
                    + "(select aluno.nome from aluno where idAluno = codigoAluno limit 1) as Aluno,"
                    + "presente as Presente from aula order by Turma,data";
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();     
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
       return rs;
    }
   
   public void preencherJTableCodigo(AulaAlterarFrame aulaFrame) {
        try {
            String var = aulaFrame.getjComboBoxCodigoAula().getSelectedItem().toString();
            String sql = "select data,(select aluno.nome from aluno where idAluno = codigoAluno limit 1) as aluno,"
                    + "presente from aula where idAula = ?";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, var);
            ResultSet rs = pst.executeQuery();
            
            DefaultTableModel model = (DefaultTableModel) aulaFrame.getjTablePresenca().getModel();
            model.setRowCount(0);
            while (rs.next()) { 
                Date data = rs.getDate("data");
                String aluno = rs.getString("aluno");
                Boolean presente = rs.getBoolean("presente");
                Object[][] datav = {{data,aluno,presente}};
                model.insertRow(aulaFrame.getjTablePresenca().getRowCount(), new Object[] {data,aluno,presente});
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void preencherJTable(AulaFrame aulaFrame) {
        try {
            String var = aulaFrame.getjComboBoxTurmaAula().getSelectedItem().toString();
            String sql = "select matricula,nome from aluno where codigoTurma = "
                    + "(select idTurma from turma where nome = ?)" ;
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, var);
            ResultSet rs = pst.executeQuery();
            
            DefaultTableModel model = (DefaultTableModel) aulaFrame.getjTablePresenca().getModel();
            model.setRowCount(0);
            while (rs.next()) { 
                String name = rs.getString("nome");
                int matricula = rs.getInt("matricula");
                Object[][] data = {{matricula,name}};
                model.insertRow(aulaFrame.getjTablePresenca().getRowCount(), new Object[] {matricula,name});
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
   
    public void preencherCombo(AulaFrame aulaFrame){
        try {
            String sql = "select * from turma order by nome";
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) { 
                String name = rs.getString("nome");
                aulaFrame.getjComboBoxTurmaAula().addItem(name);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
        
    public void preencherComboCodigo(AulaAlterarFrame aulaFrame){
        try {
            String sql = "select * from aula order by idAula";
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) { 
                int codigo = rs.getInt("idAula");
                aulaFrame.getjComboBoxCodigoAula().addItem(codigo);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}

