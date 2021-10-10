package uno;
public class CalentadorDeAgua {
    private int temperaturaActual;
    private final int temperaturaMinima;
    private final int temperaturaMaxima;
    private final int incremento;

    public CalentadorDeAgua(int temperaturaActual, int temperaturaMinima, int temperaturaMaxima, int incremento) {
        this.temperaturaActual = temperaturaActual;
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
        this.incremento = incremento;
    }
    
    public boolean calentar(){
        boolean estado = false;
        if( this.temperaturaActual+this.incremento<=this.temperaturaMaxima){
            this.temperaturaActual += this.incremento;
            System.out.println("Calentando");
            estado =  true;
        } else {
            this.alerta("máxima");
        }
        this.mostrarTemperaturaActual();
        return estado;
    }
   
    public boolean enfriar(){
        boolean estado = false;
        if( this.temperaturaActual-this.incremento>=this.temperaturaMinima){
            System.out.println("Enfriando");
            this.temperaturaActual -= this.incremento;
            estado = true;
        } else {
            this.alerta("mínima");
        }
        this.mostrarTemperaturaActual();
        return estado;
    }
    
    public void mostrarTemperaturaActual(){
        System.out.println(String.format("+%75s+", "").replace(" ", "-"));
        System.out.println("| Temperatura Actual | Temperatura Mínima | Temperatura Máxima | Incremento |");
        System.out.println(String.format("| %11d °C     | %11d °C     | %11d °C     | %5d °C   |", this.temperaturaActual, this.temperaturaMinima, this.temperaturaMaxima, this.incremento));
        System.out.println(String.format("+%75s+", "").replace(" ", "-") + "\n");
    }
    
    private void alerta(String tipo){
        System.out.println("\u001B[31m"+"ALERTA: Temperatura "+ tipo +" superada."+"\u001B[0m");
    }
}
