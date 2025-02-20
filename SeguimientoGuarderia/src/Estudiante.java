public class Estudiante {
    private String nombre;
    private int edad;
    private String genero;
    private String id;
    private String alerigas;
    private String nombreAcudiente;
    private String contactoAcudiente;

    public Estudiante(String nombre, int edad, String genero, String id, String alerigas,
                      String nombreAcudiente, String contactoAcudiente) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.id = id;
        this.alerigas = alerigas;
        this.nombreAcudiente = nombreAcudiente;
        this.contactoAcudiente = contactoAcudiente;
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


}

