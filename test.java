import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        while (true) {
            LocalTime currentTime = LocalTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            String formattedTime = currentTime.format(formatter);

            System.out.print("Aktualny czas: " + formattedTime);

            try {
                Thread.sleep(1000); //1 sekunda
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}