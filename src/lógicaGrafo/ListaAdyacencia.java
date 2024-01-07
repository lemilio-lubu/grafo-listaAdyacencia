package lógicaGrafo;
import lógicaEstructurasDatos.ListaEnlazada;
import lógicaEstructurasDatos.Vertice;

public class ListaAdyacencia {
    private int numeroDeVertice;
    private ListaEnlazada[] tablaDirectorio;
    private int indiceVerticesIngresado;
    public ListaAdyacencia(int numeroDeVertice) {
        this.numeroDeVertice = numeroDeVertice;
        this.tablaDirectorio = new ListaEnlazada[this.numeroDeVertice];
        llenarListaEnlazada();
        this.indiceVerticesIngresado = 0;
    }

    private void llenarListaEnlazada() {
        for (int i = 0; i < this.tablaDirectorio.length; i++) {
            this.tablaDirectorio[i] = new ListaEnlazada();
        }
    }

    public void crearVertice(String informacionVertice) {
        boolean bandExistencia = existeVertice(informacionVertice) >= 0;
        if(!bandExistencia){
            Vertice verticeLista = new Vertice(informacionVertice);
            verticeLista.asignarNumeroVertice(this.indiceVerticesIngresado);
            this.tablaDirectorio[this.indiceVerticesIngresado++].ingresarInfoVertice(verticeLista);
        }
    }

    private int existeVertice(String informacionVertice) {
        Vertice vertice_comparador = new Vertice(informacionVertice);
        boolean encontrado = false;
        int i = 0;
        for (; (i < this.indiceVerticesIngresado) && !encontrado; ) {
            encontrado = this.tablaDirectorio[i].compararVerticeEnLista(vertice_comparador);
            if (!encontrado) i++;
        }
        return (i < this.indiceVerticesIngresado) ? i : -1;
    }

    public void generarArco(String infoVerticeSalida, String infoVerticeLlegada) throws Exception {
        int indiceVerticeLlegada, indiceVerticeSalida;
        indiceVerticeSalida = existeVertice(infoVerticeSalida);
        indiceVerticeLlegada = existeVertice(infoVerticeLlegada);
        if(encontrar(indiceVerticeSalida,indiceVerticeLlegada)){
            throw new Exception("NO EXISTE EL VERTICE");
        }
        asignarArcoEnTablaDierectorio(infoVerticeSalida, indiceVerticeLlegada, indiceVerticeSalida);
    }

    private void asignarArcoEnTablaDierectorio(String infoVerticeSalida, int indiceVerticeLlegada, int indiceVerticeSalida) {
        Vertice verticeSalida = new Vertice(infoVerticeSalida);
        verticeSalida.asignarNumeroVertice(indiceVerticeSalida);
        this.tablaDirectorio[indiceVerticeLlegada].ingresarInfoVertice(verticeSalida);
    }

    private boolean encontrar(int indiceVerticeSalida, int indiceVerticeLlegada) {
        return indiceVerticeSalida < 0 && indiceVerticeLlegada < 0;
    }

    @Override
    public String toString() {
        return tablaDirectorio.toString();
    }

    public void imprimirTablaDirectorio() {
        for (int i = 0; i < this.tablaDirectorio.length; i++) {
            System.out.print("Indice " + i +": ");
            this.tablaDirectorio[i].imprimirLista();
        }
    }
}
