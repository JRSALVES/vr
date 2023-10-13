import java.util.Random;

public class aleatorio_0_100 {
    public static void main(String[] args){
        // vetores s/ao variáveis indexadas unidimensionalmente
        // no visual era - v:vetor[1..10] de inteiro
        // Em java é:

        /*
         * Criar um algoritimo que forneça 20 numeros entre 0 e 100 de forma aleatória
         */

         /*
         * para i de 1 ate 10 faca
         * v[i] <- randi(100)
         * fimpara
         */

         // Gerar números
         int[] vetor = new int[20];
         for(int i = 0; i < vetor.length; i++){
            vetor[i] = new Random().nextInt(100) + 1;
         }

         //Para exibir
         for(int i = 0; i < vetor.length; i ++){
            System.out.printf("Vetor[%s]: %s\n", i,vetor[i]);
         }
    }

}
