package vr;

import java.util.Scanner;

public class dobro {
    //Receber um valor, calcular e exibir o dobro do valor recebido	
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int x = sc.nextInt();
        int res = x * 2;
        System.out.println("O dobro de " +x+ " é "+res);
    }    
}
