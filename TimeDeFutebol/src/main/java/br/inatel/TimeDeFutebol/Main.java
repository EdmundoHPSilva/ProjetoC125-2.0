package br.inatel.TimeDeFutebol;
import br.inatel.TimeDeFutebol.Exceções.Intercept;
import br.inatel.TimeDeFutebol.Posições.Atacante;
import br.inatel.TimeDeFutebol.Posições.Zagueiro;

public class Main {
    public static void main(String[] args) {
        Atacante at1 = new Atacante("Solaire", "atacante"); //só para debuggar
        Zagueiro zg1 = new Zagueiro("Chi", "atacante");
        at1.passarBola();
        zg1.passarBola();

}}
