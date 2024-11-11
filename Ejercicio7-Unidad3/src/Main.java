import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("::::::::::::::::::::Programa identifica palindromos:::::::::::::::::::::");
        System.out.println("\nIngrese una numero");

        String numero;
        int Izq, Der;
        char[] palindromo;


        numero = sc.nextLine();
        palindromo = numero.toCharArray();
        Izq = 0;
        Der = numero.length() - 1;

        while (Izq < Der) {
            if (palindromo[Izq] == palindromo[Der]) {
                Izq++;
                Der--;
            } else {
                System.out.println("el numero no es palindormo");
                break;
            }


        }
        if (Izq == Der) {
            System.out.println("Es palindromo");
        }
    }
}