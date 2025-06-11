package pilas;

public class Main {
    public static void main(String[] args) {
        Pila pila = new Pila();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        System.out.println(pila.peek()); // Muestra el elemento en la cima de la pila (30)
        System.out.println(pila.pop()); // Desapila el elemento en la cima (30)
        System.out.println(pila.pop()); // Desapila el elemento en la cima (20)
        System.out.println(pila.peek()); // Muestra el elemento en la cima de la pila (10)

    }
}
