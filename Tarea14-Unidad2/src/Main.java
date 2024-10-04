//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String correo = "juan.Perez@empresa.com";
        double fechadeAsceso = 2023-04-15;
        double Salario = 50000.75;

        //nombre y apellido
        int primerpunto = correo.indexOf(".");
        String nombre = correo.substring(0,primerpunto);


        int arroba = correo.indexOf("@");
        String apellido= correo.substring(primerpunto,arroba);

        //invertir nombre

        String nombreinvertido = nombre.replace(nombre,apellido)
                .replace("p","/")
                .replace("z","p")
                .replace("/","z");

        String apellidoInvertido = apellido.replace(apellido,nombre)
                .replace("j","/")
                .replace("u","")
                .replace("a","u")
                .replace("n","j")
                .replace("/","n")
                .replace("","a");


        System.out.println(nombreinvertido+ apellidoInvertido);



    }
}