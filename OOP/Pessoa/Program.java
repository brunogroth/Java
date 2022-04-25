public class Program {
    public static void main(String[] args) {
        Pessoa Maria = new Pessoa("Maria");
        Pessoa Jose = new Pessoa("José");
        Pessoa Joao = new Pessoa("João");
        Pessoa Pedro = new Pessoa("Pedro");
        Maria.Conversar(Pedro);
        Jose.Conversar(Joao);
}
}