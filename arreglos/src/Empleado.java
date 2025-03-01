public class Empleado{
    private String nombre;
    private String id;
    private String cargo;
    private int tiempoEnEmpresa;
    private double salario;

    public Empleado(String nombre, String id, String cargo, int tiempoEmpresa, double salario){
        this.nombre = nombre;
        this.id = id;
        this.cargo = cargo;
        this.tiempoEnEmpresa = tiempoEmpresa;
    }
    public String getNombre(){
        return nombre;
    }
    public String getId(){
        return id;
    }
    public String getCargo(){
        return cargo;
    }
    public int getTiempoEnEmpresa(){
        return tiempoEnEmpresa;
    }
    public double getSalario(){
        return salario;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public void setTiempoEnEmpresa(int tiempoEmpresa){
        this.tiempoEnEmpresa = tiempoEmpresa;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", cargo='" + cargo + '\'' +
                ", tiempoEnEmpresa=" + tiempoEnEmpresa +
                ", salario=" + salario +
                '}';
    }
}
