package pilas;

public class Pila {
    private Nodo cima;

    public Pila() {
        this.cima = null;
    }

    // APILAR
    // Insertar un elemento en la pila
    public void push(int valor) {
        Nodo nuevoNodo = new Nodo(valor);

        nuevoNodo.siguiente = cima;
        cima = nuevoNodo;
    }

    // DESAPILAR

    public int pop() {
        if (cima == null) {
            System.out.println("La pila esta vacia, no se puede desapilar");
            return -1;
        }

        int valor = cima.valor;
        cima = cima.siguiente;
        return valor;
    }

    // Ver elemento en la cima de la pila(peek)
    public int peek() {
        if (cima == null) {
            System.out.println("La pila esta vacia; no hay elemento en la cima");
            return -1;
        }
        return cima.valor;
    }

    // Verificar si la pila está vacía
    public boolean isEmpty() {
        return cima == null;
    }
}