package EjerciciosResueltos;

import java.util.Scanner;

//Pedir el radio de un circulo y calcular su área A=Pi*r^2
public class R1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.print("Introduce el radio del circulo:");

        double radio=teclado.nextDouble();

        double a=Math.PI*Math.pow(radio,2);


        System.out.println("El área de una circunferencia de radio " + radio + " es " + a);

    }
}
