import java.util.*;
/*
Pide por teclado dos números y genera 10 números aleatorios entre esos números.
Usa el método Math.random para generar un número entero aleatorio (recuerda el casting de
double a int)
*/
public class ejercicio18 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int primerNumero =  scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int segundoNumero =  scanner.nextInt();
        int rango = segundoNumero - primerNumero + 1;

        for (int i=0;i<10;i++){
            int numRandom = (int)(Math.random()*rango) ;
            System.out.println(numRandom);
        }

    }
}
