package grafica;
import javax.swing.JFrame;
import logica.JogoMemoria;
import java.awt.GridLayout;
import java.awt.Dimension;

public class FrmJogoMemoria extends JFrame {

    private BtnPeca[][] tabuleiroPecas;
    private JogoMemoria jogo;

    public FrmJogoMemoria() {
        jogo = new JogoMemoria();
        tabuleiroPecas = new BtnPeca[4][4];
        setLayout(new GridLayout(4, 4, 10, 10));
        ActionBtnPeca action = new ActionBtnPeca(tabuleiroPecas, jogo);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                BtnPeca btn = new BtnPeca(jogo.getTabuleiroNumerico()[i][j]);
                add(btn);
                tabuleiroPecas[i][j] = btn;
                btn.addActionListener(action);
            }
        }

        //Propriedades gerais do java
        setSize(new Dimension(300,300));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void mostrarTabuleiro(){
    for  (int i = 0; i < 4; i++){
        for (int j = 0; j < 4; j++){
            tabuleiroPecas[i][j].mostrarPeca();
        }
    }
    }

    public void ocultarTabuleiro(){
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                tabuleiroPecas[i][j].ocultarPeca();
            }
        }
    }

}
