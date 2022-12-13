import java.util.*;
//Declara dos variables numéricas (con el valor que desees),
//muestra por consola la suma, resta, multiplicacion, división y modulo

public class ejercicio01 {
    public static void main(String[] args) {
        double num1, num2, resSuma, resResta, resDivision, resMultiplicacion, resModulo;
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Ingrese el primer numero: " );
        num1=scanner.nextInt();
        System.out.println(" Ingrese el segundo numero: " );
        num2=scanner.nextInt();

        resSuma = num1+num2;
        resResta = num1-num2;
        resMultiplicacion = num1*num2;

        System.out.println(" ------ RESULTADO ------ ");
        System.out.println(" Suma: " + resSuma);
        System.out.println(" Resta: " + resResta);
        System.out.println(" Multiplicacion: " + resMultiplicacion);


        if (num2!=0) {
            resModulo=num1%num2;
            resDivision = num1 / num2;

            System.out.println(" Modulo: " + resModulo);
            System.out.println(" Division: " + resDivision);
        }else{
            System.out.println(" No se puede dividir entre cero. ");
        }
    }


}
