package SeriesYVideojuegos;

public class Serie implements Entregable {

    private String titulo;
    private int numeroTemporadas = 3;
    private boolean entregado = false;
    private String creador;
    private String genero;

    public Serie() {}

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, int numeroTemporadas, String creador, String genero) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.creador = creador;
        this.genero = genero;
    }

    public Serie(String titulo, int numeroTemporadas, boolean entregado, String creador, String genero) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.entregado = entregado;
        this.creador = creador;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public String getCreador() {
        return creador;
    }

    public String getGenero() {
        return genero;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void entregar() {
        entregado = true;
    }

    @Override
    public void devolver() {
        entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return entregado;
    }

    @Override
    public int compareTo(Object a) {
        Serie otra = (Serie) a;
        return Integer.compare(this.numeroTemporadas, otra.numeroTemporadas);
    }

    @Override
    public String toString() {
        return "Serie [titulo=" + titulo +", temporadas=" + numeroTemporadas +", entregado=" + entregado +
        		", creador=" + creador +", genero=" + genero + "]";
    }
}
