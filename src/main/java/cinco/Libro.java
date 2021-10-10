package cinco;

public class Libro {
    protected int codigo;
    protected String titulo;
    protected Autor autor;
    protected int nroPaginas;

    public Libro(int codigo, String titulo, Autor autor, int nroPaginas) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.nroPaginas = nroPaginas;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return this.autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getNroPaginas() {
        return this.nroPaginas;
    }

    public void setNroPaginas(int nroPaginas) {
        this.nroPaginas = nroPaginas;
    }
    
    public void mostrar(){
       System.out.println(String.format("+%50s+", "").replace(" ", "-"));
        System.out.println(String.format("|%37s             |", "DATOS DEL LIBRO     "));
        System.out.println(String.format("| Código: %-40d |", this.codigo));
        System.out.println(String.format("| Título: %-40s |", this.titulo));
        System.out.println(String.format("| Autor: %41s  |", this.autor.getNombre()));
        System.out.println(String.format("| Nro páginas: %-35d |", this.nroPaginas));
        System.out.println(String.format("+%50s+", "").replace(" ", "-")); 
    }
}
