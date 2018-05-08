package projetoescola.model;

public class telefone {
    
    private long codigo;
    private String tipo;
    private int numero;

    public telefone(long codigo, String tipo, int numero) {
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
