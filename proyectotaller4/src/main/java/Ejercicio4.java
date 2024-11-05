
import java.util.Scanner;


public class Ejercicio4 {
    public static void main(String[] args) {
        double costoMinuto, cantidadMinuto, valorplanilla;
        Scanner costo = new Scanner(System.in);
        System.out.print("Ingrese el costo por minuto: ");
        costoMinuto = costo.nextDouble();
        System.out.print("Ingrese la cantidad de minutos: ");
        cantidadMinuto = costo.nextDouble();
        valorplanilla = (costoMinuto + cantidadMinuto);
        System.out.println("El valor de la planilla es: " + valorplanilla);
    }
    
}

