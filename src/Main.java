import java.util.Scanner;

public class Main{
    static void main() {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int n=sc.nextInt();
        int valortemp=0;
        boolean pula=true;

        for (int i = 0; i < n; i++) {
            int altura=sc.nextInt();

            if (altura-valortemp>p){
            pula=false;
            break;
            }
            valortemp=altura;
        }
        if (pula){
            System.out.println("You win");
        } else {
            System.out.println("You lose");
        }
    }
}