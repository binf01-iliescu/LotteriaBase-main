/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotteria;

/**
 *
 * @author monica ciuchetti
 */
public class Lotteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scelta del numero dei numeri da estrarre
        Estrazione e = new Estrazione(4,4);
        // Istanza ed avvio del thread Estrazione
        e.run();
        // Istanza di alcuni thread Giocatore
        Giocatore g1 = new Giocatore(1,"Robert", e);
        Giocatore g2 = new Giocatore(2,"Mattia", e);
        Giocatore g3 = new Giocatore(3,"Luca", e);
        Giocatore g4 = new Giocatore(4,"Mario", e);
        // Avvio dei thread Giocatori
        g1.run();
        g2.run();
        g3.run();
        g4.run();
        // Comunicazione fine gioco
        e.stampaVincitori();
    }
}
   