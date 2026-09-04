import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String operacao = sc.nextLine();

        if (operacao.equals("DEPOSITO") ||
            operacao.equals("SAQUE") ||
            operacao.equals("TRANSFERENCIA")) {

            System.out.println("VALID");

        } else {
            System.out.println("INVALID");
        }

        sc.close();
    }
}
