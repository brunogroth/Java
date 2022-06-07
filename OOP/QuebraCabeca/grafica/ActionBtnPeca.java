package grafica;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import logica.JogoMemoria;

public class ActionBtnPeca extends AbstractAction {
    private BtnPeca[][] tabuleiroPeca;
    private JogoMemoria jogo;
    private BtnPeca pecaAnterior;
    

    public ActionBtnPeca(BtnPeca[][] tabuleiroPeca, JogoMemoria jogo){
        this.tabuleiroPeca = tabuleiroPeca;
        this.jogo = jogo;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        BtnPeca btnAtual = (BtnPeca) e.getSource();
        if(jogo.isAguardandoPeca()){
            // tratar evento quando já estiver aguardando a outra peça
            btnAtual.mostrarPeca();
            if(btnAtual.getNumero() == pecaAnterior.getNumero()){
                //condicao de acerto
                jogo.aumentarPontuacao();
                // conferir condicao d e fim
                int contador = 0;
                for (int i = 0; i < 4; i++){
                    for(int j = 0; j < 4; j++){
                        if(tabuleiroPeca[i][j].isSelected()){
                            contador++;
                        }
                    }
                }
                if(contador == 16){
                    JOptionPane.showMessageDialog(null, String.format("Fim de jogo! Pontuação: %d", jogo.getPontuacao()), "Jogo da Memória", JOptionPane.INFORMATION_MESSAGE);
                }
                //bloquear os botoes acertados
                btnAtual.setEnabled(false);
                pecaAnterior.setEnabled(false);
                
            }else{
                jogo.diminuirPontuacao();
                btnAtual.ocultarPeca();
                pecaAnterior.ocultarPeca();   
            }
            jogo.setAguardandoPeca(false);
        }else{
            // tratar evento quando a primeira peca foi selecionada
            btnAtual.mostrarPeca();
            pecaAnterior = btnAtual;
            jogo.setAguardandoPeca(true);
        }
    }

}