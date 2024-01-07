package lógicaEstructurasDatos;

public class Nodo {

    private Vertice verticeGrafo;
    private Nodo punteroNodo;

    public Nodo(Vertice verticeGrafo) {
        this.verticeGrafo = verticeGrafo;
        this.punteroNodo = null;
    }

    public void ingresarNodo(Nodo nodoIngresado) {
        this.punteroNodo = nodoIngresado;
    }

    public Vertice getVerticeNodo() {
        return this.verticeGrafo;
    }

    public Nodo getNodoSiguiente() {
        return this.punteroNodo;
    }

}
