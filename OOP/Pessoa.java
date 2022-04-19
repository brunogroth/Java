package OOP;

public class Pessoa {

    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void Conversar(Pessoa p) {
        System.out.printf("%s está falando com %s\n", this.nome, p.nome);
    }

    public static void main(String[] args) {
        Pessoa Maria = new Pessoa("Maria");
        Pessoa Jose = new Pessoa("José");
        Pessoa Joao = new Pessoa("João");
        Pessoa Pedro = new Pessoa("Pedro");
        Maria.Conversar(Pedro);
        Jose.Conversar(Joao);

    }
}