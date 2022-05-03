import java.util.Set;
import javax.sound.sampled.SourceDataLine;
import javax.swing.event.SwingPropertyChangeSupport;

public class Pessoa {

    private String nome;
    private int idade;
    private Character genero;
    private int gostaViajar;
    private int gostaCozinhar;
    private int gostaCinema;
    private int gostaBalada;
    private int gostaFicarEmCasa;

        public Pessoa(){

        }

        public Pessoa(String nome, int idade, char genero, int gostaViajar, int gostaCozinhar, int gostaCinema, int gostaBalada, int gostaFicarEmCasa) {
            this.nome = nome;
            this.idade = idade;
            this.genero = genero;
            this.gostaViajar = gostaViajar;
            this.gostaCozinhar=gostaCozinhar;
            this.gostaCinema=gostaCinema;
            this.gostaBalada=gostaBalada;
            this.gostaFicarEmCasa=gostaFicarEmCasa;
        }
    
        public String getNome() {
            return nome;
        }
        
        public char getGenero() {
            return genero;
        }

        public int getGostaBalada() {
            return gostaBalada;
        }

        public int getGostaCinema() {
            return gostaCinema;
        }
        
        public int getGostaFicarEmCasa() {
            return gostaFicarEmCasa;
        }
        
        public int getGostaViajar() {
            return gostaViajar;
        }

        public int getGostaCozinhar() {
            return gostaCozinhar;
        }

        public int getIdade() {
            return idade;
        }
        
        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setGenero(Character genero) {
            this.genero = genero;
        }

        public void setGostaBalada(int gostaBalada) {
            this.gostaBalada = gostaBalada;
        }

        public void setGostaCinema(int gostaCinema) {
            this.gostaCinema = gostaCinema;
        }

        public void setGostaFicarEmCasa(int gostaFicarEmCasa) {
            this.gostaFicarEmCasa = gostaFicarEmCasa;
        }
        
        public void setGostaViajar(int gostaViajar) {
            this.gostaViajar = gostaViajar;
        }

        public void setGostaCozinhar(int gostaCozinhar) {
            this.gostaCozinhar = gostaCozinhar;
        }   
        
        public void setIdade(int idade) {
            this.idade = idade;
        }
 
    public String toString(){
        
        return "Nome: "+ this.nome +"\n"+
        "Idade: "+this.idade+"\n"+
        "Genero: "+this.genero+"\n"+
        "Gosta de Viajar: "+this.gostaViajar+"\n"+
        "Gosta de Cozinhar: "+this.gostaCozinhar+"\n"+
        "Gosta de Cinema: "+this.gostaCinema+"\n"+
        "Gosta de Balada: "+this.gostaBalada+"\n"+
        "Gosta de Ficar em casa: "+this.gostaFicarEmCasa+"\n";
        
    }

    public double calcularCompatibilidade(Pessoa p){
        return Math.sqrt(
            Math.pow(p.gostaViajar - this.gostaViajar,2)+
            Math.pow(p.gostaCozinhar - this.gostaCozinhar, 2)+
            Math.pow(p.gostaCinema - this.gostaCinema, 2)+
            Math.pow(p.gostaBalada  - this.gostaBalada, 2)+
            Math.pow(p.gostaFicarEmCasa - this.gostaFicarEmCasa, 2)
            );

    }

}
