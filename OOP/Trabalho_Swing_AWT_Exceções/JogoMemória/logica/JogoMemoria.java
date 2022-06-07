package logica;

import java.io.ObjectInputStream.GetField;

public class JogoMemoria {

    // construtora
    public JogoMemoria() {
        tabuleiroNumerico = new int[4][4];
        sortearPosicoes();
    }

    // sorteio posição
    private void sortearPosicoes() {
        Random rnd = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // Sortear um numero valido na posicao i,j
                while (true) {
                    int n = rnd.nextInt(8) + 1; // sorteia de 1 a 8
                    if (verificarValido(n)) {
                        tabuleiroNumerico[i][j] = n;
                        break; // sai do while
                    }
                }
            }
        }
    }

    private boolean verificarValido(int n){
        int contador = 0;
        for (int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if (n== tabuleiroNumerico[i][j]){
                    contador++;
                }
            }
        }
    return contador<2; // true se o contador menor que 2
    }

    public int[][] getTabuleiroNumerico(){
        
        return tabuleiroNumerico;
    }

}