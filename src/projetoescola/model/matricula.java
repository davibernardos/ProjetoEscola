package projetoescola.model;

import java.util.Date;


public class matricula {
    
    private long codigo;
    private Date dataDaMatricula;

    public matricula(long codigo, Date dataDaMatricula) {
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
