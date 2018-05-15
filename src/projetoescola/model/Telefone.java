package projetoescola.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Telefone implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo;
    private String tipo;
    private int numero;

    public Telefone(long codigo, String tipo, int numero) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.numero = numero;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "telefone{" + "codigo=" + codigo + ", tipo=" + tipo + ", numero=" + numero + '}';
    }

}
