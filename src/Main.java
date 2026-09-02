import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class Main{

    private final static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {

        int opcao;
        GeometricArea geometricArea=null;

        while (true){
            System.out.println("Escolha a forma geometrica para calcular a area: ");
            System.out.println("1- Quadrado");
            System.out.println("2- Retangulo");
            System.out.println("3- Circulo");
            System.out.println("4- Sair do programa");
            opcao=scanner.nextInt();

            if (opcao ==1) {
                geometricArea=createSquare();
            } else if (opcao ==2){
                geometricArea=createRectangle();
            } else if (opcao ==3) {
                geometricArea=createCircle();
            } else if (opcao == 4) {
                break;
            } else {
                System.out.print("opcao invalida");
                continue;
            }
            System.out.println("A area do resultado do calculo da area foi de: "+geometricArea.getArea());

        }

    }

    private static GeometricArea createSquare(){
        System.out.println("Informe os tamanhos dos lados: ");
        var side=scanner.nextDouble();
        return new square(side);
    }

    private static GeometricArea createRectangle(){
        System.out.println("Informe os tamanhos dos base: ");
        var base=scanner.nextDouble();
        System.out.println("Informe os tamanhos dos altura: ");
        var heigh=scanner.nextDouble();
        return new Rectangle( heigh, base);
    }

    private static GeometricArea createCircle(){
        System.out.println("Informe os tamanhos dos raio: ");
        var radius=scanner.nextDouble();
        return new Circle(radius);

    }
}