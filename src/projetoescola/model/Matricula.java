package projetoescola.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Matricula implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo;
    private Date dataDaMatricula;

    public Matricula(long codigo, Date dataDaMatricula) {
        this.codigo = codigo;
        this.dataDaMatricula = dataDaMatricula;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public Date getDataDaMatricula() {
        return dataDaMatricula;
    }

    public void setDataDaMatricula(Date dataDaMatricula) {
        this.dataDaMatricula = dataDaMatricula;
    }

    @Override
    public String toString() {
        return "matricula{" + "codigo=" + codigo + ", dataDaMatricula=" + dataDaMatricula + '}';
    }

}
