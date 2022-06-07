package grafica;

import javax.swing.JToggleButton;

public class BtnPeca extends JToggleButton{
    private int numero; //numero da peça

    public BtnPeca(int numero){
        this.numero = numero; 
    }

    //Mostrar o numero da peça e selecionar o button
    public void mostrarPeca(){
        setSelected(true);
        setText(Integer.toString(numero));
    }

    //ocultar o numero da peça e deselecionar o button
    public void ocultarPeca(){
        setSelected(false);
        setText("");
    }
    public int getNumero(){
        return numero;
    }
}
