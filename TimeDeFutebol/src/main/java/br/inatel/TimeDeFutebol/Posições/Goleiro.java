package br.inatel.TimeDeFutebol.Posições;

import br.inatel.TimeDeFutebol.Jogador.Jogador;

public class Goleiro extends Jogador {


    //construtor
    public Goleiro(String nome, String posicao) {
        super(nome, posicao);
    }

    //métodos específicos
    public void cobrarTirodeMeta(){
        System.out.println("Goleiro cobrando tiro de meta!");
    }

}
