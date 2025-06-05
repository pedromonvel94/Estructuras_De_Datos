package listas.ListasDoblesAplicadas.arrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cliente> listaClientes = new ArrayList<>();

        Cliente cliente1 = new Cliente("Camilo", "123456789");
        Cliente cliente2 = new Cliente("Andres", "987654321");
        Cliente cliente3 = new Cliente("Sofia", "456789123");
        Cliente cliente4 = new Cliente("Valentina", "321654987");

        Cliente[] clientes = {
                cliente1,
                cliente2,
                cliente3,
                cliente4
        };

        for (int i = 0; i < clientes.length; i++) {
            listaClientes.add(clientes[i]);
        }

        System.out.println("Lista de Clientes:");
        for (Cliente cl : listaClientes) {
            System.out.println("La cedula del cliente es: " + cl.getCedula());
        }
        String cedulaBuscada = "123456789";

        for (Cliente cl : listaClientes) {
            if (cl.getCedula().equals(cedulaBuscada)) {
                System.out.println("Cliente encontrado: " + cl.getNombre() + " con cédula " + cl.getCedula());
                break;
            }
        }
    }

}
