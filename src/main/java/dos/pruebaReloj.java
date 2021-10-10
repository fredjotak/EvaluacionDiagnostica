package dos;

public class pruebaReloj {
    public static void main(String[] args){
        Reloj reloj = new Reloj(23,55);
        reloj.mostrarReloj();
        reloj.ajustarMinuto(3);
        reloj.mostrarReloj();
        reloj.ajustarMinuto(1);
        reloj.mostrarReloj();
        reloj.ajustarMinuto(1);
        reloj.mostrarReloj();
        reloj.ajustarMinuto(1);
        reloj.mostrarReloj();
        reloj.ajustarMinuto(-1);
        reloj.mostrarReloj();
        reloj.ajustarMinuto(-1);
        reloj.mostrarReloj();
        reloj.ajustarHora(-5);
        reloj.mostrarReloj();
        reloj.ajustarHora(2);
        reloj.mostrarReloj();
    }
}
