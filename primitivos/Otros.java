package primitivos;

public class Otros {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("El valor inicial de a es: " + a);// 5
        System.out.println("Usando el postincremento: " + a++); // 6
        System.out.println("El valor de a después del postincremento es: " + a);// 6

        int x = 10;
        int y = x++;

        System.out.println("El valor de x es: " + x); // 10
        System.out.println("El valor de y es: " + y); // 11

        // Preincremento

        int v = 10;
        int w = ++x;

        System.out.println("El valor de x es: " + v); // 10
        System.out.println("El valor de y es: " + w); // 11

        // Ejemplo practico
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8 };

        for (int number : numbers) {
            System.out.println("El valor de i es: " + ++number);
        }

        System.out.println("--------------");

        for (int number : numbers) {
            System.out.println("El valor de i es: " + number++);
        }

        // Equivalencias (Ecuación)

        int t = 10;
        t += 5; // 15
        t -= 3; // 12
        t *= 2; // 24

        System.out.println("t es igual a: " + t);

        int u = 10;
        u = +5; // Esto no es una equivalencia, esto simplemente es asignar un valor.

        // Operador ternario
        // Ejemplo 1
        int numero = 10;
        String resultado = (numero % 2 == 0) ? "El número es par" : "El número es impar";
        System.out.println(resultado);

        // Ejemplor 2
        int edad = 20;
        boolean ticket = true;
        String edadAcceso = (edad >= 18) ? (ticket ? "Acceso permitido mayor + ticket" : "Acceso permitido solo mayor")
                : "Menor de edad, acceso denegado";
        System.out.println(edadAcceso);
    }
}