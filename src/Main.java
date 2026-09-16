import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);



        System.out.println("CONTA BANCARIA");
        System.out.print("Nome do dono: ");
        String nome=sc.nextLine();

        System.out.print("Numero da conta: ");
        int number=sc.nextInt();

        System.out.print("Saldo: ");
        double saldo=sc.nextDouble();

        System.out.print("Limite de saque: ");
        double limiteSaque=sc.nextDouble();

        Account acc=new Account(number,nome,saldo,limiteSaque);
        System.out.print("Valor para deposito: ");
        acc.deposit(sc.nextDouble());

        System.out.print("Valor para saque: ");
        acc.WithDraw(sc.nextDouble());

        System.out.print("Saldo final: "+acc.getBalance());
    }
}