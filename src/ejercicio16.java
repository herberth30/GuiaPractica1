import java.util.*;
/*
Escribe una aplicación con un String que contenga una contraseña cualquiera. Después
se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no pedirá
más la contraseña y mostrará un mensaje diciendo «Enhorabuena».
 Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque le queden
intentos)
*/
public class ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contraSistema = "123456";
        int intentos = 3;
        while (intentos>0){
            System.out.println("Ingrese la contrasena tienes " + intentos + " intentos: ");
            String contraUsuario = scanner.nextLine();

            if (contraSistema.equals(contraUsuario)){
                System.out.println("Enhorabuena");
                break;
            }else {
                System.out.println("Contrasena incorrecta");
            }
            intentos--;
        }
        if(intentos==0){
            System.out.println("Lo siento, se agotaron los intentos");
        }

    }
}
