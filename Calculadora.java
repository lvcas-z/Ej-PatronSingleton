package PatronSingleton;

public class Calculadora {
    private static Calculadora calculadora = new Calculadora();
    private  Calculadora(){
    }
    public static Calculadora getInstance(){
        return calculadora;
    }
    public Double calcularPromedio(Double x, Double y){
        return (x+y)/2;
    }
}
