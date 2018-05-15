package projetoescola.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class disciplina implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo;
    private Date dataInicio;
    private int cargaHoraria;

    @Override
    public String toString() {
        return "disciplina{" + "codigo=" + codigo + ", dataInicio=" + dataInicio + ", cargaHoraria=" + cargaHoraria + '}';
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public disciplina(long codigo, Date dataInicio, int cargaHoraria) {
        this.codigo = codigo;
        this.dataInicio = dataInicio;
        this.cargaHoraria = cargaHoraria;
    }
}
