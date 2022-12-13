import java.util.*;
//Lee un número por teclado y comprueba que este número es mayor o igual que cero, si
//no lo es lo volverá a pedir (do while), después muestra ese número por consola
public class ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = -1;
        do {
            System.out.println("Ingrese un numero");
            num = scanner.nextInt();

        }while (num<0);
        System.out.println("El numero que ingreso fue: " + num);
    }
}
