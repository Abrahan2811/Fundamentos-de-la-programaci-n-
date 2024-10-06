//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String cadena ="Carlos Martinez|192.168.0.1|12345.";

        int primerEspacio = cadena.indexOf(" ");
        int primerPalito = cadena.indexOf("|");
        int ultimoPalit = cadena.lastIndexOf("|");

        //PrimeraParte
        String nombre = cadena.substring(0,primerEspacio);
        String apellido = cadena.substring(primerEspacio+1,primerPalito);
        String nombreCompleto = nombre + " " + apellido;

        String nombreCifrado = nombreCompleto.replace('a','1')
                .replace('e','2')
                .replace('i','3')
                .replace('o','4')
                .replace('u','5');

      char primerCaracter = nombreCifrado.charAt(0);
      char ultimoCaracter = nombreCifrado.charAt(nombreCompleto.length()-1);
        nombreCifrado.replace((char) 0, ultimoCaracter);
        nombreCifrado.replace((char) (nombreCifrado.length() - 1), primerCaracter);

        //System.out.println(nombreCifrado);
        //Segunda parte

        String IP = cadena.substring(primerPalito+1,ultimoPalit);
        String primerNum = IP.substring(0,3),
                segundoNum = IP.substring(4,7),
                tercerNum = IP.substring(8,9),
                cuarNum = IP.substring(10);
        //System.out.println(primerNum+" "+segundoNum+" "+tercerNum+" "+cuarNum);

        String hexadeUno = Integer.toHexString(Integer.valueOf(primerNum));
        String hexadeDos = Integer.toHexString(Integer.valueOf(segundoNum));
        String hexadeTres = Integer.toHexString(Integer.valueOf(tercerNum));
        String hexadeCuatro = Integer.toHexString(Integer.valueOf(cuarNum));

        String IPHexa = hexadeUno + "." + hexadeDos + "." + hexadeTres + "." + hexadeCuatro;


        //Parter tres

        String NoCliente = cadena.substring(ultimoPalit+1,cadena.length()-1);
        double NoFormula = (Integer.valueOf(NoCliente) * 3 +15)/(2);
       // System.out.println(NoFormula);


        //FINAL :D
        System.out.println(nombreCifrado+ "|" +IPHexa+ "|" +NoFormula);


    }
}