
package projetoescola.model;

import java.util.Date;


public class disciplina {
   
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
