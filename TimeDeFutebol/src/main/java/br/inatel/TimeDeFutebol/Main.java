package br.inatel.TimeDeFutebol;
import br.inatel.TimeDeFutebol.Jogador.Jogador;
import br.inatel.TimeDeFutebol.Posições.*;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Object> listaJogadores = new LinkedList<Object>();

        Goleiro gl = new Goleiro("Ornstein", "Goleiro");
        Zagueiro zg = new Zagueiro("Velstadt", "atacante");
        Lateral lt = new Lateral("Nameless King", "Lateral");
        MeioDeCampo mc = new MeioDeCampo("Gascoigne", "Meio de Campo");
        Atacante at = new Atacante("Radagon", "Atacante");

        listaJogadores.add(gl);
        listaJogadores.add(zg);
        listaJogadores.add(lt);
        listaJogadores.add(mc);
        listaJogadores.add(at);

        while(listaJogadores.isEmpty()){
            listaJogadores.element();
        }
    }
}
