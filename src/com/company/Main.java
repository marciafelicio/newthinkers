package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date dataValidade = new Date();

        Cozinha mineira = new Cozinha();
        mineira.setHoraAbertura(14);
        mineira.setHoraFechamento(20);
        mineira.setPratoPrincipal("Feijoada");

        // adicionar ingredientes
        mineira.setListaIngredientes("Feijão", dataValidade);
        mineira.setListaIngredientes("Farinha", dataValidade);
        mineira.setListaIngredientes("Arroz", dataValidade);
        mineira.setListaIngredientes("Carne de Porco", dataValidade);
        mineira.setListaIngredientes("Linguiça", dataValidade);

        //adicionar funcionarios
        mineira.setListaFuncionarios("maria jose", "cozinheira");
        mineira.setListaFuncionarios("jose carlos", "ajudante");
        mineira.setListaFuncionarios("wilian ", "cozinheira");
        mineira.setListaFuncionarios("joao", "ajudante");

        Cozinha chinesa = new Cozinha();
        chinesa.setHoraAbertura(10);
        chinesa.setHoraFechamento(21);
        chinesa.setPratoPrincipal("yakissoba");

        chinesa.setListaIngredientes("champignon", dataValidade);
        chinesa.setListaIngredientes("brocolis", dataValidade);
        chinesa.setListaIngredientes("macarrao", dataValidade);
        chinesa.setListaIngredientes("carne", dataValidade);

        chinesa.setListaFuncionarios("patricia seabra", "ajudante");
        chinesa.setListaFuncionarios("paolla kevara", "cozinheira");
        chinesa.setListaFuncionarios("joana oliveira", "ajudante");

        Cozinha italiana = new Cozinha();
        italiana.setHoraAbertura(13);
        italiana.setHoraFechamento(22);
        italiana.setPratoPrincipal("yakissoba");

        italiana.setListaIngredientes("molho", dataValidade);
        italiana.setListaIngredientes("macarrao", dataValidade);
        italiana.setListaIngredientes("carne", dataValidade);

        italiana.setListaFuncionarios("eliza fernandes", "cozinheira");
        italiana.setListaFuncionarios("renata santos", "ajudante");


        System.out.print("Restaurante Mineira \n");
        System.out.print("Hora de abertura: " + mineira.getHoraAbertura() + " \n");
        System.out.print("Hora Fechamento: " + mineira.getHoraFechamento() + " \n");
        System.out.print("Prato principal: " + mineira.getPratoPrincipal() + " \n");

    }
}
