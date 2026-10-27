import java.util.Scanner;

public class Main{
    static void main() {
        Scanner sc=new Scanner(System.in);

        while (sc.hasNext()){
            int quantia=sc.nextInt();
            int rapida=0;
            for (int i = 0; i < quantia; i++) {
                int lesma=sc.nextInt();
                if (lesma>rapida){
                    rapida=lesma;
                }
            }
            if (rapida<10){
                System.out.println(1);
            } else if (rapida>=10 && rapida<20) {
                System.out.println(2);
            } else {
                System.out.println(3);
            }
        }
    }
}