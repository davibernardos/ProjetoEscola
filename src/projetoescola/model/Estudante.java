package projetoescola.model;

import java.io.Serializable;
<<<<<<< HEAD
import java.util.Date;
=======
 import java.util.Date;
>>>>>>> 0cef50d546084a70a8dfaa46a9c99fa42fa93df4
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

<<<<<<< HEAD
@Entity
public class Estudante extends Pessoa implements Serializable{
=======

public class Estudante extends Pessoa {
>>>>>>> 0cef50d546084a70a8dfaa46a9c99fa42fa93df4

    public Estudante() {
    }

    public Estudante(long codigo, int matricula, Date dataDaMatricula, String nomeDoPai, String nomeDaMae, String estadoCivil) {
        this.codigo = codigo;
        this.matricula = matricula;
        this.dataDaMatricula = dataDaMatricula;
        this.nomeDoPai = nomeDoPai;
        this.nomeDaMae = nomeDaMae;
        this.estadoCivil = estadoCivil;
    }
<<<<<<< HEAD

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
=======
    

>>>>>>> 0cef50d546084a70a8dfaa46a9c99fa42fa93df4
    private long codigo;
    private int matricula;
    private Date dataDaMatricula;
    private String nomeDoPai;
    private String nomeDaMae;
    private String estadoCivil;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

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
