package tres;/*
import javax.swing.JOptionPane;
import javax.swing.*;*/

public class pruebaCarpetas {
    public static void main(String []args){
        Directorio dir = new Directorio(1, "prueba");
        
        Documento doc1 = new Documento(1, "texto_1", dir);
        doc1.crear();
        doc1.editar();
        doc1.renombrar("docu_2");
        System.out.println(doc1.leer());
        doc1.propiedades();
        
        Documento doc2 = new Documento(1, "texto_2", dir);
        doc2.crear();
        doc2.editar();
        System.out.println(doc2.leer());
        doc1.borrar();
    }
}
