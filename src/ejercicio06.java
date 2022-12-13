import javax.security.sasl.SaslClientFactory;
import java.util.*;
//Lee un numero por teclado e indique si es divisible entre dos(resto = 0)
//Si no lo es tambien indicarlo
public class ejercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Introduce un numero " );
        int numero = scanner.nextInt();

        if(numero%2==0){
            System.out.println("El numero es divisible entre dos ");
        }else{
            System.out.println("El numero no es divisible entre dos ");
        }
    }
}
