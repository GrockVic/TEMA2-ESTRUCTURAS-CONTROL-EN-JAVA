import java.util.Scanner;

public class P27 {

    public static void main(String[] args) {

        int opcion=0;
        do{

            Scanner teclado=new Scanner(System.in);
            System.out.println("Introduce una opción . Si eliges la opción 5 saldras del programa");
           opcion= teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Has elegido la opción 1");
                    break;
                case 2:
                    System.out.println("Has elegido la opción2");
                    break;
                case 3:
                    System.out.println("Has elegido la opción 3");
                    break;
                case 4:
                    System.out.println("Has elegido la opcion 4");
                    break;
                case 5:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Has de introducir un numero del 1 a 5");
            }


        }
        while (opcion!=5);
    }
}
