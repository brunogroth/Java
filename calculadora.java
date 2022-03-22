public class calculadora{
    public static void main(String[] args) {
        int v1, v2;

        Scanner value = new Scanner(System.in);
        System.out.println("Informe o primeiro valor:");
        v1 = value.nextInt();
        System.out.println("Informe o segundo valor:");
        v2 = value.nextInt();
        public static int div(int v1, int v2){
        int div =v1/v2;
        
            return div;
        }
    }
    System.out.println("O resultado da divisão é "+div(v1,v2));
    System.out.println("O resultado da multiplicação dos valores");
}