import java.util.HashMap;

//Crear un Hash Map que permita listar todas las selecciones mundialistas de Qatar con el
//mejor jugador de cada selección
public class ejercicio21 {
    public static void main(String[] args) {
        HashMap<String,String>jugadorSeleccion = new HashMap<String,String>();
        jugadorSeleccion.put("Uruguay","Suarez");
        jugadorSeleccion.put("Canada","Eustaquio");
        jugadorSeleccion.put("Mexico","Alvarez");
        jugadorSeleccion.put("Estados Unidos","Pulisic");
        jugadorSeleccion.put("Costa Rica","Navas");
        jugadorSeleccion.put("Japon","Asano");
        jugadorSeleccion.put("Marruecos","Hakimi ");
        jugadorSeleccion.put("Argentina","Messi");
        jugadorSeleccion.put("Francia","Mbappe");
        jugadorSeleccion.put("Portugal","Ronaldo");
        jugadorSeleccion.put("Brasil","Neymar");
        jugadorSeleccion.put("Qatar ","Ali");

        for (String seleccion:jugadorSeleccion.keySet()){
            System.out.println("El mejor jugador de la seleccion de " + seleccion + " es: " + jugadorSeleccion.get(seleccion));
        }
    }
}
