package listas.listasDobles;

public class Nodo {
    int dato;
    Nodo siguiente, anterior;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = this.anterior = null;
    }
}
