import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o comprimento da piscina: ");
        double comprimento = scanner.nextDouble();

        System.out.println("Informe a largura da piscina: ");
        double largura = scanner.nextDouble();

        System.out.println("Informe a profundidade da piscina: ");
        double profundidade = scanner.nextDouble();

        System.out.println("A piscina comporta: " + comprimento*largura*profundidade*1000 + "litros.");
    }
}
