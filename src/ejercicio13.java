import java.util.Arrays;

//Crear un Array que almacene los siguientes valores A,G,H,B,J,I,R,Y,C,H,O,P,G,Z,H,I,D,S  y los ordene de menor a mayor

public class ejercicio13 {
    public static void main(String[] args) {
        String[] listaLetras = {"A","G","H","B","J","I","R","Y","C","H","O","P","G","Z","H","I","D","S"};

        Arrays.sort(listaLetras);

        for (String listaLetra : listaLetras) {
            System.out.println(listaLetra);
        }
    }
}
