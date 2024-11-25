/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotteria;

import java.util.Random;

/**
 *
 * @author monica ciuchetti
 */
public class Estrazione extends Thread {
    // attributi
    public int[][] numeri_estratti;
    public int n;
    public int m;
    public int currVincente = 0;

    public Giocatore[] vincenti;
    public Random rnd = new Random();
    
    public Estrazione(int n, int m) {
        numeri_estratti = new int[n][m];
        this.n = n;
        this.m = m;
        // popolamento matrice numeri estratti
        
        for(int i = 0; i<n;i++){
            for(int j=0; j < m; j++){
                this.numeri_estratti[i][j] = rnd.nextInt(100);
            }
        }
         // inizializzazione array vincitori
        this.vincenti = new Giocatore[3];
    }

    /**
    * 
    * Metodo per visualizzare la matrice dei numeri estratti
    */
    public void stampaMatrice() {
       // stampa matrice dei numeri estratti
       String row;
       for(int i = 0; i<this.n;i++){
           row = "";
            for(int j=0; j < this.m; j++){
                if(this.numeri_estratti[i][j] < 10){
                    row += " |  " + this.numeri_estratti[i][j];
                }
                else{
                    row += " | " + this.numeri_estratti[i][j];
                }
                
            }
            System.out.println(row + " |");
       }
           
    }
    
    /**
    * 
    * Metodo per visualizzare i vincitori dell'estrazione
    */
    public void stampaVincitori() {
        // stampa array dei vincitori
        for(int i = 0; i < 3; i++){
            System.out.println(this.vincenti[i]);
        }
    }

    /**
    * 
    * Metodo per verificare il numero scelto dal giocatore e determinare i vincitori
    * 
    * @param numero
    * @param g
    * @return boolean
    */
    public boolean verifica(int numero, Giocatore g) {
        boolean trovato = false;
        for(int i = 0; i<this.n;i++){
            for(int j=0; j < this.m; j++){
                if (this.numeri_estratti[i][j] == numero){
                    this.vincenti[this.currVincente] = g;
                    this.currVincente += 1;
                    trovato = true;
                    break;
                }           
            }
        }
        return trovato;
    }

    /**
    * 
    * Metodo per eseguire il thread
    */
    public void run() {
        // stampa iniziale
        // estrazione dei numeri
        this.stampaMatrice();
        // stampa matrice
        // stampa finale
    }
}


