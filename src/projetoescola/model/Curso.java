/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoescola.model;


public class Curso {
    
    private long codigo;
    private String nome;
    private int vagas;

    public Curso(long codigo, String nome, int vagas) {
        this.codigo = codigo;
        this.nome = nome;
        this.vagas = vagas;
    }

    public Curso() {
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

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    @Override
    public String toString() {
        return "Curso{" 
                + "codigo=" 
                + codigo + ", nome=" 
                + nome + ", vagas=" 
                + vagas + '}';
    }
    
    
    
}
