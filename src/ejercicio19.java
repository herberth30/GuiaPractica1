import java.util.*;
//Convertir una frase a mayúsculas o minúsculas, que daremos opción a que el usuario lo
//pida y mostraremos el resultado por pantalla
public class ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la frase: ");
        String frase =  scanner.nextLine();
        System.out.println("Ingrese el numero de la opcion: ");
        System.out.println("1. Convertir en mayuscula ");
        System.out.println("2. Convertir en minuscula ");
        int formato =  scanner.nextInt();
        if (formato==1){
            System.out.println(frase.toUpperCase());
        }else if (formato==2){
            System.out.println(frase.toLowerCase());
        }else{
            System.out.println("La opcion existe");
        }
    }
}
