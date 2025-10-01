package EjerciciosPropuestos;

import java.util.Scanner;

public class R2 {
    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);

        System.out.print("Introduce el primer número ");

        int n1= teclado.nextInt();

        System.out.print("Introduce el segundo número ");
        int n2= teclado.nextInt();

        if(n1>n2)

            System.out.println("n1 " + n1 + " es mayor que n2 " +n2);

        else if (n2>n1)

            System.out.println("n2 " + n2 + " es mayor que n1 " +n1);



        else
            System.out.println("Los números son iguales");
    }
}
