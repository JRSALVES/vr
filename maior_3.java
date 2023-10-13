package vr;


import java.util.Scanner;

public class maior_3 {

    //Desenvolva um algoritmo que receba três valores via teclado e defina e exiba,
    //o maior valor recebido dentre os três.	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        long num2 = sc.nextInt();
        System.out.println("Digite o terceiro número: ");
        int num3 = sc.nextInt();

        if ((num1 > num2) && (num1 > num3)) {
            System.out.println(num1 + " É o maior");
        } else {
            if ((num1 < num2) && (num2 > num3)) {
                System.out.println(num2 + " É o maior");
            } else {
                System.out.println(num3 + " É o maior");
            }
        }
    }
}
