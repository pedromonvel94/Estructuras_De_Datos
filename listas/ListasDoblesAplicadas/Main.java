package listas.ListasDoblesAplicadas;

public class Main {
    public static void main(String[] args) {
        ClienteFilas fila = new ClienteFilas();

        fila.agregarCliente("Juan");
        fila.agregarCliente("Pedro");
        fila.agregarCliente("Maria");
        fila.agregarCliente("Oscar");
        fila.agregarCliente("Antonio");
        fila.agregarCliente("Ana");

        fila.mostrarTurnos();

        fila.atenderSiguiente();
        fila.atenderSiguiente();
        fila.atenderSiguiente();
        fila.atenderSiguiente();

        fila.mostrarTurnos();
    }

}
