import java.util.Scanner;

public class ProgramaPrincipal {
    // Atributos

    // Funções e procedimentos

    // Rotina principal
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Aluno alunos[] = new Aluno[5];
        for (int i = 0; i < 5; i++) {
            System.out.printf("--------- Aluno %d ---------\n", i + 1);

            System.out.println("RGM:");
            int RGM = teclado.nextInt();
            
            System.out.println("Nome:");
            
            String nome = teclado.next();

            System.out.println("Ano Ingresso:");
            int anoIngresso = teclado.nextInt();

            alunos[i] = new Aluno(RGM, nome, anoIngresso);
        }
        System.out.println("----- Lista de Alunos -----\n");
        for (int i = 0; i < 5; i++) {
            System.out.printf("RGM: %d\nNome:%s\nAno Ingresso:%d\n", 
                alunos[i].getRGM(), 
                alunos[i].getNome(), 
                alunos[i].getAnoIngresso()
            );
        }
        teclado.close();
    }
}
