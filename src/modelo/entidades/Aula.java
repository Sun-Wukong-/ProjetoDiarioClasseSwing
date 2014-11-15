package modelo.entidades;

import java.sql.Date;

public class Aula {
    
    private int idAula;
    private String data;
    private boolean presenca;
    private String presencaS;
   
    /**
     * @return the idAula
     */
    public int getIdAula() {
        return idAula;
    }

    /**
     * @param idAula the idAula to set
     */
    public void setIdAula(int idAula) {
        this.idAula = idAula;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the presenca
     */
    public String getPresencaS() {
        return presencaS;
    }

    /**
     * @param presenca the presenca to set
     */
    public void setPresenca(boolean presenca) {
        if (presenca = true){
          this.presencaS = "Presente";
        }else{
          this.presencaS = "Falta";
        }  
        }
    }

