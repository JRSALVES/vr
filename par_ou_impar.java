package vr;


import java.util.Scanner;

public class par_ou_impar {
    
    // Desenvolva um algoritmo que receba um valor via teclado e defina se o valor recebido é par ou ímpar.
    
    public static void main(String[] atgs) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " É par");
        } else {
            System.out.println(num + " É impar");
        }
    }
}
