package persistencia;

import apresentacao.TurmaAlterarFrame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.entidades.Turma;

public class TurmaDao {
    
   // a conexão com o banco de dados
   private Connection connection;
 
   public TurmaDao() {
     this.connection = new ConnectionFactory().getConnection();
   }
   
   //Adicionar no BD
   public void adicionar(Turma turma) {
        String sql = "insert into turma " +
             "(nome,curso,disciplina,periodo,turno)" +
             " values (?,?,?,?,?)";
 
        try {
            // prepared statement para inserção
            PreparedStatement stmt = connection.prepareStatement(sql);
 
            // seta os valores
            stmt.setString(1,turma.getNome());
            stmt.setString(2,turma.getCurso());
            stmt.setString(3,turma.getDisciplina());
            stmt.setInt(4, turma.getPeriodo());
            stmt.setString(5, turma.getTurno());
         
            // executa
            stmt.execute();
            stmt.close();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        } 
    }
   
   //Alterar BD
    public void alterar(Turma turma) {
        String sql = "update turma set nome=?, curso=?,"+
            "disciplina=?, periodo=?, turno=?  where idTurma=?";
        
        try {
         PreparedStatement stmt = connection
            .prepareStatement(sql);
         stmt.setString(1, turma.getNome());
         stmt.setString(2, turma.getCurso());
         stmt.setString(3, turma.getDisciplina());
         stmt.setInt(4, turma.getPeriodo());
         stmt.setString(5, turma.getTurno());
         stmt.setInt(6, turma.getIdTurma());
         stmt.execute();
         stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }   
    }
    
    //Remover BD
    public void remover(Turma turma, int id) {
        try {
             PreparedStatement stmt = connection
                     .prepareStatement("delete from turma where idTurma=?");
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
            sql = "select idTurma as CodigoTurma,"
                    + "nome as Turma,"
                    + "curso as Curso,"
                    + "disciplina as Disciplina,"
                    + "periodo as Periodo,"
                    + "turno as Turno "
                    + "from turma order by curso,nome";
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();     
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
       return rs;
    }
    
    public void preencherComboCodigo(TurmaAlterarFrame turmaFrame){
        try {
            String sql = "select * from turma order by idTurma";
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) { 
                int codigo = rs.getInt("idTurma");
                turmaFrame.getjComboBoxCodigo().addItem(codigo);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void preencherCodigoText(TurmaAlterarFrame turmaFrame){
        try{
            String var = turmaFrame.getjComboBoxCodigo().getSelectedItem().toString();
            String sql = "select nome,curso,disciplina,periodo,turno from turma where idTurma = ?";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, var);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                String nome = rs.getString("nome");
                String curso = rs.getString("curso");
                String disciplina = rs.getString("disciplina");
                int periodo = rs.getInt("periodo");
                String turno = rs.getString("turno");
                
                turmaFrame.getjTextNomeTurmaAlterar().setText(nome);
                turmaFrame.getjTextFieldCursoTurmaAlterar().setText(curso);
                turmaFrame.getjTextTurmaDisciplinaTurma().setText(disciplina);
                turmaFrame.getjTextTurmaPeriodoTurma().setText(String.valueOf(periodo));
                turmaFrame.getjComboBoxTurnoTurmaAlterar().getModel().setSelectedItem(turno);
            }
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
}
