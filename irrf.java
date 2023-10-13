
import java.util.Scanner;

public class irrf {
    public static void main(String[] args) {
    
    //Receber um valor referente a um salário mínimo. Efetuar o calculo para seu salário liquido,     
    //abater 8% de Inss, 11% de imposto de renda. Exibir os descontos e o salário liquido.

    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o valor do salario mínimo: ");
    int salariomin = sc.nextInt();
    double inss = salariomin * 0.08;
    double irrf = salariomin * 0.11;    
    System.out.println("Desconto de INSS = "+inss);
    System.out.println("Descont IRRF = "+irrf);
    System.out.println("Salario Liquido = " + (salariomin - inss - irrf));
  }
}
