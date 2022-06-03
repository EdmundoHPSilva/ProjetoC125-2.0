package br.inatel.TimeDeFutebol.Fila;

import javax.swing.*;

class Fila{
    int inicio, fim, tamanho, qtdeElementos, f[];

    public Fila(){
        inicio = fim = -1;
        tamanho = 100;
        f = new int[tamanho];
        qtdeElementos = 0;
    }

    public boolean Vazia(){
        if (qtdeElementos == 0){
            return true;
        }
        return false;
    }

    public boolean Cheia(){
        if (qtdeElementos == tamanho - 1){
            return true;
        }
        return false;
    }

    public void adicionar(int e){
        if (! Cheia()){
            if (inicio == -1){
                inicio = 0;
            }
            fim++;
            f[fim] = e;
            qtdeElementos++;
        }
    }

    public void remover(){
        if (! Vazia() ){
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