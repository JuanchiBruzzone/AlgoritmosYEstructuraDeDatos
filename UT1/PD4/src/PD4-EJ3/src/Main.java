public class Main {
    public static void main(String[] args) {
        /*
            String[] students = new String[10];
            String studentName = "Peter Parker";
            students[0] = studentName;
            studentName = null;
            ...
         */

        //Hay 1 referencia para el array en si, 10 para cada indice (nulls al principio)
        //luego hay 1 para asignacion de nombre string, las siguientes dos modifican referencias ya existentes.
        //hay 12 referencias.
        //ningun objeto es candidato a ser eliminado por el garbage collector durante la ejecucion del programa ya que
        //todos siguen teniendo referencias.

        //2) depende del lenguaje utilizado, algunos programas usan managed objects, estos objetos son administrados por el
        //programa y cuando se dan algunas reglas especificas se destruyen, otros lenguajes se debe pedir y devolver memoria,
        //cuando esto pasa se crean y destruyen objetos. En c# particularmente se hace uso de IDisposable, y sus miembros para
        //administrar la vida de los objetos.

        //3

        NumberHolder holder = new NumberHolder(33, 3.333f);

        System.out.println("El valor de anInt es: " + holder.getAnInt());
        System.out.println("El valor de aFloat es: " + holder.getaFloat());
    }
}