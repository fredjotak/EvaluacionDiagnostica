package cuatro;

import java.util.ArrayList;

public class pruebaLaboratorio {
    public static void main(String[] args){
        ArrayList<Estudiante> estud = new <Estudiante>ArrayList();
        estud.add(new Estudiante(7978, "Rodrigo", "Perez", "2003/01/01", 200123));
        estud.add(new Estudiante(4345, "Alan", "Quiñonez", "2002/12/15", 200124));
        estud.add(new Estudiante(6564, "Daniela", "Velazco", "2005/10/27", 200125));
        estud.add(new Estudiante(6434, "Luis", "Mamani Acarapi", "2000/09/13", 200126));
        estud.add(new Estudiante(2353, "Roberto", "Paredes Pillco", "2004/07/25", 200127));
        
        Instructor i1 = new Instructor(5425, "Lola", "Mento Ramirez", "1990/05/23", 23);
        i1.mostrarDatos();
        
        Laboratorio lab = new Laboratorio(12, "Lab de Computación", i1, "De 08:00 hasta 12:00", 10, estud);
        lab.mostrarEstudiantesInscritos();
    }
}
