/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Dados {
     ArrayList<Contato> contatos = new ArrayList<>();
    
    public void cadastrarContato(Contato contato){
        contatos.add(contato);
    }

    public String numerodecontatos(){
    return String.format( contatos.size()+" Contatos cadastrados");
   // String numerocontatoss = Integer.parseString(nContatos);
  
    }
}
