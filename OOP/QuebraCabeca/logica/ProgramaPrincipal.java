package logica;

import grafica.FrmJogoMemoria;

public class ProgramaPrincipal {

    public static void main(String[] args) {
        FrmJogoMemoria frm = new FrmJogoMemoria();
        frm.setVisible(true);
        //mostrar todas as peças e aguarda 5 segundos
        frm.mostrarTabuleiro();
        try{
            Thread.sleep(5000);
        } catch (InterruptedException ex){
            ex.printStackTrace();
        }
        frm.ocultarTabuleiro();
        
    }
    
}
