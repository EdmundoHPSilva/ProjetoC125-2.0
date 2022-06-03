package br.inatel.TimeDeFutebol.Fila;

import br.inatel.TimeDeFutebol.Jogador.Jogador;
import javax.swing.*;

public class Fila {
    int inicio, fim, tamanho, qtdeElementos = 0;
     Object f[];

    public Fila(){
        inicio = fim = -1;
        tamanho = 5;
        f = new Object[tamanho];
    }

    public boolean vazia(){
        if (qtdeElementos == 0){
            return true;
        }
        return false;
    }

    public boolean cheia(){
        if (qtdeElementos == tamanho - 1){
            return true;
        }
        return false;
    }

    public void adicionar(Object e){
        if (! cheia()){
            if (inicio == -1){
                inicio = 0;
            }
            fim++;
            f[fim] = e;
            qtdeElementos++;
        }
    }

    public void remover(){
        if (! vazia() ){
            inicio++;
            qtdeElementos--;
        }
    }

    public void mostrar(){
        String elementos = "";
        for (int i = inicio; i<=fim; i++) {
            elementos += f[i]+ " - ";
        }
        JOptionPane.showMessageDialog(null, elementos);
    }
}