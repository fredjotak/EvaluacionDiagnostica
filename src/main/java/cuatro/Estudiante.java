package cuatro;

public class Estudiante extends Persona{
    private long RU;

    public Estudiante() {
        this.RU = -1;
    }

    public Estudiante(int ci, String nombre, String apellidos, String fechaNacimiento, long RU) {
        super(ci, nombre, apellidos, fechaNacimiento);
        this.RU = RU;
    }

    public long getRU() {
        return RU;
    }

    public void setRU(long RU) {
        this.RU = RU;
    }
    
    @Override
    public void mostrarDatos(){
        System.out.println(String.format("+%50s+", "").replace(" ", "-"));
        System.out.println(String.format("|%37s             |", "DATOS DEL ESTUDIANTE"));
        System.out.println(String.format("| C.I.: %-41s  |", this.ci));
        System.out.println(String.format("| R.U.: %-41s  |", this.RU));
        System.out.println(String.format("| Nombre: %-40s |", this.nombre));
        System.out.println(String.format("| Apellidos: %-37s |", this.apellidos));
        System.out.println(String.format("+%50s+", "").replace(" ", "-"));
    }
    
}
