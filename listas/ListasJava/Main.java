package listas.ListasJava;

import java.util.ArrayList;
import listas.ListasDoblesAplicadas.ClienteFilas;

public class Main {
    public static void main(String[] args) {
        ArrayList<ClienteFilas> listaSemana = new ArrayList<>();

        ClienteFilas lunes = new ClienteFilas();
        lunes.agregarCliente("Camilo");
        lunes.agregarCliente("Andres");
        lunes.agregarCliente("Sofia");
        lunes.agregarCliente("Catalina");

        ClienteFilas martes = new ClienteFilas();
        martes.agregarCliente("Carlos");
        martes.agregarCliente("Ana");
        martes.agregarCliente("Sofia");

        ClienteFilas miercoles = new ClienteFilas();
        miercoles.agregarCliente("Roberto");
        miercoles.agregarCliente("Angela");
        miercoles.agregarCliente("Lucia");

        listaSemana.add(lunes);
        listaSemana.add(martes);
        listaSemana.add(miercoles);

        String[] dias = { "Lunes", "Martes", "Miercoles" };

        for (int i = 0; i < listaSemana.size(); i++) {
            listaSemana.get(i).mostrarTurnos();
            System.out.println("Dia " + dias[i]);
        }
    }
}
