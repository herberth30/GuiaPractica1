import java.util.*;

//Haz una aplicacion que calcule el area de un circulo (pi*R2).
// El radio se usa la constante PI y el metodo pow de Math

public class ejercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radio;
        System.out.println("Introduce el radio del circulo: " );
        radio = scanner.nextDouble();

        double area= Math.PI*Math.pow(radio,2);
        //%.2f : formato de dos decimales
        System.out.printf("El area del circulo es: %.2f", area);
    }
}
