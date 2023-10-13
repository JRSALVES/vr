import java.util.Random;

public class vetorOrdenado {
    public static void main(String[] args) {
        // Crie um procedimento que ordene um vetor numérico.

        int[] vetor = new int[5];

        // Gerando e exibindo os numeros aleatórios
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = new Random().nextInt(100) + 1;
        }

        System.out.println("Imprimindo os valores gerados");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Vetor[%s]: %s\n", i, vetor[i]);
        }

        // Vetores em ordem decrescente
        for (int i = 1; i < vetor.length; i++) {
            for (int j = 0; j < i; j++) {
                if (vetor[i] > vetor[j]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
        System.out.println("Array em ordem decrescente:");
        for (int n : vetor) {
            System.out.print(n + " ");
        }
    }
}
