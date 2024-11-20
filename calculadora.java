public class Calculadora {

    private static int suma(int a, int b) {
        return 0; // TODO
    }

public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    private static double division(int a, int b) {
        return 0; // TODO
    }

    private static int modulo(int a, int b) {
        return 0; // TODO
    }
}
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Pruebas de sumar
        int suma32 = calc.sumar(3, 2);
        System.out.println("Suma 3 + 2 = " + suma32 + " ¿Está bien? " + (suma32 == 5));
        int suma10_5 = calc.sumar(10, 5);
        System.out.println("Suma 10 + 5 = " + suma10_5 + " ¿Está bien? " + (suma10_5 == 15));
        int suma0_0 = calc.sumar(0, 0);
        System.out.println("Suma 0 + 0 = " + suma0_0 + " ¿Está bien? " + (suma0_0 == 0));

        // Pruebas de restar
        int resta32 = calc.restar(3, 2);
        System.out.println("Resta 3 - 2 = " + resta32 + " ¿Está bien? " + (resta32 == 1));
        int resta10_5 = calc.restar(10, 5);
        System.out.println("Resta 10 - 5 = " + resta10_5 + " ¿Está bien? " + (resta10_5 == 5));
        int resta0_0 = calc.restar(0, 0);
        System.out.println("Resta 0 - 0 = " + resta0_0 + " ¿Está bien? " + (resta0_0 == 0));

        // Pruebas de multiplicar
        int multiplica32 = calc.multiplicar(3, 2);
        System.out.println("Multiplicación 3 * 2 = " + multiplica32 + " ¿Está bien? " + (multiplica32 == 6));
        int multiplica10_5 = calc.multiplicar(10, 5);
        System.out.println("Multiplicación 10 * 5 = " + multiplica10_5 + " ¿Está bien? " + (multiplica10_5 == 50));
        int multiplica0_0 = calc.multiplicar(0, 0);
        System.out.println("Multiplicación 0 * 0 = " + multiplica0_0 + " ¿Está bien? " + (multiplica0_0 == 0));

        // Pruebas de dividir
        double divide32 = calc.dividir(3, 2);
        System.out.println("División 3 / 2 = " + divide32 + " ¿Está bien? " + (divide32 == 1.5));
        double divide10_5 = calc.dividir(10, 5);
        System.out.println("División 10 / 5 = " + divide10_5 + " ¿Está bien? " + (divide10_5 == 2.0));
        double divide10_2 = calc.dividir(10, 2);
        System.out.println("División 10 / 2 = " + divide10_2 + " ¿Está bien? " + (divide10_2 == 5.0));

        // Pruebas de modulo
        int modulo32 = calc.modulo(3, 2);
        System.out.println("Módulo 3 % 2 = " + modulo32 + " ¿Está bien? " + (modulo32 == 1));
        int modulo10_5 = calc.modulo(10, 5);
        System.out.println("Módulo 10 % 5 = " + modulo10_5 + " ¿Está bien? " + (modulo10_5 == 0));
        int modulo10_3 = calc.modulo(10, 3);
        System.out.println("Módulo 10 % 3 = " + modulo10_3 + " ¿Está bien? " + (modulo10_3 == 1));
    }
}