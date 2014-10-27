package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.entidades.Aula;

public class AulaDao {
    
   // a conexão com o banco de dados
   private Connection connection;
   
   public AulaDao() {
     this.connection = new ConnectionFactory().getConnection();
   }
   
      //Adicionar no BD
   public void adicionar(Aula aula) {
        String sql = "insert into aula " +
             "(data,aluno,presente)" +
             " values (?,?,?)";
 
        try {
            // prepared statement para inserção
            PreparedStatement stmt = connection.prepareStatement(sql);
 
            // seta os valores
            stmt.setDate(1,aula.getData());
            stmt.setString(2,aula.getAluno());
            stmt.setString(3,aula.getPresenca());
         
            // executa
            stmt.execute();
            stmt.close();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        } 
    }
   
    //Atualizar Tabela
    public ResultSet atualizarTabela(){
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            String sql;
            sql = "select data,aluno,presente from aula order by data";
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();     
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
       return rs;
    }
   
   
}
