package vr;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class antecessor {

    //Receber um valor exibir o seu antecessor e o seu sucessor	

    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com um número");
        int x = sc.nextInt();
        int ant = x - 1;
        int suc = x + 1;

        System.out.printf("O Antecessor de "+x+ " = " + ant);
        System.out.printf("\nO Sucessor de "+x+ " = " + suc+"\n");
    }
    
}
