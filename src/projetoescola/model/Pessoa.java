
package projetoescola.model;

import java.util.Date;

public class Pessoa {

    private String nome;
    private Date dataDeNascimento;
    private int cpf;
    private int rg;
    private char sexo;
    private String email;
    private String foto;
    private Date dataDeCadastro;
    private boolean ativo;
    
    public Pessoa() {
    }

    public Pessoa(String nome, Date dataDeNascimento, int cpf, int rg, char sexo, String email, String foto, Date dataDeCadastro, boolean ativo) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
        this.email = email;
        this.foto = foto;
        this.dataDeCadastro = dataDeCadastro;
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Date getDataDeCadastro() {
        return dataDeCadastro;
    }

    public void setDataDeCadastro(Date dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", dataDeNascimento=" + dataDeNascimento + ", cpf=" + cpf + ", rg=" + rg + ", sexo=" + sexo + ", email=" + email + ", foto=" + foto + ", dataDeCadastro=" + dataDeCadastro + ", ativo=" + ativo + '}';
    }
    
    
}
