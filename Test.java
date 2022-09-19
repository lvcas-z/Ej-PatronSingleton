package PatronSingleton;

public class Test {
    public static void main(String[] args) {
        Calculadora calculadora1 = Calculadora.getInstance();
        System.out.println(calculadora1.calcularPromedio(7.0,9.0));
        System.out.println("--ES LA MISMA CALCULADORA QUE EN TEST(@4dd8dc3)---");
        System.out.println(calculadora1.toString());
    }
}
