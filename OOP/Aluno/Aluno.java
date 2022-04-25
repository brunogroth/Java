


public class Aluno{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int RGM;
    private String nome;
    private int anoIngresso;

    /**
     * Construtor para objetos da classe Aluno
     */
    public Aluno(int RGM, String nome, int anoIngresso)
    {
        // inicializa variáveis de instância
        this.RGM = RGM;
        this.nome = nome;
        this.anoIngresso = anoIngresso;
    }

    public int getRGM() {
        return this.RGM;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public int getAnoIngresso() {
        return this.anoIngresso;
    }
    
    public void setRGM(int RGM) {
        this.RGM = RGM;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }
    // If we want to do a object Aluno manually, we could do it like this:
    // public static void main (String[] args){
    //     Aluno bruno = new Aluno(1123456, "Bruno Miguel Groth", 2018);
    //     System.out.println("RGM: "+bruno.getRGM());
    //     System.out.println("Nome: "+bruno.getNome());
    //     System.out.println("anoIngresso: "+bruno.getAnoIngresso());
    // }
}
