public class Alumno {
    private String nombre;
    public Alumno () {
        nombre = "Juanchi";
    }
    public String getNombreAdmiracion() {
        return nombre.concat("!");
    }
}
