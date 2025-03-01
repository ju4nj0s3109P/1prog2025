public class Estudiante {
    private String id;
    private String nombre;
    private int edad;
    private String genero;
    private String alerigas;
    private String nombreAcudiente;
    private String contactoAcudiente;

    public Estudiante(String id,String nombre, int edad, String genero, String alerigas,
                      String nombreAcudiente, String contactoAcudiente) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.id = id;
        this.alerigas = alerigas;
        this.nombreAcudiente = nombreAcudiente;
        this.contactoAcudiente = contactoAcudiente;
    }

    public Estudiante(String idActualizar, String nuevoNombre, int nuevaEdad, String nuevoGenero, String nuevoAcudiente, String nuevoContacto) {
        this.id = idActualizar;
        this.nombre = nuevoNombre;
        this.edad = nuevaEdad;
        this.genero = nuevoGenero;
        this.alerigas = nuevoAcudiente;
        this.nombreAcudiente = nuevoAcudiente;
        this.contactoAcudiente = nuevoContacto;

    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getAlerigas() {
        return alerigas;
    }
    public void setAlerigas(String alerigas) {
        this.alerigas = alerigas;
    }
    public String getNombreAcudiente() {
        return nombreAcudiente;
    }
    public void setNombreAcudiente(String nombreAcudiente) {
        this.nombreAcudiente = nombreAcudiente;
    }
    public String getContactoAcudiente() {
        return contactoAcudiente;
    }
    public void setContactoAcudiente(String contactoAcudiente) {
        this.contactoAcudiente = contactoAcudiente;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                ", id='" + id + '\'' +
                ", alerigas='" + alerigas + '\'' +
                ", nombreAcudiente='" + nombreAcudiente + '\'' +
                ", contactoAcudiente='" + contactoAcudiente + '\'' +
                '}';
    }
}

