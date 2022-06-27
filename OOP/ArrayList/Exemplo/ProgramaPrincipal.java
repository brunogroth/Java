import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(new Pessoa("João", 15, 43));
        pessoas.add(new Pessoa("Maria", 13, 47));
        pessoas.add(new Pessoa("Pedro", 30, 78));
        pessoas.add(new Pessoa("Simone", 25, 65));
        pessoas.add(new Pessoa("Edson", 45, 120));
        pessoas.add(new Pessoa("Francieli", 50, 80));

        // foreach + print
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }

        // ordenar a lista
        Collections.sort(pessoas);

        System.out.println("\n--------- ORDENAÇÃO ----------\n");
        // foreach + print
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }

        // teste do Map

        Pessoa p = new Pessoa("Gustavo", 38, 76);
        p.getTelefones().put("residencial", "41 3325-4472");
        p.getTelefones().put("comercial", "41 3021-0972");
        p.getTelefones().put("celular", "41 99702-7822");

        System.out.println(p);
        System.out.printf("Telefone Celular:%s\n", p.getTelefones().get("celular"));
    }
}
