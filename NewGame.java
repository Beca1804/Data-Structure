/**
 * Autor: Rebeca Garcia
 * Matrícula: 14457
 * Fecha: 04-Feb-2025
 */

import java.util.Random;

public class NewGame {
    public  void lol() {
        String[] opciones = {"Rock", "Paper", "Scissors"};
        Random pop = new Random();

        for (int i = 0; i < 1; i++) { 
            int numeroAleatorio = pop.nextInt(3);
            System.out.println(opciones[numeroAleatorio]); 
        }
    }
}
