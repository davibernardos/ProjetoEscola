package projetoescola.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Perfil implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private double condicionais;
    private double lacos;
    private double otimizacao;
    private double indiceParcial;

    public Perfil(double condicionais, double lacos, double otimizacao, double indiceParcial) {
        this.condicionais = condicionais;
        this.lacos = lacos;
        this.otimizacao = otimizacao;
        this.indiceParcial = indiceParcial;
    }

    public double getCondicionais() {
        return condicionais;
    }

    public void setCondicionais(double condicionais) {
        this.condicionais = condicionais;
    }

    public double getLacos() {
        return lacos;
    }

    public void setLacos(double lacos) {
        this.lacos = lacos;
    }

    public double getOtimizacao() {
        return otimizacao;
    }

    public void setOtimizacao(double otimizacao) {
        this.otimizacao = otimizacao;
    }

    public double getIndiceParcial() {
        return indiceParcial;
    }

    public void setIndiceParcial(double indiceParcial) {
        this.indiceParcial = indiceParcial;
    }

    @Override
    public String toString() {
        return "perfil{" + "condicionais=" + condicionais + ", lacos=" + lacos + ", otimizacao=" + otimizacao + ", indiceParcial=" + indiceParcial + '}';
    }

}
