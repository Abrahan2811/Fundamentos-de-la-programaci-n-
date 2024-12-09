import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Media de un arreglo
        System.out.println("Ingresa el tamaño del arreglo: ");
        int t = sc.nextInt();

        int arr[]= new int[t];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Ingresa el valor del arreglo: ");
            arr[i] = sc.nextInt();
        }

        int media = cM(arr);
        System.out.println("La media del arreglo es: " + media);

    }
    public  static int cM (int arr []){
        int suma = 0;
        int arre = arr.length;
        for (int i = 0; i < arre; i++) {
            suma += arr[i];
        }
        int media = suma / arre;
        return media;
    }
}