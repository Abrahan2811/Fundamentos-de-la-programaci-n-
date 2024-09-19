import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Ingrese la coordenada x del primer punto: ");
        double xUno = input.nextDouble();
        System.out.println("Ingrese la coordenada y del primer punto: ");
        double yUno = input.nextDouble();
        System.out.println("Ingrese la coordenada x del segundo punto: ");
        double xDos = input.nextDouble();
        System.out.println("Ingrese la coordenada y del segundo punto: ");
        double yDos = input.nextDouble();

        double distancia = Math.sqrt(Math.pow(xDos - xUno, 2) + Math.pow(yDos - yUno, 2));

        System.out.println("La distancia entre los puntos es: " + distancia);

        // Calculamos angulo entre la coordenada y el eje x
        /* Math.atan2 se utiliza para calcular el angulo en radianes entre el eje positivo "x" y el punto (x, y).
        Asi convertimos coordenadas cartesianas (x, y) en coordenadas polares (r, 0).
         */

        double xDelta = xDos - xUno;
        double yDelta = yDos - yUno;

        double anguloRadianes = Math.atan2(xDelta, yDelta);
        System.out.println("Ángulo en radianes: " + anguloRadianes);

        // Convertimos de radianes a grados
        /* Math.toDegrees nos ayuda a convertir un angulo en radianes a grados. Esto es util cuando necesitamos
        trabajar con ángulos en lugar de radianes como este caso.
         */

        double anguloGrados = Math.toDegrees(anguloRadianes);
        System.out.println("Ángulo en grados: " + anguloGrados);

    }
}