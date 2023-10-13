import java.util.Scanner;

public class ordemCrescente {
    public static void main(String[] args) {
        // Desenvolva um algoritmo que receba três valores e exiba-os em ordem
        // crescente.

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int b = sc.nextInt();
        System.out.println("Digite o terceiro número: ");
        int c = sc.nextInt();

        if (a < b) {
            if (b < c) {
                System.out.println(a + "\n" + b + "\n" + c);
            } else if (a < c) {
                System.out.println(a + "\n" + c + "\n" + b);
            } else {
                System.out.println(c + "\n" + a + "\n" + b);
            }
        } else {
            if (b < c) {
                if (a < c) {
                    System.out.println(b + "\n" + a + "\n" + c);
                } else {
                    System.out.println(b + "\n" + c + "\n" + a);
                }
            } else {
                System.out.println(c + "\n" + b + "\n" + a);
            }
        }
    }
}
