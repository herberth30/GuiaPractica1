import java.util.Scanner;
//Modifica el ejercicio anterior, para que nos pida el nombre que queremos introducir
public class ejercicio04 {
    public static void main(String[] args) {
        String nombre;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cual es tu nombre: ");
        nombre = scanner.nextLine();
        System.out.println("BIENVENID@ " + nombre);
    }
}
