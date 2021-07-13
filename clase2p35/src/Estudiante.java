public class Estudiante extends Persona{
    private String facultad;

    public Estudiante(String nombre, String apellido, int id, String facultad){
        super(nombre, apellido, id);
        this.facultad = facultad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    
}
