/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotteria;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author monica ciuchetti
 */
public class Giocatore extends Thread{

    private String nomeGiocatore;
    private int idGiocatore;
    private Estrazione e;
    private int numeroScelto;
    
    public Random rnd = new Random();
    
    public Giocatore(int id,String nome,Estrazione estrazione) {
       // inizializzazione attributi
       this.nomeGiocatore = nome;
       this.idGiocatore = id;
       this.e = estrazione;
    }

    /**
    * 
    * Metodo per eseguire il thread
    */
    public void run() {
       // scelta del numero da giocare
       Scanner scanner = new Scanner(System.in);
       System.out.println(this.nomeGiocatore + " inserisci il numero:  ");
        this.numeroScelto = scanner.nextInt();
        System.out.println("numero:  " + numeroScelto);
       // verifica del risutlato
       boolean res = e.verifica(numeroScelto, this);
       // stampa fine verifica
       if(res){
           System.out.println(this.nomeGiocatore +  " hai vinto");
       }else{
           System.out.println(this.nomeGiocatore +  " hai perso");
       }
    }
    
    @Override
    public String toString() {
        return "Giocatore{" +
               "nomeGiocatore='" + nomeGiocatore + '\'' +
               ", idGiocatore=" + idGiocatore +
               ", numeroScelto=" + numeroScelto +
               '}';
    }

}
