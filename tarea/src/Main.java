import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*Escribe un programa que pida al usuario ingresar una cantidad de números (primero solicita la cantidad).
         Luego, el programa debe pedir los números y calcular su promedio. Si el promedio es mayor que 7, debe mostrar
         "Aprobado", y si es menor o igual a 7, debe mostrar "Reprobado".
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su promedio final");
        double n = sc.nextDouble();

        if (n <= 7){
            System.out.println("Usted esta reprobado");
        }else{
            System.out.println("Usted esta aprobado");
        }

    }
}