package vr;


import java.util.Scanner;

public class range_0_9 {

    //Receber um número e exibir se o mesmo está dentro da faixa de 1 a 9

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número entre 1 a 9:");
        int num = sc.nextInt();

        if ((num > 9) || (num < 1)) {
            System.out.println(num + " Está fora da faixa");
        } else {
            System.out.println(num + " Está dentro da faixa");
        }
    }
}
