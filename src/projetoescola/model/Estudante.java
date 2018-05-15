package projetoescola.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estudante extends Pessoa implements Serializable{

    public Estudante() {
    }

    public Estudante(int matricula, Date dataDaMatricula, String nomeDoPai, String nomeDaMae, String estadoCivil) {
        this.matricula = matricula;
        this.dataDaMatricula = dataDaMatricula;
        this.nomeDoPai = nomeDoPai;
        this.nomeDaMae = nomeDaMae;
        this.estadoCivil = estadoCivil;
    }
    
    private int matricula;
    private Date dataDaMatricula;
    private String nomeDoPai;
    private String nomeDaMae;
    private String estadoCivil;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Date getDataDaMatricula() {
        return dataDaMatricula;
    }

    public void setDataDaMatricula(Date dataDaMatricula) {
        this.dataDaMatricula = dataDaMatricula;
    }

    public String getNomeDoPai() {
        return nomeDoPai;
    }

    public void setNomeDoPai(String nomeDoPai) {
        this.nomeDoPai = nomeDoPai;
    }

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

}
