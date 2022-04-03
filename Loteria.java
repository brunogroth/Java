import java.util.Random;
import java.util.Scanner;

public class Loteria {
/* Faça um jogo de loteria! O programa sorteia 6 números (chamadas dezenas) de 1 a 60 e pede para o jogador escolher 6 números de 1 a 60. O programa compara os números escolhidos com os números sorteados, mostra as dezenas sorteadas, as dezenas escolhidas pelo jogador e mostra o prêmio conforme abaixo:
6 acertos: R$ 1.000.000,00
5 acertos: R$ 250.000,00
4 acertos: R$ 50.000,00
3 acertos: nada. 2 acertos: nada. 1 acerto: nada.
*/  

    public static int[] sorteio() {
        Random gerador = new Random();
        int[] vetor = new int[6];
        for (int i = 0; i < 6; i++) {
            vetor[i] = 1 + gerador.nextInt(60);
        }
        return vetor;
    }

    // Rotina principal
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] dezenas = new int[6];
        dezenas = sorteio();

        int[] numeros = new int[6];
        for(int i=0;i<6; i++){
        System.out.println("Digite um numero entre 1 a 60:");
        numeros[i] = input.nextInt();
        }

        int acertos=0;

        for(int i=0; i<6;i++){
            for(int j=0; j<6;j++){
                if(numeros[i] == dezenas[j]){
                    acertos++;
                }
            }
        }
        System.out.println("As dezenas sorteadas foram:");
        for(int i=0; i<6;i++){
        System.out.println(i+1+"°: "+dezenas[i]);
    }
        System.out.println("Acertos: "+acertos);

        input.close();
    }

}
