import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        //System.out.println(num);

        int fibo = 1;
        int fn = 0;
        System.out.println(fn);
        System.out.println(fibo);
 
        for(int i = 0; i < (num+1); i++){
            fibo = fibo + fn;
            fn = fibo - fn;
            System.out.println(fibo);
        }
    }    
}
