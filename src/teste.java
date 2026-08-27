import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n1= sc.nextInt();

        System.out.print("\nNumeros pares: ");

        for (int i=1;i<=n1;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }

        System.out.print("\nNúmeros ímpares:");

        for(int i=1;i<=n1;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }

        sc.close();

    }
}
