
import java.util.Scanner;

public class divisivel {

    
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um Número: ");
        int num = sc.nextInt();

        if ((num % 2 == 0) && (num % 3 == 0)) {
            System.out.println(num + " É divisivel por 2 e 3");
        } else {
            if ((num % 2 == 0) && (num % 3 != 0)) {
                System.out.println(num + " É divisivel por 2 mas não por 3 ");
            } else {
                if ((num % 2 != 0) && (num % 3 == 0)) {
                    System.out.println(num + " Não é divisivel por 2 mais sim por 3");
                } else {
                    System.out.println("Não é divisivel nem por 2 ou 3");
                }
            }
        }
    }

}

