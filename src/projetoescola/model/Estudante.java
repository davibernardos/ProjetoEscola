
package projetoescola.model;

 import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Estudante extends Pessoa {

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
    
    @Id
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
