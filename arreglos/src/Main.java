import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = null;

        while (true) {
            String opcion = JOptionPane.showInputDialog("1. Registrar una empresa.\n" +
                    "2. Agregar empleados a la empresa.\n" +
                    "3. Mostrar empleados registrados.\n" +
                    "4. Calcular y mostrar el salario de cada empleado.\n" +
                    "5. Buscar empleado por id.\n" +
                    "6. Buscar empleados por cargo.\n" +
                    "7. Empleado con mas y menos salario.\n" +
                    "8. Salir del programa.\n");

            switch (opcion) {
                case "1":
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empresa ");
                    String nit = JOptionPane.showInputDialog("Ingrese el nit del empresa");
                    empresa = new Empresa(nombre, nit);
                    empresa.cargarDatos();
                    break;
                case "2":
                    if (empresa == null) {
                        JOptionPane.showMessageDialog(null, "Debe crear empresa primero.");
                        break;
                    }
                    String nombreEmpleado = JOptionPane.showInputDialog("Ingrese el nombre del empleado ");
                    String idEmpleado = JOptionPane.showInputDialog("Ingrese el id del empleado ");
                    String cargoEmpleado = JOptionPane.showInputDialog("Ingrese el cargo de empleado ");
                    int tiempoEnEmpresa = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiempo en empresa"));
                    double salario = empresa.calcularSalario(cargoEmpleado, tiempoEnEmpresa);
                    empresa.crearEmpleado(nombreEmpleado, idEmpleado, cargoEmpleado, tiempoEnEmpresa, salario);
                    break;
                case "3":
                    if (empresa == null) {
                        JOptionPane.showMessageDialog(null, "Debe crear empresa primero.");
                        break;
                    }
                    empresa.mostrarEmpleados();
                    break;
                case "4":
                    if (empresa == null) {
                        JOptionPane.showMessageDialog(null, "Debe crear empresa primero.");
                        break;
                    }
                    int tiempo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiempo en empresa"));
                    String cargo = JOptionPane.showInputDialog("Ingrese el cargo: ");
                    double salarioCalculado = empresa.calcularSalario(cargo, tiempo);
                    JOptionPane.showMessageDialog(null, "El salario es: " + salarioCalculado);
                    break;
                case "5":
                    if (empresa == null) {
                        JOptionPane.showMessageDialog(null, "Debe crear empresa primero.");
                        break;
                    }
                    String idbuscado = JOptionPane.showInputDialog("Ingrese el id del empleado ");
                    empresa.buscarEmpleado(idbuscado);
                    break;
                case "6":
                    if (empresa == null) {
                        JOptionPane.showMessageDialog(null, "Debe crear empresa primero.");
                        break;
                    }
                    String cargoBuscado = JOptionPane.showInputDialog("Ingrese el cargo que desea buscar: ");
                    empresa.buscarCargo(cargoBuscado);
                    break;
                case "7":
                    if (empresa == null) {
                        JOptionPane.showMessageDialog(null, "Debe crear empresa primero.");
                        break;
                    }
                    empresa.empleadoMasSalario();
                    empresa.empleadoMenosSalario();
                    break;
                case "8":
                    JOptionPane.showMessageDialog(null, "Gracias por usar el programa.");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida. Intente nuevamente.");

            }

        }
    }
}