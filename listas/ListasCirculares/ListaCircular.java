package listas.ListasCirculares;

public class ListaCircular {
    Nodo cabeza, cola;

    public void agregar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
            cola.siguiente = cabeza; // Circular
        } else {
            cola.siguiente = nuevoNodo;
            cola = nuevoNodo;
            cola.siguiente = cabeza; // Circular
        }
    }

    public void mostrar(int vueltas) {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }
        Nodo actual = cabeza;
        int contador = 0;
        do {
            System.out.println(actual.dato);
            actual = actual.siguiente;
            contador++;

        } while (actual != cabeza && contador < vueltas);
        System.out.println("");
    }

}
