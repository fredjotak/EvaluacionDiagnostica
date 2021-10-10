package dos;
public class Reloj {
    private int hora; // formato 24 horas 00 a 23
    private int minuto; // de 00 a 59

    public Reloj(int hora, int minuto) {
        this.hora = Math.abs(hora)%24;
        this.minuto = Math.abs(minuto)%60;
    }
    
    public void ajustarHora(int hora){
        if(hora>0){
            this.hora = (this.hora+hora)%24;
            //System.out.println("Mas "+hora+" horas.");
        } else {
            this.hora = ((this.hora+(24+hora))%24);
            //System.out.println("Menos "+hora+" horas.");
        }
    }
    
    public void ajustarMinuto(int minuto){
        if(minuto>0){
            ajustarHora((this.minuto+minuto)/60);
            this.minuto = (this.minuto+minuto)%60;
            System.out.println("Más "+minuto+" minutos.");
        } else {
            ajustarHora((this.minuto-59+minuto)/60);
            this.minuto = (60+this.minuto+(minuto%60))%60;
            System.out.println("Menos "+minuto+" minutos.");
        }
    }
    
    public void mostrarReloj(){
        System.out.println(String.format("+%9s+", "").replace(" ", "-"));
        System.out.println(String.format("|  %02d:%02d  |", this.hora, this.minuto));
        System.out.println(String.format("+%9s+", "").replace(" ", "-")+"\n");
    }
    
    
}
