
package projetoescola.model;

import java.util.Date;

public class frequencia {
    
    private long codigo;
    private Date dia;
    private boolean presente;

    public frequencia(long codigo, Date dia, boolean presente) {
        this.codigo = codigo;
        this.dia = dia;
        this.presente = presente;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public boolean isPresente() {
        return presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }

    @Override
    public String toString() {
        return "frequencia{" + "codigo=" + codigo + ", dia=" + dia + ", presente=" + presente + '}';
    }
    
    
}
