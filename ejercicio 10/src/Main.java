import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

         /*Escribe un programa que pida tres números y los ordene de menor a mayor.
        El programa debe usar estructuras de control if y no puede utilizar funciones de ordenamiento predefinidas.

        Ejemplo:
        Si el usuario ingresa los números 8, 3 y 5, el programa debe mostrar: 3, 5, 8.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("::::::::::::::::::::::Programa que ordena menor a mayor::::::::::::::::::::.");

        int numUno,numDos,numTres;

        System.out.println("Ingrese 3 numeros");
        numUno = sc.nextInt();
        numDos = sc.nextInt();
        numTres = sc.nextInt();

        if(numUno < numDos && numUno < numTres && numDos < numTres ) {
            System.out.println(numUno + "," + numDos + "," + numTres);
        }else if (numDos < numUno && numDos < numTres && numUno < numTres){
            System.out.println(numDos + "," + numUno + "," + numTres);
        }else if (numDos < numUno && numDos < numTres && numTres < numUno){
            System.out.println(numDos + "," + numUno + "," + numTres);
        }else if(numTres < numUno && numTres < numDos && numUno < numDos ){
            System.out.println(numTres + "," + numUno + "," + numDos);
        }else{
            System.out.println("ves");
        }


    }
}