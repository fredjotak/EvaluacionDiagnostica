package cuatro;
import java.util.ArrayList;

public class Laboratorio {
    private int idLab;
    private String nombre;
    private Instructor instructor;
    private String horario;
    private int cuposEquipos;
    private ArrayList<Estudiante> estudiantes;
    
    public Laboratorio(){
        this.idLab = -1;
        this.instructor = new Instructor();
        this.horario = "Sin horario";
        this.estudiantes = new <Estudiante>ArrayList();
    }

    public Laboratorio(int idLab, String nombre, Instructor instructor, String horario, int cuposEquipos, ArrayList<Estudiante> estudiantes) {
        this.idLab = idLab;
        this.nombre = nombre;
        this.instructor = instructor;
        this.horario = horario;
        this.cuposEquipos = cuposEquipos;
        this.estudiantes = estudiantes;
    }

    public int getIdLab() {
        return this.idLab;
    }

    public void setIdLab(int idLab) {
        this.idLab = idLab;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Instructor getInstructor() {
        return this.instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public String getHorario() {
        return this.horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getCuposEquipos() {
        return this.cuposEquipos;
    }

    public void setCuposEquipos(int cuposEquipos) {
        this.cuposEquipos = cuposEquipos;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return this.estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        if(estudiantes.size()<=this.getCuposEquipos()){
            this.estudiantes = estudiantes;
        } else {
            System.out.println("Cupos Insuficientes al actualizar lista de Estidiantes");
        }
    }
    public void aniadirEstudiantes(ArrayList<Estudiante> estudiantes) {
        if(this.estudiantes.size()+estudiantes.size()<=this.getCuposEquipos()){
            for(Estudiante nuevos: estudiantes){
                this.estudiantes.add(nuevos);
            }
        } else {
            System.out.println("Cupos insuficientes para añadir Estudiantes");
        }
    }
    
    public void quitarTodosLosEstudiantes(){
        this.estudiantes.clear();
    }
    
    public void quitarEstudiante(Estudiante estudiante){ 
        int posicionEstudiante = buscarEstudiante(estudiante.getCi()); //Elimiar por RU
        if(posicionEstudiante!=-1){
            this.estudiantes.remove(posicionEstudiante);
        } else {
            System.out.println("No existe el Estudiante, sin cambios: ");
        }
    }
    
    public void mostrarEstudiantesInscritos(){
        System.out.println("ESTUDIANTES INSCRITOS EN EL LABORATORIO "+this.nombre);
        this.estudiantes.forEach(estudian -> {
            estudian.mostrarDatos();
        });
        System.out.println("");
    }
    private int buscarEstudiante(int ci){
        for(int i=0; i<this.estudiantes.size(); i++){
            if(this.estudiantes.get(i).ci==ci){
                return i;
            }
        }
        return -1;
    }
}
