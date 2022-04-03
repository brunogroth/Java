package Atividades2;
import java.util.Scanner;

public class fatorial {
    //Faça um programa que calcule o fatorial de um número inteiro informado pelo usuário. Validar a entrada pois o número precisa ser positivo.

    public static int Fatorial(int n){
        int mult = n - 1;
        int f = n * mult;
        for(mult=n-3;mult>0;mult--){ 

            f += f * mult;
        }
        return f;
    }
    public static void main(String[] args) {
        System.out.println("Informe um número natural para descobrir o seu fatorial.");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int f;
        if(n>=0){
            if(n>0){

                f = Fatorial(n);

            } else{ f=1; }

            System.out.println("=================================");
            System.out.println("Resultado: O Fatorial de "+n+" é " + f + ".");
        } else{
            System.out.println("O número informado é negativo. Tente novamente.");    
        }
    input.close();
    }
}