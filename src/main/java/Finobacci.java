import java.util.Scanner;

public class Finobacci {

    public static void main(String[] args) {
        int num;
        long fib;
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o termo do fibonacci a ser calculado: ");
        num = leitura.nextInt();

        long initRecursivo = System.nanoTime();
        fib = fibonacciRecursivo(num);
        long finalRecursivo = System.nanoTime();
        fib = fibonacciIterativo(num);
        long finalIterativo = System.nanoTime();

        System.out.printf("O fibonacci de %d é: %d \n", num, fib);
        System.out.println(String.valueOf(finalIterativo-finalRecursivo) + " ns - tempo do método Iterativo");
        System.out.println(String.valueOf(finalRecursivo-initRecursivo) + " ns - tempo do método Recursivo");

        leitura.close();
    }

    public static long fibonacciRecursivo(int num) {
        if (num == 1 || num == 2)
            return 1;
        else
            return fibonacciRecursivo(num-1) + fibonacciRecursivo(num-2);
    }

    public static long fibonacciIterativo(int num) {
        long num_menos_1, num_menos_2;
        long res = 0;

        if (num == 1 || num == 2)
            return 1;
        else {
            num_menos_1 = 1; num_menos_2 = 1;
            for (int i=3; i <= num; i++) {
                res = num_menos_1 + num_menos_2;
                num_menos_1 = num_menos_2;
                num_menos_2 = res;
            }
            return res;
        }
    }
}
