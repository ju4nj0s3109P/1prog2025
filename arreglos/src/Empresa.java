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
                hayEmpleados=true;
                break;
            }
        }
        if (!hayEmpleados) {
            System.out.println("No hay empleados registrados con el id:" + id);
        }
    }
    public void buscarCargo(String cargo){
        boolean encontrado=false;
        for (int i = 0; i < listaEmpleados.length; i++){
            if (listaEmpleados[i] != null && listaEmpleados[i].getCargo().equals(cargo)){
                System.out.println(listaEmpleados[i]);
                encontrado=true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay empleados registrados con cargo:" + cargo);
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

    public double calcularSalario(String cargo, int tiempo){
        double salarioBase;
        switch (cargo.toLowerCase()){
            case "ayudante":
                salarioBase = 100;
                break;
            case "supervisor":
                salarioBase = 500;
                break;
            case "gerente":
                salarioBase = 1000;
                break;
                default:
                    salarioBase = 0;
        }
        if (tiempo>=10){
            salarioBase = salarioBase * 1.15;
        }
        else if (tiempo>=5){
            salarioBase = salarioBase * 1.1;
        }
        else if (tiempo>=3){
            salarioBase = salarioBase * 1.05;
        }
        return salarioBase;
    }
    public void empleadoMasSalario(){
        Empleado empleadoMasSalario=null;
        double salarioMayor=0;
        for (Empleado empleado : listaEmpleados){
            if (empleado != null && empleado.getSalario()>salarioMayor){
                empleadoMasSalario = empleado;
                salarioMayor = empleado.getSalario();
            }
        }

        if (empleadoMasSalario==null){
            System.out.println("No hay empleados registrados");
        }else{
            System.out.println( "el empleado con mas salario es :" + empleadoMasSalario);
        }
    }
    public void empleadoMenosSalario(){
        Empleado empleadoMenosSalario=null;
        double salarioMenos=9999;

        for (Empleado empleado : listaEmpleados){
            if (empleado != null && empleado.getSalario()<salarioMenos){
                empleadoMenosSalario = empleado;
                salarioMenos = empleado.getSalario();
            }
        }
        if (empleadoMenosSalario==null){
            System.out.println("No hay empleados registrados");
        }else{
            System.out.println("El empleado con menos salario es :" + empleadoMenosSalario);
        }
    }
    public void cargarDatos() {
        listaEmpleados[0] = new Empleado("Juan Pérez", "E001", "ayudante",
                2, calcularSalario("ayudante",2));
        listaEmpleados[1] = new Empleado("María González", "E002", "supervisor",
                5, calcularSalario("supervisor", 5));
        listaEmpleados[2] = new Empleado("Carlos Ramírez", "E003", "gerente",
                10, calcularSalario("gerente", 10));
        listaEmpleados[3] = new Empleado("Ana Torres", "E004", "ayudante",
                4, calcularSalario("ayudante", 4));
        listaEmpleados[4] = new Empleado("Pedro Jiménez", "E005", "supervisor",
                7, calcularSalario("supervisor", 7));
        System.out.println("Datos de empleados cargados.");

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
