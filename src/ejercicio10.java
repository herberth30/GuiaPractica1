import java.util.*;
//Realizar una aplicacion que nos pida un numero de ventas a introducir, despues nos pedira tantas
// ventas por teclado como numero de ventas se haya indicado.
// Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no
public class ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el numero de ventas: ");
        int numeroVentas = scanner.nextInt();
        double sumaVentas=0;
        for(int i=1;i<=numeroVentas;i++){
            System.out.println("Introduce la venta numero: "+i);
            double venta= scanner.nextDouble();
            sumaVentas+=venta;
        }
        System.out.println("Total: " + sumaVentas);
    }
}
