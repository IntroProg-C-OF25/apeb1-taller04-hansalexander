
import java.util.Scanner;


public class Ejercicio8 {
    public static void main(String[] args) {
        double vtotal, netflix, youtube, dropbox, spotify, costocuentas, costototal, edadu;
        Scanner teclado = new Scanner(System.in);
        System.out.print("INGRESE EL COSTO MENSUAL DE SU CUENTA DE NETFLIX: ");
        netflix = teclado.nextDouble();
        System.out.print("INGRESE EL COSTO MENSUAL DE SU CUENTA DE YOUTUBE PREMIUM: ");
        youtube = teclado.nextDouble();
        System.out.print("INGRESE EL COSTO MENSUAL DE SU CUENTA DE DROPBOX: ");
        dropbox = teclado.nextDouble();
        System.out.print("INGRESE EL COSTO MENSUAL DE SU CUENTA DE SPOTIFY: ");
        spotify = teclado.nextDouble();
        System.out.print("INGRESE SU EDAD: ");
        edadu = teclado.nextDouble();
        costocuentas = netflix + youtube + dropbox + spotify;
        if (edadu > 30) {
        costocuentas = netflix + youtube + dropbox + spotify;    
        costototal = costocuentas;
        System.out.println("EL VALOR TOTAL MENSUAL A PAGAR ES: " + costototal);
        }
        else {
        costocuentas = netflix + youtube + dropbox + spotify * (20/100);
        costototal = costocuentas;
        System.out.println("EL VALOR TOTAL MENSUAL A PAGAR ES: " + costocuentas);        
                }        
    }
    
}
    


