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
       
        // Avvio dei thread Giocatori
       
        // Comunicazione fine gioco
    }
}
   