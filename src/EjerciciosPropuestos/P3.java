package EjerciciosPropuestos;
import java.util.*;
public class P3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num1,num2;


        System.out.print("Introduce el primer número ");

        num1= teclado.nextInt();

        System.out.print("Introduce el segundo  número ");

        num2= teclado.nextInt();

        if(num1%num2==0)
            System.out.println("El primer numero es multiplo del segundo");

        else
            System.out.println("No son multiplos");
    }
}


