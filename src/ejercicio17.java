import java.util.*;
/*
Crear una aplicación que nos pida un día de la semana y que nos diga si es un dia laboral
o no. Usa un switch para ello.
* */
public class ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el dia de la semana: ");
        System.out.println("Lunes - Martes - Miercoles - Jueves - Viernes - Sabado - Domingo");
        String dia = scanner.nextLine();

        switch (dia){
            case "Lunes","Martes","Miercoles", "Jueves","Viernes":
                System.out.println( dia + " es dia de trabajo.");
                break;
            case "Sabado","Domingo":
                System.out.println(dia+" es dia libre");
                break;
            default:
                System.out.println("Por favor ingrese un dia a la semana y verifique el formato es el correcto");
                System.out.println("Lunes - Martes - Miercoles - Jueves - Viernes - Sabado - Domingo");

        }

    }
}
