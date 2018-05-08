
package projetoescola.model;

public class mediador extends Pessoa{
    
    private long codigo;
    private String titulacao;
    private String area;

    public mediador(long codigo, String titulacao, String area) {
        this.codigo = codigo;
        this.titulacao = titulacao;
        this.area = area;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
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
        return "mediador{" + "codigo=" + codigo + ", titulacao=" + titulacao + ", area=" + area + '}';
    }
    
    
    
}
