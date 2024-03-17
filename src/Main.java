// Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
// aggiungi un anno
// sottrai un mese
// aggiungi 7 giorni
// Stampa il risultato localizzata per l'Italia

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main{
    public static void main(String[] args) {
        OffsetDateTime date1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime date2 = date1.plusYears(1).minusMonths(1).plusDays(7);
        String finalDate = date2.format(DateTimeFormatter.ofPattern("yyyy-MM-d", Locale.ITALY));

        //System.out.println("date1: " + date1);
        //System.out.println("date2: " + date2);
        System.out.println("finalDate: " + finalDate);
    }
}