//Muestra los numeros del 1 al 100(ambos incluidos) divisible entre 2 y 3, utilice el bucle que desees
public class ejercicio09 {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            //Se verifica si es divisible entre 2 y 3:
            if(i%2==0 && i%3==0 ){
                    System.out.println(i);
            }
        }
    }
}
