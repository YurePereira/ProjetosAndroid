package com.example.francisco.projetofinal;

/**
 * Created by Francisco on 12/17/2017.
 */

public class Pessoa {

    private int id;
    private String nome;
    private String cpf;
    private String idade;
    private String telefone;
    private String email;

    public Pessoa(int id, String nome, String cpf, String idade, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.telefone = telefone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Nome: " + nome +
                ", CPF: " + cpf +
                ", Idade: " + idade +
                ", Telefone: " + telefone +
                ", E-mail: " + email;
    }


}
