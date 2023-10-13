
import java.util.Scanner;

//	Crie um procediemnto que exiba uma sequencia de tabuadas. Este procedimento deverá receber como parametro o valor inicial e o valor final.

public class tabuadas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
      
        for(int i = 1; i < (num + 1); i++){
            for(int j = 0; j < 11; j++){
                
                System.out.println(i+ " x " +j+ " = " +i *j); 
            }  
            System.out.println("-------------");                
        }                 
    }
}

    
