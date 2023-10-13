package vr;

import java.util.Scanner;

public class maior {
    //Desenvolva um algoritmo que receba dois valore e informe, se o primeiro é maior que o 
    //segundo, se o segundo é maior que o primeiro ou se os dois são iguais.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois números: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x == y){
            System.out.println("Os dois são iguais");
        }else{
            if (x > y) {
                System.out.println(x +" é o maior");
            } else {
                System.out.println(y +" é o maior");
            }
        }
    }
}
