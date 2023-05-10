public class Main {
    public static void main(String[] args) {

        double a = 1.0;
        double b = 2.0;
        double c = 3.0;

        //Invocar metodo para probar

        Multisuma multisuma = new Multisuma();
        var d = multisuma.multisuma(a,b,c);
        System.out.println(d);
        //es correcto, imprime 5.0

    }
}