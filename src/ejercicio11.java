//Realizar una aplicacion que nos calcule una ecuacion de segundo grado. Debes pedir las variables a,b y c
 //por teclado y comprobar antes que el discriminante(operacion en la raiz cuadrada).
 //Para la raiz cuadrada usa el metodo sqlrt de math, usa mensajes de traza
import java.util.*;
public class ejercicio11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a,b,c;
        System.out.println("Digite el valor de a: ");
        a= leer.nextInt();
        System.out.println("Digite el valor de b: ");
        b= leer.nextInt();
        System.out.println("Digite el valor de c: ");
        c= leer.nextInt();

        double discriminante = Math.pow(b,2) -(4*a*c);
        System.out.println("descriminante: " + discriminante);

        if (discriminante<0){
            System.out.println("La ecuacion no tiene solucion real");
        }else{

            double x1 = (-b + Math.sqrt(discriminante))/(2*a);
            double x2 = (-b - Math.sqrt(discriminante))/(2*a);
            System.out.println("Las soluciones de la ecuacion x1 = " + x1 +" y x2= " + x2);
        }
    }
}
