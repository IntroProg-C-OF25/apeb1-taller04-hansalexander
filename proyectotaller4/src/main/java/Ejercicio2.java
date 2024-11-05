
import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        double gasto1 ,gasto2, gasto3, gastototal;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el gasto 1");
        gasto1 = teclado.nextDouble();
        System.out.print("Ingrese gasto 2");
        gasto2 = teclado.nextDouble();
        System.out.println("Ingrese gasto 3");
        gasto3 = teclado.nextDouble();
        gastototal = (gasto1 + gasto2 + gasto3);
        System.out.println("Sus gasto total es: " + gastototal);
    }
    
}
    


