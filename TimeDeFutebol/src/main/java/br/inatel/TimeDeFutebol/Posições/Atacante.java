package br.inatel.TimeDeFutebol.Posições;
import br.inatel.TimeDeFutebol.Jogador.Jogador;
import java.util.Random;

public class Atacante extends Jogador {

    //membros
    boolean gol = new Random().nextBoolean();

    //construtor
    public Atacante(String nome, String posicao) {super(nome, posicao);
    }

    //métodos específicos

    public void Gol() {
        System.out.println("O jogador " + this.getNome() + " chutou a bola para o gol. Será que entrou??");
        if (gol) {
            System.out.println("GOOLL!");
        } else {
            System.out.println("PRA FORA!!!");
        }
    }
}
