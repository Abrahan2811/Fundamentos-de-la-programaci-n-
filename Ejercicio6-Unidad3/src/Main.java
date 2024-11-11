import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Escribe un programa que pida un número n y muestre todos sus divisores.
        Los divisores son aquellos números que dividen de forma exacta a n.
        Si no hay divisores (como en el caso de un número primo),
        debe mostrar un mensaje que indique que el número no tiene divisores aparte de 1 y él mismo.

        Ejemplo:
        Si el usuario ingresa n = 12, el programa debe mostrar: 1, 2, 3, 4, 6, 12.*/

        System.out.println(":::::::::::::::::::Programa que muestra los njmeros divisores:::::::::::::::");
        System.out.println("\nIngresa un numero");

        int numero,contador,vecesimprimido;
        numero = sc.nextInt();
        contador = 0;
        vecesimprimido = 0;
        boolean s = false;

        while (contador < numero) {
            contador++;
            if ((numero % contador == 0) ) {
                System.out.println(contador);
                vecesimprimido++;
                if(vecesimprimido == 2){
                    System.out.println("No tiene divisores aparte del 1 y si mismo");
                    break;
                }
            }
        }
    }
}