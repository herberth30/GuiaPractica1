
/*
Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100.
Obtén la suma de todos ellos y la media.
*/
public class ejercicio25 {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        int sumTotal=0;

        for(int i = 0;i<numeros.length;i++){
            numeros[i]=i+1;
            System.out.println(numeros[i]);
            sumTotal = numeros[i] + sumTotal;
        }
        System.out.println("--------------------------");
        System.out.println("Total: "+ sumTotal);
        System.out.println("Media: "+ sumTotal/numeros.length);
        System.out.println("--------------------------");
    }
}
