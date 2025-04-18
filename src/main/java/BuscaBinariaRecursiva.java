import java.util.Scanner;

public class BuscaBinariaRecursiva {

    public static void main(String[] args) {
        int vetor[] = {1,5,10,15,20,25,30,35,40,45,50,55,60,65,70,75,80,85,90,95};
        int num;
        int inicio = 0;
        int fim = vetor.length - 1;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o número inteiro que deseja buscar no vetor: ");
        num = leitura.nextInt();

        int retorno = buscaBinariaRecursiva(vetor, num, inicio, fim);

        if (retorno == -1)
            System.out.println("Número não encontrado: -1");
        else
            System.out.println("Número encontrado na posição: " + retorno);

        leitura.close();
    }

    public static int buscaBinariaRecursiva (int vetor[], int num, int inicio, int fim) {
        int meio;

        if (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (num == vetor[meio])
                return meio;
            else
            if (num > vetor[meio])
                return buscaBinariaRecursiva(vetor, num, meio + 1, fim);
            else
                return buscaBinariaRecursiva(vetor, num, inicio, meio - 1);
        }

        return -1;
    }

}