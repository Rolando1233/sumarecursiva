import java.util.Scanner;

public class SumaRecursivaCuadrados {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el límite inferior: ");
        int limiteInferior = scanner.nextInt();
        System.out.print("Introduce el límite superior: ");
        int limiteSuperior = scanner.nextInt();

        if (limiteInferior > limiteSuperior) {
            System.out.println("El límite inferior debe ser menor o igual al límite superior.");
        } else {
            int resultado = sumaRecursivaCuadrados(limiteInferior, limiteSuperior);
            System.out.println("La suma de los cuadrados dentro del rango es: " + resultado);
        }
    }

    public static int sumaRecursivaCuadrados(int limiteInferior, int limiteSuperior) {
        if (limiteInferior == limiteSuperior) {
            return limiteInferior * limiteInferior;
        } else {
            int cuadradoActual = limiteInferior * limiteInferior;
            int sumaRecursiva = sumaRecursivaCuadrados(limiteInferior + 1, limiteSuperior);
            return cuadradoActual + sumaRecursiva;
        }
    }
}