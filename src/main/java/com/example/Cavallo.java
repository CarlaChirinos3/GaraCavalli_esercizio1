package com.example;

import java.util.Random;

public class Cavallo extends Thread {
    String nome;
    int lunghezzaPercorsa=0;
    int totalePercorso=100;
    
    public Cavallo(String nome, int totalePercorso) {
        this.nome = nome;
        this.totalePercorso = totalePercorso;
    }

    public void run(){
        Random random = new Random();

        //nel mentre sia vera continua 
        //finche la lunghezza percorsa è minore del totale genera numeri
        while (lunghezzaPercorsa<totalePercorso) {
            int metri = random.nextInt(10) + 1;
            lunghezzaPercorsa=lunghezzaPercorsa+metri;
            System.out.println(nome +" ha percorso :"+ lunghezzaPercorsa+" m ");
                try {
                    int tempoSleep = random.nextInt(400) + 400; // Tra 400 e 800 ms
                    Thread.sleep(tempoSleep);
                } catch (InterruptedException e) {
                    System.out.println("Il thread è stato interrotto");
                }

        }System.out.println("ha vinto:"+nome);
    }
    
}
