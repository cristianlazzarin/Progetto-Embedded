package embeddedproject.takethepill;

import java.sql.Date;
import java.sql.Time;

public class AssumptionEntity {

    // VARIABILI
    private Date data;
    private Time ora;
    private String nomeFarmaco;
    private Boolean stato;
    private Integer dosaggio;
    private String tipoFarmaco;

    // COSTRUTTORI
    public AssumptionEntity(Date data, Time ora, String nomeFarmaco, Boolean stato, Integer dosaggio,String tipoFarmaco){
        this.data=data;
        this.ora=ora;
        this.nomeFarmaco=nomeFarmaco;
        this.stato=stato;
        this.dosaggio=dosaggio;
        this.tipoFarmaco=tipoFarmaco;
    }

    //METODI GET e SET

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Time getOra() {
        return ora;
    }

    public void setOra(Time ora) {
        this.ora = ora;
    }

    public String getNomeFarmaco() {
        return nomeFarmaco;
    }

    public void setNomeFarmaco(String nomeFarmaco) {
        this.nomeFarmaco = nomeFarmaco;
    }

    public Boolean getStato() {
        return stato;
    }

    public void setStato(Boolean stato) {
        this.stato = stato;
    }

    public Integer getDosaggio() {
        return dosaggio;
    }

    public void setDosaggio(Integer dosaggio) {
        this.dosaggio = dosaggio;
    }

    public String getTipoFarmaco() {
        return tipoFarmaco;
    }

    public void setTipoFarmaco(String tipoFarmaco) {
        this.tipoFarmaco = tipoFarmaco;
    }


}