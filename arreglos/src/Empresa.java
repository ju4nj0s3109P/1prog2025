import javax.swing.*;

public class Empresa {
    private String nombre;
    private String nit;
    private Empleado[] listaEmpleados = new Empleado[50];

    public Empresa(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
    }
    public void crearEmpleado(String nombre,String id, String cargo, int tiempoEnEmpresa,double salario){
        Empleado empleado = new Empleado(nombre,id,cargo,tiempoEnEmpresa,salario);
        boolean existe=false;
        int ivacio=-1;
        for (int i = 0; i < listaEmpleados.length; i++){
            if (listaEmpleados[i]!=null){
                if (listaEmpleados[i].getId().equals(id)){
                    System.out.println("El empleado ya existe");
                    return;
                }
            }else{
                if(ivacio==-1){
                    ivacio=i;
                }
            }
        }
        if (ivacio!= -1){
            listaEmpleados[ivacio]=empleado;
            System.out.println("El empleado se ha creado");
        }else{
            System.out.println("No hay mas espacios para empleados");
        }
    }

    public void mostrarEmpleados(){
        boolean hayEmpleados=false;
        for (Empleado empleado : listaEmpleados){
            if (empleado != null){
                System.out.println(empleado);
                hayEmpleados=true;
            }
        }
        if (!hayEmpleados){
            System.out.println("No hay empleados registrados");
        }
    }

    public void buscarEmpleado(String id){
        boolean hayEmpleados=false;
        for (int i = 0; i < listaEmpleados.length; i++){
            if (listaEmpleados[i]!= null && listaEmpleados[i].getId().equals(id)){
                System.out.println(listaEmpleados[i]);
                break;
            }
            if (!hayEmpleados){
                System.out.println("No hay empleados registrados con el id:" + id);
            }
        }
    }
    public void eliminarEmpleado(String id){
        boolean hayEmpleados=false;
        for (int i = 0; i < listaEmpleados.length; i++) {
            if (listaEmpleados[i] != null && listaEmpleados[i].getId().equals(id)) {
                listaEmpleados[i] = null;
                System.out.println("El empleado se elimino con el id:" + id);
                hayEmpleados = true;
                break;
            }
        }
        if (!hayEmpleados){
            System.out.println("No hay empleados registrados con el id:" + id);
        }
    }

    public void modificarEmpleado(String id){
        boolean hayEmpleados=false;
        for (int i = 0; i < listaEmpleados.length; i++) {
            if (listaEmpleados[i] != null && listaEmpleados[i].getId().equals(id)) {
                String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado: ");
                String nuevoCargo = JOptionPane.showInputDialog("Ingrese el cargo del empleado: ");
                int nuevoTiempoEnEmpresa = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiempo en empresa: "));
                listaEmpleados[i].setNombre(nuevoNombre);
                listaEmpleados[i].setCargo(nuevoCargo);
                listaEmpleados[i].setTiempoEnEmpresa(nuevoTiempoEnEmpresa);
                System.out.println("El empleado se modifica con el id:" + id);
                hayEmpleados = true;
                break;

            }
        }
        if (!hayEmpleados){
            System.out.println("No hay empleados registrados con el id:" + id);
        }
    }

    public double calcularSalario(){
        double salarioBase;
        
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
    public Empleado[] getListaEmpleados() {
        return listaEmpleados;
    }
    public void setListaEmpleados(Empleado[] listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

}
