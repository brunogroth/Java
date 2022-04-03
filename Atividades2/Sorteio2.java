package Atividades2;
import java.util.Random;

public class Sorteio2{
    public static int[] numberCreator(){
        Random gen = new Random();
        int[] vetor = new int[21];
            for(int i=1; i<=20;i++){
                vetor[i] = 1+ gen.nextInt(100);
            }
        return vetor;
    }

    public static void main(String[] args){
    
        int[] retorno = new int[20];
        retorno = numberCreator();
        System.out.println("Os números sorteados foram:");
        for(int i=1; i<=20;i++){
        System.out.println(i+"°: "+retorno[i]);
        }
    }
}