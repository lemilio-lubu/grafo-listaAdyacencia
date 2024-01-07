package lógicaEstructurasDatos;

public class ListaEnlazada {
    private Nodo cabeza;

    public ListaEnlazada() {
        this.cabeza = null;
    }

    public void ingresarInfoVertice(Vertice verticeNodo) {
        if (cabeza == null) {
            this.cabeza = new Nodo(verticeNodo);
            return;
        }

        Nodo nuevoNodo = new Nodo(verticeNodo);
        Nodo actual = this.cabeza;

        while (actual.getNodoSiguiente() != null) {
            actual = actual.getNodoSiguiente();
        }

        actual.ingresarNodo(nuevoNodo);

    }

    public boolean compararVerticeEnLista(Vertice verticeComparador) {
        Vertice auxVertice = this.cabeza.getVerticeNodo();
        return auxVertice.esIgualVertice(verticeComparador);
    }

    public void imprimirLista() {
        Nodo auxCabeza = cabeza;
        while(auxCabeza != null) {
            System.out.println(auxCabeza.getVerticeNodo());
            auxCabeza = auxCabeza.getNodoSiguiente();
        }
    }
}
