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
}