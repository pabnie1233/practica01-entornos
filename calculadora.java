public class Calculadora {

    public int sumar(int a, int b) {
        return a + b;
    }

    private static int resta(int a, int b) {
        return 0; // TODO
    }

    private static int multiplicacion(int a, int b) {
        return 0; // TODO
    }
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return (double) a / b;
    }

    public int modulo(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede calcular el módulo con divisor cero");
        }
        return a % b;
    }
}
