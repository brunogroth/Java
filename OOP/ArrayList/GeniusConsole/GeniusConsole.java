package logica;
import java.io.IOException;
import java.util.Scanner;

public class GeniusConsole {
    static int pontos = 0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Genius genius = new Genius();
        
        boolean continua = true;
        try {
            while (continua) {
                genius.sortearCor();
                mostrarCoresSorteadas(genius);
                lerCoresJogador(genius, scan);
                continua = genius.compararSequencias();
                genius.limparCoresJogador();
                pontos +=5;
            }
            if(continua == false){
                System.out.println("Fim de jogo! Sua pontuação foi "+pontos);
            }        
        } catch (IOException e) {

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            scan.close();
        }    
    }

    public static void mostrarCoresSorteadas(Genius g) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("Sua pontuação é: "+ pontos);
        System.out.println("Memorize a sequência...");
        Thread.sleep(1000);                
        for (Genius.Cor cor : g.getCoresSorteadas()) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println(cor.ordinal());
            Thread.sleep(1000);
        }
    }

    public static void lerCoresJogador(Genius g, Scanner scan) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("Digite a sequência...");
        Thread.sleep(1000);                
        while (g.getCoresJogador().size() < g.getCoresSorteadas().size()) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            g.getCoresJogador().add(Genius.Cor.values()[scan.nextInt()]);
        }
    }
}
