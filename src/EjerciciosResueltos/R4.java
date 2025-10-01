package EjerciciosResueltos;

import java.util.Scanner;

public class R4 {

    public static void main(String[] args) {
  int u,d,c,um,dm,num;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el número que quieres mostrar al reves: ");

        num= teclado.nextInt();

        u=num%10;
        num=num/10;


        d=num%10;
        num=num/10;

        c=num%10;
        num=num/10;

        um=num%10;
        num=num/10;

        dm=num;

        System.out.println(u + " " + d + " " + c + " "  + um+ " " + dm);

        System.out.println(num);
    }
}
