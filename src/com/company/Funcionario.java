package com.company;

public class Funcionario {
    private String nome;
    private String atividade;

    public Funcionario(String nome, String atividade){
        setNome(nome);
        setAtividade(atividade);
    }

    public String getNome() {
        return nome;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

}
