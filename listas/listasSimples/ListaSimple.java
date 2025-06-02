package listas.listasSimples;

public class ListaSimple {
    Nodo cabeza; // Creo el nodo cabeza el cual es un atributo de clase y por defecto es null

    public void insertarNodo(int dato) {
        Nodo nuevoNodo = new Nodo(dato); // Aqui estoy haciendo una instancia "Invocacion de vida" al objeto Nodo que
                                         // esta en Nodo.java

        if (cabeza == null) { // Este if solo sucede para el PRIMER NODO
            cabeza = nuevoNodo;
        } else {
            // HAY UN SEGUNDO NODO el cual no equivale a null
            Nodo actual = cabeza;
            while (actual.siguiente != null) { // La primera vez no va a entrar al while
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

    public void mostrar() {
        Nodo actual = cabeza;
        while (actual != null) {
            actual = actual.siguiente;
        }
        System.out.println("");
    }
}
