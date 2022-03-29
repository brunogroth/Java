

import java.util.Scanner;
public class ParImpar {

public static String verificarPImpar(int n){
    if(n%2==0){
        return "par";
    }else{
        return "impar";
    }
}

public static int lerNumero(){
    Scanner input = new Scanner(System.in);
    System.out.println("Informe o número para verificarmos se é impar ou par");
    int num = input.nextInt();

    return num;
}

public static void main(String[] args){
    int num=1;
        do {
        num = lerNumero();
        String resposta = verificarPImpar(num);
        System.out.println(resposta); 
        }while(num>0);
    }
}