package listas.ListasDoblesAplicadas;

public class ClienteFilas {
    Cliente cabeza, cola;
    int turno = 1;

    public void agregarCliente(String nombre) {
        Cliente nuevoCliente = new Cliente(nombre, turno++);
        if (cabeza == null) {
            cabeza = nuevoCliente;
            cola = nuevoCliente;
        } else {
            cola.siguiente = nuevoCliente;
            nuevoCliente.anterior = cola;
            cola = nuevoCliente;
        }
        System.out.println("Cliente agregado: " + nombre + " con turno " + nuevoCliente.turno);
    }

    public void mostrarTurnos() {
        System.out.println("Lista de turnos:");
        Cliente actual = cabeza;
        while (actual != null) {
            System.out.println("Turno:" + actual.turno + " Nombre: " + actual.nombre + " Estado: " + actual.estado);
            actual = actual.siguiente;
        }
    }

    public void atenderSiguiente() {
        Cliente actual = cabeza;
        while (actual != null) {
            if (actual.estado.equalsIgnoreCase("En espera")) {
                actual.atender();
                System.out.println("Turno " + actual.turno + ", nombre: " + actual.nombre + " ha sido atendido.");
                return;
            }
            actual = actual.siguiente;
        }
        System.out.println("No hay clientes en espera.");
    }
}
