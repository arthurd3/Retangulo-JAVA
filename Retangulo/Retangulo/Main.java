import java.util.Scanner;

public class Main
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o Comprimento");
        double comprimento = scanner.nextDouble();
        System.out.println("Digite o Largura");
        double largura = scanner.nextDouble();
        Retangulo retangulo = new Retangulo (comprimento , largura);
        
        System.out.println("Area Calculada "+ retangulo.calcularArea());
        System.out.println("Perimetro Calculado "+ retangulo.calcularPerimetro());
        
        scanner.close();
    }
}
