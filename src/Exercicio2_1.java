public class Exercicio2_1 {
    public static void main(String[] args) {
        int[] numeros = {10, 2, 4, 67, 81, 92, 10, 4, 71, 14};

        int i = 0;
        int soma = 0;

        for (int numero : numeros) {
            if (i % 2 == 0) {
                i += numero;

            }
        }

        System.out.println(i);

    }
}

