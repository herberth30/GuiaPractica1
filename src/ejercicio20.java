import java.util.HashMap;
//Crear un Hash Map que permita mostrar la lista de 5 países y sus respectivas capitales
public class ejercicio20 {
    public static void main(String[] args) {
        HashMap<String,String> capitalesCiudades = new HashMap<String,String>();

        capitalesCiudades.put("El Salvador","San Salvador");
        capitalesCiudades.put("Alemania", "Berlin");
        capitalesCiudades.put("Estados Unidos","Washington DC");
        capitalesCiudades.put("Mexico","CDMX");
        capitalesCiudades.put("Canada","Ottawa");

        for (String pais:capitalesCiudades.keySet()){
            System.out.println("Pais: " + pais + " | Ciudad: " +capitalesCiudades.get(pais));
        }
    }
}
