package listas.ListasDoblesAplicadas;

public class Cliente { // Este por ejemplo seria el nodo
    String nombre; // Estos son los atributos que serian el equivalente al dato dentro del nodo
    String estado;
    int turno;

    Cliente siguiente, anterior;

    public Cliente(String nombre, int turno) {
        this.nombre = nombre;
        this.estado = "En espera";
        this.turno = turno;
        this.siguiente = null;
        this.anterior = null;
    }

    public void atender() {
        this.estado = "Atendido";
    }

}
