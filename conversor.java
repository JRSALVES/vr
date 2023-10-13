package vr;

import java.util.Scanner;

public class conversor {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o valor em reais: ");
    Double reais = sc.nextDouble();
    Double dollar = 5.50;
    Double euro = 5.70;
    Double peso = 0.27;
    
    System.out.printf("A conversão em Dollar = "+"%.2f\n",reais/dollar);
    System.out.printf("A conversão em Euros = "+"%.2f\n",reais/euro);
    System.out.printf("A conversão em Pesos = "+"%.2f\n",reais/peso);
  }   
}
