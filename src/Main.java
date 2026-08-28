import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) throws ParseException {

        for(int i=0;i<=6;i++){
            System.out.println("oi");
        }

        int resultado = 0;
        int numero2 = 3;
        int numero1 = 6;

        for (int i = 0; i < numero2; i++) {
            resultado += numero1;
        }

        System.out.println(resultado);
    }
}