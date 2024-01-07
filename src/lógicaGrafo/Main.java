package lógicaGrafo;

public class Main {
    public static void main(String[] args) {
        /*
        Requerimientos:
            - representación del grafo a partir de listas enlazadas
            - no acepte ingresas dos nodos con la misma información
            - permita ingresar el numero de nodos

        src:

            - logica
                - vertice
                - listaAdyacencia
            - estructuraDeDatos
                - nodos
                - listaEnlazada

        Consideraciones:
            Al ingresar la informacion al momento de crear el vértice ingresarlo con ""
            para detectar que es un string, incluso si la info del vertice es un numero
         */

        ListaAdyacencia grafo = new ListaAdyacencia(5);

        grafo.crearVertice("A");
        grafo.crearVertice("B");
        grafo.crearVertice("C");
        grafo.crearVertice("D");
        grafo.crearVertice("E");

        try {
            grafo.generarArco("A", "B");
            grafo.generarArco("A", "C");
            grafo.generarArco("B", "C");
            grafo.generarArco("B", "E");
            grafo.generarArco("D", "D");
            grafo.generarArco("D", "E");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        grafo.imprimirTablaDirectorio();
    }
}