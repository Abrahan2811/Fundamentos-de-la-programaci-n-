import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("::::::::::::::::::::::Programa numero aleatorio::::::::::::::::::::::::");

        int numAleatorio = (int) (Math.random() * 100);
        boolean Correcto = false;

        while (!Correcto) {
            System.out.println("\nIntenta adivinar el numero entre 0-100 :)");
            int intento = sc.nextInt();
            if (intento == numAleatorio) {
                System.out.println("Felicidades lo conseguiste");
                Correcto = true;
            } else if (intento < numAleatorio) {
                System.out.println("El numero es mas grande");
            } else {
                System.out.println("El numero es mas pequeño");
            }
        }
    }
}