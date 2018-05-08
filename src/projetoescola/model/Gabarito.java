
package projetoescola.model;

import projetoescola.interfaces.GabaritosMetodos;


public class Gabarito implements GabaritosMetodos{

    public Gabarito() {
    }

    public Gabarito(boolean compila, int numeroDeVariaveis, int numeroDeFuncoes, int numeroDeLacos, double tempoDeExecucao, String Complexidade, String[] entrada, String[] resultados) {
        this.compila = compila;
        this.numeroDeVariaveis = numeroDeVariaveis;
        this.numeroDeFuncoes = numeroDeFuncoes;
        this.numeroDeLacos = numeroDeLacos;
        this.tempoDeExecucao = tempoDeExecucao;
        this.Complexidade = Complexidade;
        this.entrada = entrada;
        this.resultados = resultados;
    }
    
    private boolean compila;
    private int numeroDeVariaveis;
    private int numeroDeFuncoes;
    private int numeroDeLacos;
    private double tempoDeExecucao;
    private String Complexidade;
    private String[] entrada;

    public boolean isCompila() {
        return compila;
    }

    public void setCompila(boolean compila) {
        this.compila = compila;
    }

    public int getNumeroDeVariaveis() {
        return numeroDeVariaveis;
    }

    public void setNumeroDeVariaveis(int numeroDeVariaveis) {
        this.numeroDeVariaveis = numeroDeVariaveis;
    }

    public int getNumeroDeFuncoes() {
        return numeroDeFuncoes;
    }

    public void setNumeroDeFuncoes(int numeroDeFuncoes) {
        this.numeroDeFuncoes = numeroDeFuncoes;
    }

    public int getNumeroDeLacos() {
        return numeroDeLacos;
    }

    public void setNumeroDeLacos(int numeroDeLacos) {
        this.numeroDeLacos = numeroDeLacos;
    }

    public double getTempoDeExecucao() {
        return tempoDeExecucao;
    }

    public void setTempoDeExecucao(double tempoDeExecucao) {
        this.tempoDeExecucao = tempoDeExecucao;
    }

    public String getComplexidade() {
        return Complexidade;
    }

    public void setComplexidade(String Complexidade) {
        this.Complexidade = Complexidade;
    }

    public String[] getEntrada() {
        return entrada;
    }

    public void setEntrada(String[] entrada) {
        this.entrada = entrada;
    }

    public String[] getResultados() {
        return resultados;
    }

    public void setResultados(String[] resultados) {
        this.resultados = resultados;
    }
    private String[] resultados;

    @Override
    public void testaCompilacao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void variaveisEsperadas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void funcoesEsperadas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void lacosEsperados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tempoDeExecucao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void complexidadeDoAlgoritmo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void resultadosEsperados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
