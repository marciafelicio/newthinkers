package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cozinha {
    private int horaAbertura;
    private int horaFechamento;
    private String pratoPrincipal;

    private ArrayList<Ingrediente> listaIngredientes = new ArrayList<>();
    private ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();


    public void setHoraAbertura(int horaAbertura) {
        this.horaAbertura = horaAbertura;
    }

    public void setHoraFechamento(int horaFechamento) {
        this.horaFechamento = horaFechamento;
    }

    public void setPratoPrincipal(String pratoPrincipal) {
        this.pratoPrincipal = pratoPrincipal;
    }

    public void setListaIngredientes(String nome, Date dataValidade ){
        Ingrediente ingrediente = new Ingrediente(nome, dataValidade);

        this.listaIngredientes.add(ingrediente);
    }

    public void setListaFuncionarios(String nome, String atividade){
        Funcionario funcionario = new Funcionario(nome, atividade);
        this.listaFuncionarios.add(funcionario);
    }

    public int getHoraAbertura() {
        return horaAbertura;
    }

    public int getHoraFechamento() {
        return horaFechamento;
    }

    public String getPratoPrincipal() {
        return pratoPrincipal;
    }

    public List<Ingrediente> getListaIngredientes() {
        return listaIngredientes;
    }

    public List<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }


}
