
import java.util.Scanner;

public class troca_valor {
    // Receber 2 valores x e y, então exiba-os; a seguir realizar a troca dos
    // valores de x e y
    // e exibir novamente x e y.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int x = sc.nextInt();
        System.out.println("Digite o segundo número");
        int y = sc.nextInt();

        System.out.println("inicialmente X é igual a " + x);
        System.out.println("Inicialmente Y é igual a " + y);

        int aux = y;
        y = x;
        x = aux;

        System.out.println("Agora X é igual a " + x);
        System.out.println("Agora Y é igual a " + y);
    }
}
