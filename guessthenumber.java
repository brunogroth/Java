import java.util.Random;
import java.util.Scanner;


public class guessthenumber {
    
    public static int generator(){
        Random gen = new Random();

        int result = 1+ gen.nextInt(100);
    
        return result;
    }
    
    public static boolean validateNumber(int i){
        if(i>=0 && i<=100){
            return true;
        }else{
            return false;
        }
    }
    public static String game(){
        int life = 10;

        int attemp;
        int number = generator();
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um número.");

        for(int i=1; i<=10; i++){
        System.out.println(i+"° tentativa: ");
        attemp = input.nextInt();
        
        boolean validator = validateNumber(attemp);
        if(validator){
            if(attemp == number){
                return "Sucesso! Você acertou o número.";
            }else if(attemp>=number){
           life--;
            System.out.println("Número incorreto. Você digitou um número maior que o sorteado. \nVidas restantes:"+life);                
        }else if(attemp<=number){
            life--;
            System.out.println("Número incorreto. Você digitou um número menor que o sorteado. \nVidas restantes:"+life);  
        }

        }else{
            System.out.println("O número informado é inválido. tente novamente.");
            i--;
        }     
    }   
    input.close(); 
    if(life==0){
        return "Fim de jogo. O número sorteado era "+number;   

    }
    input.close();
    return "";
}

    public static void main(String[] args) {
        System.out.println("Bem vindo ao Guess The Number! Um jogo de adivinhação.");
        System.out.println("O objetivo do jogo é descobrir o número entre 0 a 100 gerado pelo sistema.");
        System.out.println("-------- O número foi gerado.---------");
        System.out.println(game()); 
        
    }
}
