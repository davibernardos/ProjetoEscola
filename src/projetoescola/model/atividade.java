
package projetoescola.model;


public class atividade {
   
  private String descricao;

    public atividade(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "atividade{" + "descricao=" + descricao + '}';
    }
  
  
    
}
