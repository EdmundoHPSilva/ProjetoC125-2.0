package br.inatel.TimeDeFutebol.Jogador;

import br.inatel.TimeDeFutebol.Exceções.Intercept;

import java.util.Random;

public abstract class Jogador{

    //membros
    private int idade;
    private double peso, altura;
    private String nome, posicao;
    boolean passe = new Random().nextBoolean();

    //construtores
    public Jogador(String nome, String posicao) {
        this.nome = nome;
        this.posicao = posicao;

    }


    //metodos
    public void correr(){
        System.out.println("O jogador " + this.getNome() + " está correndo!");
    }
    public void chutar(){
        System.out.println("O jogador " + this.getNome() + " está chutando!");
    }
    public void cobrarLateral(){
        System.out.println("O jogador " + this.getNome() + " está cobrando lateral!");
    }
    public void cobrarFalta(){
        System.out.println("O jogador " + this.getNome() + " está cobrando falta!");
    }
    public void passarBola() {
        if (passe) {
            System.out.println("O jogador " + this.getNome() + " passou a bola para o próximo jogador!");
        } else {
            System.out.println("O jogador " + this.getNome() + " foi interceptado!");
            System.exit(0);
        }
    }

    //getters
    public String getNome() {
        return nome;
    }
    public String getPosicao() {
        return posicao;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }
    public int getIdade() {
        return idade;
    }

}
