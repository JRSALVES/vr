package vr;

import java.util.Scanner;

public class contatos {
    public static void main(final String[] args) {

        final String[] nome = new String[2];
        final long[] cpf = new long[2];

        final Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Digite o nome: ");
                nome[i] = sc.nextLine();
                System.out.println("Digite o CPF: ");
                cpf[i] = sc.nextLong();
                sc.nextLine();
            }
        }
        sc.close();

        for (int i = 0; i < 2; i++) {
            System.out.printf("Nome: %s\tCPF: %s\n", nome[i], cpf[i]);
        }

    }
}
