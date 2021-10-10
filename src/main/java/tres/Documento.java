package tres;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Documento {
    private int id;
    private String nombre;
    private Directorio directorio;
    private File archivo;
    final private String FORMATO = ".txt";
    
    public Documento(int id, String nombre, Directorio directorio){
        this.id = id;
        this.nombre = nombre;
        this.directorio = directorio;
        this.archivo = new File(this.directorio.getNombre()+"/"+this.nombre+this.FORMATO);
    }
    
    public boolean crear(){
        try{
            this.archivo.createNewFile();
            return true;
        } catch(IOException e){
            System.out.println("Archivo no creado "+e);
            return false;
        }
    }
    
    public String leer(){
        try{
            FileReader leeArchivo = new FileReader(this.archivo);
            BufferedReader leeBufer = new BufferedReader(leeArchivo);
            String linea = leeBufer.readLine(); //""; // linea temporal
            String texto = null; // toda la cadena de texto
            
            if(linea!=null){
                texto = "";
            }
            while(linea!=null){
                texto += linea+"\n";
                linea = leeBufer.readLine();
            }
            if(texto!=null){
                texto = texto.substring(0, texto.length()-1);
            }
            leeBufer.close();
            return texto;
        } catch(IOException e){
            System.out.println("Error al leer "+e);
            return null;
        }
    }
    
    public void editar(){
        JTextArea area = new JTextArea();
        area.setColumns(30);
        area.setRows(15);
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        area.append(this.leer());
        area.setSize(area.getPreferredSize().width, 20);
        
        Object[] opciones = {"Guardar Archivo", "Cancelar"};
        int ax = JOptionPane.showOptionDialog(null, 
                new JScrollPane(area), 
                this.archivo.getName(),  // Nombre del archivo
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE,
                null, 
                opciones, 
                opciones[1]
        );
        if(ax==0){
            // se escribe
            try {
                FileWriter editaWriter = new FileWriter(this.archivo);
                BufferedWriter editaBufer = new BufferedWriter(editaWriter);
                editaBufer.write(area.getText());
                editaBufer.close();
            } catch(IOException e){
                System.out.println("Error al guardar: "+e);
            }
        }
    }
    
    public boolean borrar(){
        try {
            this.archivo.delete();
            System.out.println("Archivo '"+this.nombre+ "' eliminado");
            this.id = -1;
            this.nombre = null;
            this.archivo = null;
            return true;
        } catch(Exception e) {
            return false;
        }
    }
    
    public void propiedades(){
        System.out.println(String.format("+%40s+", "").replace(" ", "-"));
        System.out.println(String.format("|%31s         |", "PROPIEDADES"));
        try{
            Date dia = new Date(this.archivo.lastModified());
            Calendar calendario = new GregorianCalendar();
            calendario.setTime(dia);
            String modificado = Integer.toString(calendario.get(Calendar.YEAR)) +"/"+ Integer.toString(calendario.get(Calendar.MONTH)+1) +"/"+ Integer.toString(calendario.get(Calendar.DATE)) +" "+ Integer.toString(calendario.get(Calendar.HOUR_OF_DAY)) +":"+ Integer.toString(calendario.get(Calendar.MINUTE)) +":"+ Integer.toString(calendario.get(Calendar.SECOND));
            System.out.println(String.format("| Nombre: %-30s |", this.archivo.getName()));
            System.out.println(String.format("| Modifi: %-30s |", modificado));
            System.out.println(String.format("| Tamaño: %-30s |", String.format("%.2f Kb",(double)this.archivo.length()/1024)));
        } catch(Exception e){
            System.out.println("|%10sNO HAY DETALLES%-10s|"+e);
        }
        System.out.println(String.format("+%40s+\n", "").replace(" ", "-"));
    }
    
    public void renombrar(String nuevo){
        try {
            File nuevoArchivo = new File(this.directorio.getNombre()+"/"+nuevo+this.FORMATO);
            this.archivo.renameTo(nuevoArchivo);
            this.nombre = nuevo;
            this.archivo = new File(this.directorio.getNombre()+"/"+this.nombre+this.FORMATO);
        } catch(Exception e){
            System.out.println("Error al renombrar: "+e);
        }
    }
}