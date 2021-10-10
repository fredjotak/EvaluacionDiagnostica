package tres;

import java.io.File;

public final class Directorio {
    private int id;
    private String nombre;
    private File ruta;
    
    public Directorio(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
        iniciar();
    }
    
    private void iniciar(){
        try{
             this.ruta = new File(this.nombre);
             if(!this.ruta.exists()){
                 this.ruta.mkdirs();
                 System.out.println("El directorio no existía, se ha creado nuevo directorio.");
             }
        } catch(Exception e){
            System.out.println("Error al instanciar "+ e);
        }
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    
}
