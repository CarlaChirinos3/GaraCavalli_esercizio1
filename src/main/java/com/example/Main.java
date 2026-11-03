package com.example;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        /* 
        System.out.println("Hello world!");
        Cavallo c1=new Cavallo("Fulmine",100);
        Cavallo c2=new Cavallo("Freccia",100);

        c1.start();
        c2.start();
    }

       Scanner input= new Scanner(System.in);
   //leggere una variabile
   int numero=input.nextInt(); //legge il numero inserito

    */
//L'UTENTE DEVE POTER INSERIRE IL NUMERO DI CAVALLI PARTECIPANTI
    Scanner scanner = new Scanner(System.in);
    int numero=0;
    String nomeCavallo;
    int percorsoTotale;
    System.out.println("Inserisci qt partecipanti:");
    numero=scanner.nextInt();
    scanner.nextLine();
    Cavallo[] cavalli =new Cavallo[numero];//va dischiarata qui cosi che sia accessibile

    for(int i=0;i<numero;i++){
        System.out.println("Inserisci il nome del cavallo:");
        nomeCavallo=scanner.nextLine();

            scanner.nextLine(); // Consuma l'Invio rimasto

        System.out.println("Inserisci il percorso in metri(totale) del cavallo:");
        percorsoTotale=scanner.nextInt();

            scanner.nextLine(); // Consuma l'Invio rimasto
               
            //attenzione non possimao mettere il nnome del oggetto uguale per tutti
           /*  Cavallo[] cavalli =new Cavallo[numero];*/
            cavalli[i]=new Cavallo(nomeCavallo, percorsoTotale);

        }

    for (int cont = 0; cont < numero; cont++) {
        cavalli[cont].start();
    }
}
}