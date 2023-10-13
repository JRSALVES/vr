
import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        float n1 = sc.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float n2 = sc.nextFloat();
        System.out.println("Digite a terceira nota: ");
        float n3 = sc.nextFloat();

        float media = (n1 + n2 + n3) / 3;

        if (media <= 5) {
            System.out.println("Você esté Reprovado");
        } else {
            if ((media > 5) && (media < 7)) {
                System.out.println("Recuperação");
            } else {
                System.out.println("Aprovado");
            }

        }

    }
}
