import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        int num;
        long fat;
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o número inteiro que deseja calcular o fatorial: ");
        num = leitura.nextInt();

        long initRecursivo = System.nanoTime();
        fat = fatorialRecursivo(num);
        long finalRecursivo = System.nanoTime();
        fat = fatorialIterativo(num);
        long finalIterativo = System.nanoTime();

        System.out.printf("O fatorial de %d é: %d\n", num, fat);
        System.out.println(String.valueOf(finalIterativo-finalRecursivo) + " ns - tempo do método Iterativo");
        System.out.println(String.valueOf(finalRecursivo-initRecursivo) + " ns - tempo do método Recursivo");

        leitura.close();
    }

    public static long fatorialIterativo (int n) {
        int i;
        long fat = 1;
        for (i=n; i>1; i--)
            fat *= i;
        return fat;
    }

    public static long fatorialRecursivo (int n) {
        if (n == 1)
            return 1;
        else
            return n * fatorialRecursivo(n-1);
    }
}
