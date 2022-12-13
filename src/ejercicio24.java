import java.util.Scanner;

/*
Crea un array de 10 posiciones de números con valores pedidos por teclado. Muestra por
consola el indice y el valor al que corresponde. Haz dos métodos, uno para rellenar
valores y otro para mostrar
*/
public class ejercicio24 {
    public static void main(String[] args) {

        int[] numeros = new int[10];

        rellenar(numeros);
        mostrar(numeros);
    }

    private static void rellenar(int[] numeros) {
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<numeros.length;i++){
            System.out.println(" ingrese un numero ");
            numeros[i] = scanner.nextInt();
        }
    }

    private static void mostrar(int[] numeros) {
        for (int i=0; i<numeros.length; i++){
            System.out.println("Posicion: " + i + " numero: " + numeros[i]);
        }
    }

}
