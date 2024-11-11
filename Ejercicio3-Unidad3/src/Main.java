import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Escribe un programa que imprima la secuencia de Fibonacci hasta un número n que ingrese el usuario.
         La secuencia de Fibonacci es: 0, 1, 1, 2, 3, 5, 8, 13, ....
         El programa debe pedir el número n y mostrar todos los números de Fibonacci menores o iguales a n.
         */

        System.out.println("Ingrese el tope de la serie Fibonacci");
        int tope = sc.nextInt();
        int contador = 0;
        int contadorDos = 1;

        if (tope == 0) {
            System.out.println("Ingresa un numero mas grande para hacer algo");
        }else {
            while (contador <= tope) {


                System.out.println(contador);
                if (contadorDos <= tope) {
                    System.out.println(contadorDos);
                }
                contador += contadorDos;
                contadorDos += contador;

            }

        }
    }
}