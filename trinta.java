
import java.util.Scanner;

public class trinta {
    //Solicitar ao usuário o valor e calcular e exibir 30% do valor recebido.	
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um numero");
    double x = sc.nextDouble();
    double res = x * 0.30;
    System.out.println("30% de "+x+ " = "+res);
    }   
}
