import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        //Powitanie z nazwą użytkownika
        String username = System.getProperty("user.name");
        System.out.println("Witaj, " + username);

        //Wypisywanie aktualnej godziny
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Aktualna data i godzina: " + formattedDateTime);

        //Wyświetlenie systemu operacyjnego
        String osName = System.getProperty("os.name");
        System.out.println("System operacyjny: " + osName);

        //Wyświetlenie wersji Javy
        String javaVersion = System.getProperty("java.version");
        System.out.println("Wersja Javy: " + javaVersion);
    }
}