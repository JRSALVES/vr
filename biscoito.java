import java.util.Random;
//Crie um procedimento chamado biscoito_da_sorte. Este procedimento deverá exibir para o usuário 
//uma aleatória mensagem da sorte, simulando o biscoito da sorte. Crie pelo menos 5 mensagens para sortear.

public class biscoito {
    public static void main(String[] args){
        Random rd = new Random(); 
        int numRandom = rd.nextInt(5);
        System.out.println(numRandom);
        String m[] = new String[5];
        m[0] = "A vida é dura para quem é mole";
        m[1] = "Tudo que sobe desce";
        m[3] = "Só se vive uma vez";
        m[4] = "vai na paz";

        if(numRandom == 0){
            System.out.println(m[0]);
        }else if(numRandom == 1){
            System.out.println(m[1]);
        } else if(numRandom == 2){
            System.out.println(m[2]);
        }else if(numRandom == 3) {
            System.out.println(m[3]);
        } else{
            System.out.println(m[4]);
        }
    }    
}
