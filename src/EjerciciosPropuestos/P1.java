package EjerciciosPropuestos;

import java.util.Scanner;

public class P1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero para ver si es par: ");
        int numero= teclado.nextInt();

        if(numero%2==0){

            System.out.println("El numero es par");
        }

        else
            System.out.println("El numero no es par");

    }
}
