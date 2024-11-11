import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         /*Escribe un programa que pida al usuario un número y un rango,
         y luego imprima la tabla de multiplicar de ese número desde 1 hasta el número ingresado como rango.
          Por ejemplo, si el usuario ingresa el número 3 y el rango 5, debe mostrar:

           3 x 1 = 3
           3 x 2 = 6
           3 x 3 = 9
           3 x 4 = 12
           3 x 5 = 15*/

        System.out.println("::::::::::::::::::::::::Tabla de multiplicar:::::::::::::::::::::::::::::::::");

        int numero,rango;
        System.out.println("\nIngresa un numero");
        numero = sc.nextInt(); //3
        System.out.println("\nIngresa un rango");
        rango = sc.nextInt();


        for(int i = 1; i <= rango; i++){
            System.out.println("\n"+ numero + "x" + i + "=" + (numero*i) );
        }
    }
}