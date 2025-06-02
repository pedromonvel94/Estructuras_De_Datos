package listas.listasSimplesEstudiantes;

public class Main {
    public static void main(String[] args) {
        ListaEstudiante lista = new ListaEstudiante();
        Estudiantes estudiante1 = new Estudiantes("Juan Perez", 20);
        Estudiantes estudiante2 = new Estudiantes("Maria Lopez", 22);

        lista.agregarEstudiante(estudiante1);
        lista.agregarEstudiante(estudiante2);
        lista.agregarEstudiante(new Estudiantes("Carlos Sanchez", 21));

        System.out.println("Lista de estudiantes:");
        lista.mostrar();
    }

}
