package listas.listasDobles;

public class listaDoble {
    Nodo cabeza, cola;

    public void agregar(int dato) {
        Nodo nuevoNodo = new Nodo(dato); // Aqui estoy haciendo una instancia "Invocacion de vida" al objeto Nodo que
                                         // esta en Nodo.java

        if (cabeza == null) { // Este if solo sucede para el PRIMER NODO
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            cola.siguiente = nuevoNodo;
            nuevoNodo.anterior = cola;
            cola = nuevoNodo;
        }
    }

    public void mostrar() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
        System.out.println("");
    }
}
