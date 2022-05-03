import java.util.Scanner;

import javax.xml.transform.Source;

public class Principal {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Pessoa[] pessoas = new Pessoa[7];

        pessoas[0] = new Pessoa("Felipe", 57, 'M', 90, 100, 80, 30, 70);
        pessoas[1] = new Pessoa("Maria", 45, 'F', 50, 70, 100, 50, 90);
        pessoas[2] = new Pessoa("Cristina", 30, 'F', 50, 20, 30, 70, 30);
        pessoas[3] = new Pessoa("Leonardo", 32, 'M', 80, 10, 60, 80, 50);
        pessoas[4] = new Pessoa("João", 27, 'M', 100, 30, 50, 100, 10);
        pessoas[5] = new Pessoa("Jéssica", 45, 'F', 85, 60, 70, 50, 60);
        
        System.out.println("Informe os dados para cadastro: "); 
        System.out.println("Primeiro Nome: ");
        String nome = input.next();
        System.out.println("Idade: ");
        int idade = input.nextInt();
        if(idade<18){
            System.out.println(nome+", você é menor de idade.");
        }else{
        
        System.out.println("Gênero: (M para Masculino, F para Feminino) ");
        char genero = input.next().charAt(0);
        
        if(genero == 'M' || genero == 'F'){
            System.out.println("De 0 a 100, quanto você gosta de viajar?");
            int viajar = input.nextInt();
    
            System.out.println("De 0 a 100, quanto você gosta de cozinhar?");
            int cozinhar = input.nextInt();
    
            System.out.println("De 0 a 100, quanto você gosta de cinema?");
            int cinema = input.nextInt();
    
            System.out.println("De 0 a 100, quanto você gosta de balada?");
            int balada = input.nextInt();
    
            System.out.println("De 0 a 100, quanto você gosta de ficar em casa?");
            int casa = input.nextInt();
    
            if(viajar<0 || viajar > 100 || cozinhar < 0 || cozinhar > 100 || cinema < 0 || cinema > 100 || balada < 0 || balada> 100 || casa < 0 || casa> 100 ){
                System.out.println("Dados inválidos. Informe valores entre 0 e 100.");
            }else{
            
                pessoas[6] = new Pessoa(nome, idade, genero, viajar, cozinhar, cinema, balada, casa);
            for(int i=0; i<=6; i++){
                System.out.println(pessoas[i]);
            }
        }
    
        double menordistancia=999999999;
        Pessoa pessoamenordistancia =null;
            for(int i=0; i<6;i++){

                if(pessoas[i].getGenero() != pessoas[6].getGenero()){

                    double a =  pessoas[6].calcularCompatibilidade(pessoas[i]);

                    if(a < menordistancia){
                        menordistancia = a;
                        pessoamenordistancia=pessoas[i];
                    } 

                }
            }
            System.out.println("A pessoa ideal para vc e "+pessoamenordistancia.getNome());
            
        }else{
            System.out.println(nome+", Seu gênero é inválido.");       
        }
    };
           
    }   
}