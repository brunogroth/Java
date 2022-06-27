package logica;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Contato {
    private String nome;
    private int RG;
    private String nasc; // prof eu tentei usar Date mas e muito ruim infelizmente nao fui capaz fiquei muitas horas da minha vida muitas tentando mas nao deu 

    private  Map<String, String> emails = new HashMap<String, String>();
    private  Map<String, Integer> telefones = new HashMap<String, Integer>();
    private  Map<String, String> enderecos = new HashMap<String, String>();

    public Contato() {
    }

    public Contato(String nome, int RG, String nasc){
        this.nome = nome;
        this.RG = RG;
        this.nasc = nasc;
    }
    
    //getters e setters
    public String getNome() {
        return nome;
    }
    
    public int getRG() {
        return RG;
    }

    public String getNasc() {
        return nasc;
    }

    public Map<String, String> getEmails() {
        return emails;
    }

    public Map<String, Integer> getTelefones() {
        return telefones;
    }

    public Map<String, String> getEnderecos() {
        return enderecos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRG(int RG) {
        this. RG = RG;
    }

    public void setNasc(String nasc) {
        this.nasc = nasc;
    }

    public void setEmails(Map<String, String> emails) {
        this.emails = emails;
    }

    public void setTelefones(Map<String, Integer> telefones) {
        this.telefones = telefones;
    }

    public void setEnderecos(Map<String, String> enderecos) {
        this.enderecos = enderecos;
    }

    @Override
    public String toString() {
        return ("Dados cadastrados:\nNome: "+nome+"\nRG: "+RG+"\nNascimento: "+nasc+"\n"+emails+""+"\n"+telefones+"\n"+enderecos); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
 

}
