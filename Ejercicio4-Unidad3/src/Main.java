import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         /*Escribe un programa que pida un número n y determine si ese número es primo.
        Un número primo es aquel que solo es divisible entre 1 y sí mismo (por ejemplo, 2, 3, 5, 7, 11, etc.).
         El programa debe mostrar un mensaje indicando si el número es primo o no.
         */

        System.out.println(":::::::::::::Programa numeros primos::::::::::::::::::");
        System.out.println("\nIngrese un numero: ");

        int numero = sc.nextInt();

        boolean esPrimo = true;

        if (numero <= 1){
            esPrimo = false;
        } else if (numero == 2) {
            esPrimo = true;
        }else {
            for(int i = 2; i <= Math.sqrt(numero); i++){
                if (numero % i == 0){
                    esPrimo = false;
                    break;
                }
            }
        }
        System.out.println(numero + (esPrimo ? " es primo" : " no es primo"));
    }
}