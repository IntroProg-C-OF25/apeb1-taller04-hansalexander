
import java.util.Scanner;


public class Ejercicio5 {
    public static void main(String[] args) {
        double cpu, tecla, pantalla, raton, costototal;
        Scanner teclado = new Scanner(System.in);
        System.out.print("INGRESE EL COSTO DEL CPU:");
        cpu = teclado.nextDouble();
        System.out.print("INGRESE EL COSTO DEL TECLADO:");
        tecla = teclado.nextDouble();
        System.out.print("INGRESE EL COSTO DE LA PANTALLA:");
        pantalla = teclado.nextDouble();
        System.out.print("INGRESE EL COSTO DEL RATON:");
        raton = teclado.nextDouble();
        costototal = cpu + tecla + pantalla + raton;
        System.out.println("EL COSTO TOTAL DE LA COMPUTADORA ES: " + costototal);
    }
}
    


