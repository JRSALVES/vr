package vr;

import java.util.Scanner;

public class aumentoSalario {
    //	Solicitar ao usuário o valor de seu salário atual, solicitar também uma porcentagem 
    //de aumento de salário almejada. Após efetuar os cálculos, exibir o valor do acréscimo 
    //e o novo salário acrescido do aumento desejado.

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o Salário atual: ");
        double salAtual = sc.nextDouble();
        System.out.print("Digite quantos % vc quer de aumento: ");
        double percAumento = sc.nextDouble();
        double aumento = salAtual * (percAumento/100);
        double salarioaumento = salAtual + aumento;
        System.out.println("Salario atual: "+salAtual);
        System.out.println("Percentual de aumento desejado: "+percAumento+" %");
        System.out.println("Valor do aumento: "+aumento);
        System.out.println("Novo salário: "+salarioaumento);
    }    
}
