import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do lado do quadrado (1 a 20): ");
        int tamanho = scanner.nextInt();

        if (tamanho >= 1 && tamanho <= 20) {

            for (int linha = 1; linha <= tamanho; linha++) {

                for (int coluna = 1; coluna <= tamanho; coluna++) {
                    System.out.print("*");
                }

                System.out.println();
            }

        } else {
            System.out.println("Digite um tamanho entre 1 e 20.");
        }

        scanner.close();
    }
}