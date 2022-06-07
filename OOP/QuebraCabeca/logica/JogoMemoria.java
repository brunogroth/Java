package logica;

import java.util.Random;
import java.util.Set;

public class JogoMemoria{
    private int[][] tabuleiroNumerico;
    private boolean aguardandoPeca;
    private int pontuacao;

    //Construtora
    public JogoMemoria(){
        tabuleiroNumerico = new int [4][4];
        sortearPosicoes();
    }

    //sortear posicao das pecas
    private void sortearPosicoes(){
        Random rnd = new Random();
        for (int i=0; i<4; i++){
            for(int j=0; j<4;j++){
                //sortear um numero valido na posicao i,j
                while(true){
                    int n = rnd.nextInt(8) + 1; //sorteiar  de 1 a 8 
                    if(verificarValido(n)){
                        tabuleiroNumerico[i][j] = n;
                        break; //sai do laço while
                    }

                }
            }
        }


    }

    private boolean verificarValido(int n ){
        int contador = 0;
        for(int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                if(n== tabuleiroNumerico[i][j]){
                    contador++;
                }
            }
        }

        return contador < 2; 
    }

    public int[][] getTabuleiroNumerico() {
        return tabuleiroNumerico;
    }

   public boolean isAguardandoPeca(){
       return aguardandoPeca;
   }
    
   public void setAguardandoPeca(boolean aguardandoPeca){
       this.aguardandoPeca = aguardandoPeca;

   }

   public void aumentarPontuacao(){
       pontuacao += 5;

   }
   public void diminuirPontuacao(){
       pontuacao -= 3;
   }

   public int getPontuacao(){
       return pontuacao;
   }
}