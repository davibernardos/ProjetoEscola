package projetoescola.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Mediador extends Pessoa implements Serializable {
    
    private String titulacao;
    private String area;

    public Mediador(long codigo, String titulacao, String area) {
        this.titulacao = titulacao;
        this.area = area;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "mediador{" + ", titulacao=" + titulacao + ", area=" + area + '}';
    }

}
