import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         /*Escribe un programa que pida al usuario un número n y luego lea n números.
         El programa debe contar cuántos de esos números son pares y cuántos son impares.
          Al final, debe mostrar el conteo de números pares e impares.
         */

        System.out.println("Ingreseun numero entero");
        int numero = sc.nextInt();
        int contador = 0;
        int pares = 0;
        int impares = 0;

        while (contador < numero){
            contador++;
            if ( (contador % 2)== 0){
                pares++;
            }else{
                impares++;
            }
        }
        System.out.println("Total de pares: " + pares);
        System.out.println("Total de impares: " + impares);
    }
}