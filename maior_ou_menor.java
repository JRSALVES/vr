package vr;


import java.util.Scanner;

public class maior_ou_menor {
    public static void main(String[] args) {
        //Solicitando e recebendo os números do usuario
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int a = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int b = sc.nextInt();

        //Verficando qual é maior, menor ou igual e mostrando o resultado
        if (a == b) {
            System.out.println("\n" + a + " É igual a " + b + "\n");
        }else {
            if (a < b) {
                System.out.println("\n" +  a + " É Menor do que " + b + "\n");

            } else {
                System.out.println("\n"+ a + " É Maior " + b +"\n");

            }
        }
    }
}
