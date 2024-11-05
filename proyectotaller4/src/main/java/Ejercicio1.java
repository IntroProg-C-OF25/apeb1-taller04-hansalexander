
import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) {
        double base, altura, area;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dame la base: ");
        base = teclado.nextDouble();
        System.out.print("Dame la altura: ");
        altura= teclado.nextDouble();
        area = (base * altura) / 2;
        System.out.println("Area del triangulo es: " + area);
    }
}

