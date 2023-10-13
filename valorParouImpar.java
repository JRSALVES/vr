import java.util.Scanner;

public class valorParouImpar {
    // Crie uma função que valide se um valor numério é par ou ímpar. O tipo do
    // retorno deverá ser lógico.

    static boolean par(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }
    public static void main(String[] atgs) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.print("Digite um número inteiro: ");

        int num = sc.nextInt();
        System.out.println(" ");
        System.out.println(num+ " É um número par? "+par(num));
        System.out.println(" ");
    }
}
