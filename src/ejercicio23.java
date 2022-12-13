import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Scanner;
import java.util.Date;
//Pedir dos fechas y mostrar el número de días que hay de diferencia.
public class ejercicio23 {
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la primer fecha en formato yyyy-mm-dd");
        String primerFecha = scanner.nextLine();

        System.out.println("Ingrese la segunda fecha en formato yyyy-mm-dd");
        String segundaFecha = scanner.nextLine();

        LocalDate fechaUno = LocalDate.parse(primerFecha);
        LocalDate fechaDos = LocalDate.parse(segundaFecha);

        //ChronoUnit.DAYS.between: se utiliza para determinar el número de días entre dos fechas
        long numeroDias = ChronoUnit.DAYS.between( fechaUno, fechaDos);

        System.out.println("Hay " + numeroDias + " dias de diferencia");
    }
}
