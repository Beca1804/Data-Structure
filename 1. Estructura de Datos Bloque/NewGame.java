import java.util.Random;

public class NewGame {
    public  void lol() {
        String[] opciones = {"Piedra", "Papel", "Tijeras"};
        Random pop = new Random();

        for (int i = 0; i < 1; i++) { 
            int numeroAleatorio = pop.nextInt(3);
            System.out.println(opciones[numeroAleatorio]); 
        }
    }
}
