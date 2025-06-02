package primitivos;

public class Main {
    public static void main(String[] args) {

        // Casting Implicito. -> Convertir de mas pequeño a mas grande segun su tamaño.
        int numeroInt = 150;
        long numeroLong = numeroInt;

        System.out.println("El valor de numeroLong es: " + numeroLong);

        double numeroDouble = numeroLong;
        System.out.println("El valor de numeroLong es: " + numeroDouble);

        char letra = 'a';
        int codigoAscii = letra;
        System.out.println("El valor de numeroLong es: " + letra);
        System.out.println("El valor de numeroLong es: " + codigoAscii);

        // Casting explicito

        double numeroGrande = 125.85;
        int numeroExplicito = (int) numeroGrande;

        // Ojo que en este caso al ser mayor el numero presente en el long al tamaño que
        // puede tener el int, lo que genera es un desbordamiento y por ende lo imprime
        // en negativo
        long numeroLongGrande = 2147483648L;
        int numeroIntGrande = (int) numeroLongGrande;
        System.out.println("El valor de numeroIntGrande es: " + numeroIntGrande);
    }

}