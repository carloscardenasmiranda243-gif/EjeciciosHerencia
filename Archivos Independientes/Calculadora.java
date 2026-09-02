public class Calculadora {
    
    public int sumar(int a, int b) {
        return a + b;
    }

     public int sumar(int a, int b, int c) {
        return a + b + c;
    }
    public double sumar(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println( calculadora.sumar(5, 10));
        System.out.println( calculadora.sumar(5, 10, 15));
        System.out.println( calculadora.sumar(3.5, 2.8));
    }
}