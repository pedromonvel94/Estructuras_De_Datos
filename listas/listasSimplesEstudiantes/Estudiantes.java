package listas.listasSimplesEstudiantes;

public class Estudiantes {
    String nombre;
    int edad;

    public Estudiantes(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }


    @Override
    public String toString(){
        return "Nombre: " + nombre + ", Edad: " + edad;
    }
}
