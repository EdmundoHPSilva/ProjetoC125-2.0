package br.inatel.TimeDeFutebol;
import br.inatel.TimeDeFutebol.Posições.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> listaJogadores = new ArrayList<>();

        Goleiro gl = new Goleiro("Ornstein", "Goleiro");
        Zagueiro zg = new Zagueiro("Velstadt", "atacante");
        Lateral lt = new Lateral("Nameless King", "Lateral");
        MeioDeCampo mc = new MeioDeCampo("Gascoigne", "Meio de Campo");
        Atacante at = new Atacante("Radagon", "atacante");

        listaJogadores.add(gl);
        listaJogadores.add(zg);
        listaJogadores.add(lt);
        listaJogadores.add(mc);
        listaJogadores.add(at);


}}
