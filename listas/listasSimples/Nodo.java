package listas.listasSimples;

public class Nodo {

    int dato;
    Nodo siguiente; // Estos 2 (dato y siguiente) son atributos de la clase Nodo, que mas adelante
                    // los voy a "INICIAR" o "INSTANCIAR" que eso significa que van a comenzar con
                    // un dato

    public Nodo(int dato) { // Metodo constructor por eso se llama como la clase
        this.dato = dato; // Cuando hago referencia a this estoy refiriendome a una variable de clase, y
                          // para usarlo debo hacer uso de un modificador de acceso como "el public,
                          // private, protected"
        // El this me permite traer el atributo de clase, (las variables que estan por
        // fuera de los metodos) como en este caso int dato y Nodo siguiente.

        this.siguiente = null; // Este null es por ejemplo como instanciamos el atributo siguiente.
    }
}
