import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String nombrePelicula = "Deadpool";
        double mediaPelicula = 0;
        int contador = 0;
        Scanner respuesta = new Scanner(System.in);
        while (true){
            Scanner puntaje = new Scanner(System.in);
            System.out.println("Ingresa el puntaje que le darias a la pelicula de " + nombrePelicula);
            double puntajePelicula = puntaje.nextDouble();
            mediaPelicula = mediaPelicula + puntajePelicula;
            System.out.println("¿Deseas agregar una nueva respuesta? (si/no)");
            String dijo = respuesta.next();
            if (!dijo.equalsIgnoreCase("si")){
                break;
            }
            contador ++;
        }
        System.out.println("La pelicula de " + nombrePelicula + " tiene un puntaje de " + (mediaPelicula/contador));
    }
}