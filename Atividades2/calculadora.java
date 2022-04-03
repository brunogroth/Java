package Atividades2;
import java.util.Scanner;
public class calculadora {

    public static int Sum(int v1, int v2) {
        int sum = v1 + v2;

        return sum;
    }

    public static int Sub(int v1, int v2) {
        int sub;
        if (v1 >= v2) {
            sub = v1 - v2;
        } else {
            sub = v2 - v1;
        }

        return sub;
    }

    public static int Div(int v1, int v2) {
        int div;

        if (v1 >= v2) {
            div = v1 / v2;
        } else {
            div = v2 / v1;
        }

        return div;
    }

    public static int Mult(int v1, int v2){
        int mult = v1*v2;

        return mult;
    }
    public static void main(String[] args) {
        int v1, v2;

        Scanner value = new Scanner(System.in);
        System.out.println("Informe o primeiro valor:");
        v1 = value.nextInt();
        System.out.println("Informe o segundo valor:");
        v2 = value.nextInt();

        System.out.println("O resultado da soma dos valores é " + Sum(v1, v2));
        System.out.println("O resultado da Subtração dos valores é " + Sub(v1, v2));
        System.out.println("O resultado da divisão é " + Div(v1, v2));
        System.out.println("O resultado da multiplicação dos valores é " + Mult(v1, v2));
        value.close();
    }
}