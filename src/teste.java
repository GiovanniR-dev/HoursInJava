import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Quantos alunos tem na sala ? ");
        int Alunos=sc.nextInt();

        double somaNota=0.0;

        for (int i=1;i<=Alunos;i++) {
            System.out.print("Digite a note do aluno: "+ i+": ");
            double nota=sc.nextDouble();

            somaNota+=nota;

        }

        double media=somaNota/Alunos;

        System.out.println("Nota registrada: "+media);

        sc.close();


    }
}
