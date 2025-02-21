import java.util.ArrayList;

public class Guarderia {
    private String nombre;
    private String nit;
    private ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    private ArrayList<Estudiante> listaEstudiantesMayores5 = new ArrayList<>();

    public void agregarEstudiante(Estudiante newEstudiante) {
        listaEstudiantes.add(newEstudiante);
    }

    public void eliminarEstudiante(Estudiante estudianteEliminar) {
        listaEstudiantes.remove(estudianteEliminar);
    }

    public void actualizarEstudiante(Estudiante estudianteActualizar) {
        for (Estudiante indexEstudiante : listaEstudiantes) {

            if (indexEstudiante.getId().equals(estudianteActualizar.getId())) {
                indexEstudiante.setNombre(estudianteActualizar.getNombre());
                indexEstudiante.setEdad(estudianteActualizar.getEdad());
                indexEstudiante.setGenero(estudianteActualizar.getGenero());
                indexEstudiante.setNombreAcudiente(estudianteActualizar.getNombreAcudiente());
                indexEstudiante.setContactoAcudiente(estudianteActualizar.getContactoAcudiente());
                break;
            }
        }
    }

    public void listarEstudiantes(Estudiante estudianteListado) {
        for (Estudiante estudiante : listaEstudiantes) {
            System.out.println("Estudiante" + listaEstudiantes.indexOf(estudiante) + " " + estudiante.getNombre());
        }
    }
    public void listaMayores5(Estudiante estudianteMayor) {
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getEdad() > 5){
                listaEstudiantesMayores5.add(estudiante);
            }
        }
    }

    public Guarderia(String nombre) {
        this.nombre = nombre;
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
}
