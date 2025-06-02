package listas.listasSimples;

public class Main {
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple(); // Aqui estoy creando un objeto

        lista.insertarNodo(10);
        lista.insertarNodo(20);
        lista.insertarNodo(30);
        lista.insertarNodo(40);

        lista.mostrar();
    }

}
