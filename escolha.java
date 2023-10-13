
import java.util.Scanner;

public class escolha {
    public static void main(String[] args){
        String dado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um caracter");
        dado = sc.nextLine();
        
        switch(dado){
        case "a":
        case "e":
        case "i":
        case "o":
        case "u": 
        System.out.println("\nVOGAL\n");
        break;
        case "0":
        case "1":
        case "2":
        case "3":
        case "4":
        case "5":
        case "6":
        case "7":
        case "8":
        case "9": 
        System.out.println("\nNUMERAL\n");
        break;
        case "b": 
        case "c": 
        case "d":
        case "f":
        case "g":
        case "h":
        case "j":
        case "l":
        case "k":
        case "m":
        case "n":
        case "p":
        case "q":
        case "r":
        case "s":
        case "t":
        case "v":
        case "x":
        case "z":
         System.out.println("\nCONSOANTE\n");
        break;
        }
    } 
    
}
