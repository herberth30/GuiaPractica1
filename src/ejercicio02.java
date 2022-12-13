import java.util.*;
//Declara 2 variables numericas (con el valor que desees), he indica cual es el mayor de los dos
//Si son iguales indicarlo tambien.

public class ejercicio02 {
    public static void main(String[] args) {

        int num1, num2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer valor: ");
        num1=scanner.nextInt();
        System.out.println("Ingrese el segundo valor: ");
        num2=scanner.nextInt();

        if(num1>num2){
            System.out.println("El primer valor: " + num1 + ", es mayor que el segundo valor: " + num2);
        }else if (num1<num2){
            System.out.println("El primer valor: " + num1 + ", es menor que el segundo valor: " + num2);
        }else{
            System.out.println("Los dos valores son iguales");
        }

    }
}
