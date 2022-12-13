import java.util.ArrayList;
import java.util.Scanner;

//Escribe un programa que lea números enteros y los guarde en un ArrayList hasta que se
//lea un 0 y muestra los números leídos, su suma y su media
public class ejercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int numero;

        do {
            System.out.println("Ingrese un numero: ");
            numero = scanner.nextInt();
            numeros.add(numero);
        }while (numero!=0);


        for (int num:numeros){
            System.out.println(num);
        }
    }
}
