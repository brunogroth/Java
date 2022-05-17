public class ProgramaPrincipal {
    public static void main(String[] args) {
        FormaGeometrica formas[] = new FormaGeometrica[3];
        formas[0] = new Circulo(2);
        formas[1] = new Retangulo(10, 5);
        formas[2] = new Triangulo(20, 2.5);
        
        /*for (int i = 0; i < formas.length; i++) {
            FormaGeometrica obj = formas[i];
        }*/

        // Foreach do Java
        for (FormaGeometrica obj : formas) {
            System.out.printf("Forma: %s\nArea: %f\n", obj.getClass().getName(), 
                obj.calcularArea());
        }
    }
}
