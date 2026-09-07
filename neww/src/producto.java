public class producto {
    private String nombre;
    private String carrera;
    private String curso;

    public producto(String nombre, String carrera, String curso) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getCurso() {
        return curso;
    }

    public String mostrarInformacion() {
        return "Alumno: " + nombre +
               "\nCarrera: " + carrera +
               "\nCurso: " + curso;
    }
}
