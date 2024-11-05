
import java.util.Scanner;


public class Ejercicio6 {
    public static void main(String[] args) {
        double montoprestamo, interesmensual, plazomeses, pagomensual;
        Scanner teclado = new Scanner(System.in);
        System.out.print("INGRESE EL VALOR DEL MONTO DEL PRESTAMO: ");
        montoprestamo = teclado.nextDouble();
        System.out.print("INGRESE EL VALOR DEL INTERES MENSUAL EN %: ");
        interesmensual = teclado.nextDouble() / 100;
        System.out.println("INGRESE EL PLAZO DEL PRESTAMO EN MESES: ");
        plazomeses = teclado.nextDouble();
        pagomensual = (montoprestamo * interesmensual) / 1 - Math.pow(1 + interesmensual, - plazomeses);
        System.out.println("EL PAGO MENSUAL DEL PRESTAMO ES: " + pagomensual);
    }       
}
    

