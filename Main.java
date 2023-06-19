import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Witaj w testowym pliku!");
        
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
        //Wypisywanie aktualnej godziny
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Aktualna godzina: " + formattedDateTime);

    }
}