package lógicaEstructurasDatos;

public class Vertice {
    private int numeroVertice;
    private  String infoVertice;

    public Vertice(String infoVertice) {
        this.infoVertice = infoVertice;
        this.numeroVertice = -1;
    }

    public void asignarNumeroVertice(int numeroasignado){
        this.numeroVertice = numeroasignado;
    }
    public boolean esIgualVertice(Vertice verticePrueba){
        return this.infoVertice.equals(verticePrueba.getInformacionVertice());
    }

    private String getInformacionVertice() {
        return this.infoVertice;
    }

    @Override
    public String toString() {
        return "[ " +
                "N°" + numeroVertice +
                " info" + infoVertice + '\'' +
                "] -> ";
    }
}
