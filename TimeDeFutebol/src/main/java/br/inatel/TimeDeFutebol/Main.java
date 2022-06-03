package br.inatel.TimeDeFutebol;
import br.inatel.TimeDeFutebol.Fila.Fila;
import br.inatel.TimeDeFutebol.Posições.*;


public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila();

        Goleiro gl = new Goleiro("Ornstein", "Goleiro");
        Zagueiro zg = new Zagueiro("Velstadt", "atacante");
        Lateral lt = new Lateral("Nameless King", "Lateral");
        MeioDeCampo mc = new MeioDeCampo("Gascoigne", "Meio de Campo");
        Atacante at = new Atacante("Radagon", "atacante");


}}
