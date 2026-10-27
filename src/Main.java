import java.util.Scanner;

public class Main{
    static void main() {
        Scanner sc=new Scanner(System.in);
        int t1=sc.nextInt();
        int t2=sc.nextInt();
        int t3=sc.nextInt();
        int t4=sc.nextInt();

        int resultado=(t1+t2+t3+t4)- 3;
        System.out.println(resultado);
    }
}