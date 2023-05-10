public class Main {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        System.out.println(alumno.getNombreAdmiracion());

        System.out.println(recorrer("Juanchi"));

        System.out.println(getValor());

        System.out.println(getPrimerCaracter("Juanchi"));

        System.out.println(paraAString(3));
    }

    public static int recorrer(String cadena) {
        int res = 0;
        for (int i = 1; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ' ') {
                res++;
            }
        }
        return res;
    }
    public static int getValor() {
        int vector[] = { 6, 16, 26,36,46,56,66,76 };
        System.out.println(vector.length);
        int idx = 7;
        return vector[idx];
    }
    public static char getPrimerCaracter(String palabra) {
        String string[] = new String[5];
        string[1] = "Juanchi";
        return (string[1].charAt(0));
    }
    public static String paraAString(int a) {
        int x1 = a;
        return String.valueOf(x1);
    }

    //a)
    // El error es un NullPointerException, basicamente un NRE, nombre es null y al invocar un metodo sobre ese miembro arrojara este error.
    //para correjirlo hay varias opciones, un constructor (con parametros) que evite que el miembro sea null o no fijarlo en null directamente o crear un setter para apuntarlo
    //a otra referencia que no sea null antes de querer invocar un metodo sobre el miembro.
    //vamos a optar por cambiar simplemente la referencia de null a mi nombre (Juanchi). Esto corrige el error.

    //b
    //El error es un Out of Bounds, cuando se recorren cadenas con loops, lo interesante es entender como funcionan los indices. Estos empiezan en 0
    //y terminan en length - 1, en este caso la condicion estaba fijada para terminar en length por el <=, simplemente removiendo el = y que solo
    //sea < arregla el problema.

    //c
    //otro out of bounds, si agregamos un .length y chequeamos el largo del vector nos da 8, pero nosotros queremos acceder al indice 8, y este
    //no existe. por lo tanto tenemos que ir una unidad hacia atras, al 7, esto corrije el error.

    //d
    //cuando inicializamos un vector con tipos de referencia estos se inicializan en null siempre, a menos que explicitamente los inicializemos en algun valor
    //para arreglar esto, basta con inicializar string[1] a lo que queremos para obtener el primer caracter. Mi nombre es suficiente.
    //el siguiente error es que no devuelve el primer caracter, ya que busca el char at (1) y este es el segundo, por los indices, asi que cambiamos a 0.
    //Cabe destacar que todos los demas strings del vector seran nulos (0, 2, 3 y 4).

    //e
    //El uso del tipo Object no es recomendado, Integer esta deprecado y no se debe usar. Para solucionar esto, cambiamos el tipo object a int
    //No se puede castear un value type a un reference type. Para esto debemos usar metodos para lograr lo que necesitamos, en este caso
    //vamos a usar String.valueOf() que es un metodo de la clase String (reference type).
}