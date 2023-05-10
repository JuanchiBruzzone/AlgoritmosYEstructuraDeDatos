public class Contador implements IContador {

    public final int MAX_CONT = 50;
    private int incremento;
    private int contador;

    public Contador(int incremento, int contador) {
        this.incremento = incremento;
        this.contador = contador;
    }

    public void mostrarContadorWhile() {
        while(contador <= MAX_CONT) {
            System.out.println(contador);
            contador += incremento;
        }
    }

    public void mostrarContadorDoWhile(){
        do {
            System.out.println(contador);
            contador += incremento;
        } while(contador <= MAX_CONT);
    }

    public void mostrarContadorFor(){
        for (int i = 0; i < MAX_CONT; i++) {
            System.out.println(contador);
            contador += incremento;
        }
    }
}
