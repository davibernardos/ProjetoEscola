/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoescola.model;


public class Escola {
    
    private long codigo;
    private String nome;
    private int cnpj;

    public Escola(long codigo, String nome, int cnpj) {
        this.codigo = codigo;
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public Escola() {
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    
    
    
}
