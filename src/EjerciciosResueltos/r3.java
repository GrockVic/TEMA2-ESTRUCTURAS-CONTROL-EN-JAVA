package EjerciciosResueltos;

import java.util.Scanner;

public class r3 {

    public static void main(String[] args) {


        int num1,num2;


        Scanner teclado= new Scanner(System.in);

        System.out.print("Introduce el primer número ");

        num1= teclado.nextInt();

        System.out.print("Introduce el segundo número ");

        num2=teclado.nextInt();

        if(num1>num2)
            System.out.println("El primer número introducido " + num1 + " es superior al segundo " + num2);

        else
            System.out.println("El segundo número introducido " + num2 + " es superior al primero " + num1);

    }
}
