package uno;
public class pruebaCalentador {
    public static void main(String []args){
        CalentadorDeAgua calentador = new CalentadorDeAgua(0, -4, 10, 2);
        calentador.mostrarTemperaturaActual();
        
        // Enfriando
        calentador.enfriar();
        calentador.enfriar();
        calentador.enfriar();
        
        // Calentando
        calentador.calentar();
        calentador.calentar();
        calentador.calentar();
        calentador.calentar();
        calentador.calentar();
        calentador.calentar();
        calentador.calentar();
        calentador.calentar();
    }
}
