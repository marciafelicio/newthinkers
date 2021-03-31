package com.company;

import java.util.Date;

public class Ingrediente {
    private String nome;
    private Date dataValidade;

    public Ingrediente(String nome, Date dataValidade) {
        setNome(nome);
        setDataValidade(dataValidade);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getNome() {
        return nome;
    }

    public Date getDataValidade() {
        return dataValidade;
    }
}
