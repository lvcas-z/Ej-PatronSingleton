package PatronSingleton;

public class Test2 {
    public static void main(String[] args) {
        Calculadora calculadora2 = Calculadora.getInstance();
        System.out.println(calculadora2.calcularPromedio(7.0,9.2));
        System.out.println("--ES LA MISMA CALCULADORA QUE EN TEST(@4dd8dc3)---");
        System.out.println(calculadora2.toString());
    }
}
