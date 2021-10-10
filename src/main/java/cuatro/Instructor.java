package cuatro;

public class Instructor extends Persona{
    private long codIntructor;

    public Instructor() {
        this.codIntructor = -1;
    }

    public Instructor(long codIntructor) {
        this.codIntructor = codIntructor;
    }

    public Instructor(int ci, String nombre, String apellidos, String fechaNacimiento, long codIntructor) {
        super(ci, nombre, apellidos, fechaNacimiento);
        this.codIntructor = codIntructor;
    }

    public long getCodIntructor() {
        return this.codIntructor;
    }

    public void setCodIntructor(long codIntructor) {
        this.codIntructor = codIntructor;
    }
    
    @Override
    public void mostrarDatos(){
        System.out.println(String.format("+%50s+", "").replace(" ", "-"));
        System.out.println(String.format("|%36s              |", "DATOS DEL INSTRUCTOR"));
        System.out.println(String.format("| C.I.: %-41s  |", this.ci));
        System.out.println(String.format("| Código: %-40s |", this.codIntructor));
        System.out.println(String.format("| Nombre: %-40s |", this.nombre));
        System.out.println(String.format("| Apellidos: %-37s |", this.apellidos));
        System.out.println(String.format("+%50s+", "").replace(" ", "-"));
    }
    
}
