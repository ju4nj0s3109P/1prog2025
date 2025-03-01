import com.sun.source.tree.EmptyStatementTree;

import java.util.ArrayList;

public class Guarderia {
    private String nombre;
    private String nit;
    private ArrayList<Estudiante> listaEstudiantes;
    private ArrayList<Estudiante> listaEstudiantesMayores5;

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

    // Buscar un estudiante por ID
    public Estudiante buscarEstudiante(String id) {
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getId().equalsIgnoreCase(id)) {
                return estudiante;
            }
        }
        return null;
    }


    public String listarEstudiantes() {
        if (listaEstudiantes.isEmpty()) {
            return "No hay estudiantes en la guardería.";
        }
        StringBuilder lista = new StringBuilder();
        for (Estudiante estudiante : listaEstudiantes) {
            lista.append(estudiante).append("\n");
        }
        return lista.toString();
    }


    public String listaMayores5() {
        listaEstudiantesMayores5.clear();
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getEdad() > 5) {
                listaEstudiantesMayores5.add(estudiante);
            }
        }
        if (listaEstudiantesMayores5.isEmpty()) {
            return "No hay estudiantes mayores de 5 años.";
        }
        StringBuilder lista = new StringBuilder();
        for (Estudiante estudiante : listaEstudiantesMayores5) {
            lista.append(estudiante).append("\n");
        }
        return lista.toString();
    }


    public Guarderia(String nombre, String nit) {
            this.nombre = nombre;
            this.nit = nit;
            this.listaEstudiantes = new ArrayList<>();
            this.listaEstudiantesMayores5 = new ArrayList<>();
        }

        public String getNombre () {
            return nombre;
        }

        public void setNombre (String nombre){
            this.nombre = nombre;
        }

        public String getNit () {
            return nit;
        }

        public void setNit (String nit){
            this.nit = nit;
        }


}

    /**

     private Estudiante[] listaEstudiantes = new Estudiante[10];

     public boolean AgregarEstudiante(Estudiante nuevoEstudiante) {
     boolean agregado = true;
     for (int i = 0; i < listaEstudiantes.length; i++) {
     if (listaEstudiantes[i].getId().equals(nuevoEstudiante.getId()))
     agregado = false;
     }

     }
     **/


