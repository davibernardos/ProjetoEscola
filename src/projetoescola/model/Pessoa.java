package projetoescola.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;
    private String dataDeNascimento;
    private int cpf;
    private int rg;
    private char sexo;
    private String email;
    private String foto;
    private String dataDeCadastro;
    private boolean ativo;
    

    public Pessoa() {
    }

    public Pessoa(String nome, String dataDeNascimento, int cpf, int rg, char sexo, String email, String foto, String dataDeCadastro, boolean ativo) {
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

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
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

    public String getDataDeCadastro() {
        return dataDeCadastro;
    }

    public void setDataDeCadastro(String dataDeCadastro) {
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
