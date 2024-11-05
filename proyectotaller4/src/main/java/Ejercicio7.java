
import java.util.Scanner;


public class Ejercicio7 {
    public static void main(String[] args) {
        double planillaluz, costokxh, kconsumidos, edadu, valorbase, descuento;
        Scanner teclado = new Scanner(System.in);
        System.out.print("INGRESE EL VALOR DEL COSTO DE KILOVATIO POR HORA: ");
        costokxh = teclado.nextDouble();
        System.out.print("INGRESE EL NUMERO DE KILOVATIOS CONSUMIDOS: ");
        kconsumidos = teclado.nextDouble();
        System.out.print("INGRESE LA EDAD DEL USUARIO: ");
        edadu = teclado.nextDouble();
        valorbase = costokxh * kconsumidos;
        if (edadu > 65) {
        planillaluz = valorbase;
        System.out.println("EL VALOR A PAGAR DE LA PLANILLA DE LUZ ES: $ " + planillaluz);
        }
        else { 
        valorbase =  (costokxh * kconsumidos) * (0.9);
        planillaluz = valorbase;
        System.out.println("EL VALOR A PAGAR DE LA PLANILLA DE LUZ ES: $ " + valorbase);
        }        
    }
}
    


