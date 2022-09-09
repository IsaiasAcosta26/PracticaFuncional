package ejercicio01;

//paginas 192
//auntor paulo coelho
//ISBN:9788408188292
//titulo EL ALQUIMISTA

public class Libro {
    private Integer ISBN;
    private String Titulo;
    private String Autor;
    private int Pagina;

    public Integer getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getPagina() {
        return Pagina;
    }

    public void setPagina(int pagina) {
        Pagina = pagina;
    }

    @Override
    public String toString() {
        return "Libro" + '\n' +
                "Titulo = " + Titulo + '\n' +
                "ISBN = " + ISBN +
                '\n' + "Autor = " + Autor +
                '\n' + "Paginas = " + Pagina;
    }
}
