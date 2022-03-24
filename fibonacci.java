import java.util.Scanner;

public class fibonacci {

    public static int f(int n){
        int r = 0;
        int valor1=1;
        int valor2=1;

        for(int i=1; i<=n; i++){
        
            valor1 = valor1+valor2;
            valor2 = valor1-valor2;
        }

        if(n==0 || n==1){
            r=n;
        } else{
            r = valor1-valor2;
        }
        
    return r;
}
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.println("Descubra o valor do n° termo da sequência de Fibonacci.\n Informe o valor de 'n':");
        int n = input.nextInt();
        int r;

        if(n>=0){
            r = f(n);
            System.out.println("O "+n+"° termo de Fibonacci é "+r+".");

        } else{
            System.out.println("O número informado é negativo. Tente novamente.");    
        }
        input.close();
    }
}
