import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class ManejoFechas {
    public static void main(String[] args) {
        //fecha de hoy
        LocalDate hoy = LocalDate.now();
        System.out.println("La fecha actual es : " + hoy);

        //dia mes anio
        System.out.println("--------");
        //LocalDate hoy = LocalDate.now();
        int year = hoy.getYear();
        int month = hoy.getMonthValue();
        int day = hoy.getDayOfMonth();
        System.out.printf("Año : %d Mes : %d Día : %d \t %n", year, month, day);

        //fecha concreta
        System.out.println("--------");
        LocalDate nacimiento = LocalDate.of(1982, 9, 18);
        System.out.println("Tu fecha de nacimiento es : " + nacimiento);

        //fechas iguales
        System.out.println("--------");
        LocalDate fecha = LocalDate.of(2017, 11, 11);
        //LocalDate hoy = LocalDate.now();
        if (fecha.equals(hoy)) {
            System.out.printf("Hoy %s y la fecha %s son la misma fecha", hoy, fecha);
        } else {
            System.out.println("Las fechas no son iguales");
        }

        //evento recurente
        System.out.println("--------");
        LocalDate nacimientoMio = LocalDate.of(2017, 11, 11);
        MonthDay diaNacimiento = MonthDay.of(nacimientoMio.getMonth(), nacimientoMio.getDayOfMonth());
        MonthDay diaMesHoy = MonthDay.from(LocalDate.now());
        if (diaMesHoy.equals(diaNacimiento)) {
            System.out.println("Muchas felicidades, porque es tu cumpleaños");
        } else {
            System.out.println("Lo siento, pero no es tu cumpleaños");
        }

        //hora actual
        System.out.println("--------");
        LocalTime time = LocalTime.now();
        System.out.println("La hora actual es : " + time);

        //añadir horas
        System.out.println("--------");
        //LocalTime time = LocalTime.now();
        LocalTime newTime = time.plusHours(2); // añadiendo dos horas
        System.out.println("Hora, después de 2 horas : " + newTime);

        //una semana después
        System.out.println("--------");
        LocalDate nextWeek = LocalDate.now().plus(1, ChronoUnit.WEEKS);
        System.out.println("Hoy es : " + LocalDate.now());
        System.out.println("Dentro de 1 semana: " + nextWeek);

        //fecha hace un año
        System.out.println("--------");
        LocalDate today = LocalDate.now();
        LocalDate previousYear = today.minus(1, ChronoUnit.YEARS);
        System.out.println("Fecha hace un año: " + previousYear);
        LocalDate nextYear = today.plus(1, ChronoUnit.YEARS);
        System.out.println("Fecha dentro de 1 año : " + nextYear);

        //comparar fechas
        System.out.println("--------");
        //LocalDate today = LocalDate.now();
        LocalDate otraFecha = LocalDate.of(2017, 12, 24);
        if (otraFecha.isAfter(today)) {
            System.out.println("La otra fecha es posterior a la de hoy");
        }
        LocalDate ayer = today.minus(1, ChronoUnit.DAYS);
        if (ayer.isBefore(today)) {
            System.out.println("Ayer es anterior a hoy");
        }

        //fechas fijas
        System.out.println("--------");
        YearMonth anioYMesActual = YearMonth.now();
        System.out.printf("Días en la clase MonthYear %s: %d%n", anioYMesActual, anioYMesActual.lengthOfMonth());
        YearMonth caducidadTarjetaCredito = YearMonth.of(2018, Month.FEBRUARY);
        System.out.printf("Su tarjeta de crédito caduca en %s ", caducidadTarjetaCredito);

        //año bisiesto
        System.out.println("--------");
        //LocalDate today = LocalDate.now();
        if (today.isLeapYear()) {
            System.out.println("Este año es bisiesto");
        } else {
            System.out.println("Este año no es bisiesto");
        }

        //periodo
        System.out.println("--------");
        LocalDate java8Release = LocalDate.of(2014, Month.MARCH, 14);
        LocalDate java9Release = LocalDate.of(2017, Month.SEPTEMBER, 27);
        Period periodToNextJavaRelease = Period.between(java8Release, java9Release);
        System.out.println("Meses transcurridos entre la liberación de Java 8 y Java 9 : " + periodToNextJavaRelease.toTotalMonths());

        //parse format
        System.out.println("--------");
        String diaDespuesDeHoy = "20171112";
        LocalDate formateada = LocalDate.parse(diaDespuesDeHoy, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.printf("La fecha generada de un String %s es %s %n", diaDespuesDeHoy, formateada);

        String viernes = "18/04/2014";
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate holiday = LocalDate.parse(viernes, formatter);
            System.out.printf("Cadena formateada correctamente %s, la fecha es %s%n", viernes, holiday);
        } catch (DateTimeParseException ex) {
            System.out.printf("%s no es parseable!%n", viernes);
            ex.printStackTrace();
        }

        //convertir fecha en string
        System.out.println("--------");
        LocalDateTime fechaLlegada = LocalDateTime.now();
        try {
            DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm");
            String landing = fechaLlegada.format(format);
            System.out.printf("Llegada a : %s %n", landing);
        } catch (DateTimeException ex) {
            System.out.printf("%s no puede ser formateada!%n", fechaLlegada);
            ex.printStackTrace();
        }

        // Comprobamos si una fecha es anterior a otra
        System.out.println("--------");
        if (otraFecha.isAfter(today)) {
            System.out.println("La otra fecha es posterior a la de hoy");
        }

        // Obtenemos la fecha de ayer, restando un día a la de hoy
        System.out.println("--------");
        LocalDate ayerr = today.minus(1, ChronoUnit.DAYS);
        if (ayerr.isBefore(today)) {
            System.out.println("Ayer es anterior a hoy");
        }

        // Es el año actual bisiesto?
        System.out.println("--------");
        System.out.println("El año actual " + (LocalDate.now().isLeapYear() ? "sí" : "no") + " es bisiesto");

        // Imprimimos el valor de otraFecha con su transformación por defecto
        System.out.println(otraFecha);

        // Ahora, lo imprimimos formateando la misma a un formato LARGO
        System.out.println(otraFecha.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));

        // Por último, imprimimos la fecha de hoy en un formato proporcionado en una cadena
        System.out.println(otraFecha.format(DateTimeFormatter.ofPattern("dd/MM/yy")));
    }
}
