package teste;

import modelo.entidades.String;
import persistencia.TurmaDao;

public class TesteRemover {
    
    public static void main(String args[]){
        // pronto para gravar
        String turma = new String();
        
        turma.setIdTurma(2);
        
        // grave nessa conexão!!!
        TurmaDao dao = new TurmaDao();

        // método elegante
        dao.remover(turma);
        
        System.out.println("Removido!");
    }    
}
