package cuatro;

public class Persona {
    protected int ci;
    protected String nombre;
    protected String apellidos;
    protected String fechaNacimiento;

    public Persona() {
        this.ci = -1;
        this.nombre = this.apellidos = this.fechaNacimiento = null;
    }

    public Persona(int ci, String nombre, String apellidos, String fechaNacimiento) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getCi() {
        return this.ci;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public String getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
    public void mostrarDatos(){
        System.out.println(String.format("+%50s+", "").replace(" ", "-"));
        System.out.println(String.format("|%41s         |", "DATOS PERSONALES"));
        System.out.println(String.format("| C.I.: %-41s  |", this.ci));
        System.out.println(String.format("| Nombre: %-40s |", this.nombre));
        System.out.println(String.format("| Apellidos: %-37s |", this.apellidos));
        System.out.println(String.format("+%50s+", "").replace(" ", "-"));
    }
}