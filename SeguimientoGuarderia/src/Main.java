import javax.swing.JOptionPane;
/**
 * Abstraccion

 * Que pide?
 * sistema almacenará la información detallada de cada niño

 * Info relevante?
 * nombre, edad, género, documento de identidad, alergias,
 * nombre del acudiente y número de contacto.

 * Descomposicion
 *Estudiante
 */
public class Main {
    public static void main(String[] args) {
        Guarderia guarderia = new Guarderia("Guardería Infantil", "123456789");

        boolean salir = false;
        while (!salir) {
            String opcion = JOptionPane.showInputDialog(
                    " MENÚ GUARDERÍA \n" +
                            "1️. Agregar estudiante\n" +
                            "2️. Eliminar estudiante\n" +
                            "3️. Actualizar estudiante\n" +
                            "4️. Listar estudiantes\n" +
                            "5. Listar estudiantes mayores de 5 años\n" +
                            "0. Salir\n\n" +
                            "Seleccione una opción:"
            );

            switch (opcion) {
                case "1": // Agregar estudiante
                    String id = JOptionPane.showInputDialog("Ingrese el ID del estudiante:");
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante:"));
                    String genero = JOptionPane.showInputDialog("Ingrese el género del estudiante:");
                    String nombreAcudiente = JOptionPane.showInputDialog("Ingrese el nombre del acudiente:");
                    String contactoAcudiente = JOptionPane.showInputDialog("Ingrese el contacto del acudiente:");

                    Estudiante nuevoEstudiante = new Estudiante(id, nombre, edad, genero, nombreAcudiente, contactoAcudiente);
                    guarderia.agregarEstudiante(nuevoEstudiante);
                    JOptionPane.showMessageDialog(null, " Estudiante agregado con éxito.");
                    break;

                case "2": // Eliminar estudiante
                    String idEliminar = JOptionPane.showInputDialog("Ingrese el ID del estudiante a eliminar:");
                    Estudiante estudianteEliminar = guarderia.buscarEstudiante(idEliminar);
                    if (estudianteEliminar != null) {
                        guarderia.eliminarEstudiante(estudianteEliminar);
                        JOptionPane.showMessageDialog(null, " Estudiante eliminado.");
                    } else {
                        JOptionPane.showMessageDialog(null, " Estudiante no encontrado.");
                    }
                    break;

                case "3": // Actualizar estudiante
                    String idActualizar = JOptionPane.showInputDialog("Ingrese el ID del estudiante a actualizar:");
                    Estudiante estudianteActualizar = guarderia.buscarEstudiante(idActualizar);
                    if (estudianteActualizar != null) {
                        String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre:", estudianteActualizar.getNombre());
                        int nuevaEdad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva edad:", estudianteActualizar.getEdad()));
                        String nuevoGenero = JOptionPane.showInputDialog("Ingrese el nuevo género:", estudianteActualizar.getGenero());
                        String nuevoAcudiente = JOptionPane.showInputDialog("Ingrese el nuevo nombre del acudiente:", estudianteActualizar.getNombreAcudiente());
                        String nuevoContacto = JOptionPane.showInputDialog("Ingrese el nuevo contacto del acudiente:", estudianteActualizar.getContactoAcudiente());

                        Estudiante datosActualizados = new Estudiante(idActualizar, nuevoNombre, nuevaEdad, nuevoGenero, nuevoAcudiente, nuevoContacto);
                        guarderia.actualizarEstudiante(datosActualizados);
                        JOptionPane.showMessageDialog(null, " Estudiante actualizado con éxito.");
                    } else {
                        JOptionPane.showMessageDialog(null, "️ Estudiante no encontrado.");
                    }
                    break;

                case "4": // Listar estudiantes
                    String lista = guarderia.listarEstudiantes();
                    JOptionPane.showMessageDialog(null, " Lista de estudiantes:\n" + lista);
                    break;

                case "5": // Listar estudiantes mayores de 5 años
                    String listaMayores = guarderia.listaMayores5();
                    JOptionPane.showMessageDialog(null, " Estudiantes mayores de 5 años:\n" + listaMayores);
                    break;

                case "0": // Salir
                    salir = true;
                    JOptionPane.showMessageDialog(null, " ¡Gracias por usar la guardería!");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, " Opción inválida, intente nuevamente.");
            }
        }
    }
}




/**

        Guarderia guarderia = new Guarderia("Guarderia Infatil", "12345");
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        ArrayList<Estudiante> listaEstudiantesMayores5 = new ArrayList<>();
        Estudiante estudiante1 = new Estudiante("Carlos Pérez", 4, "Masculino", "E001",
                "85", "María Pérez", "3001234567");

        Estudiante estudiante2 = new Estudiante("Sofía Gómez", 9, "Femenino", "E002",
                "90", "Andrés Gómez", "3112345678");

        Estudiante estudiante3 = new Estudiante("Luis Fernández", 11, "Masculino", "E003",
                "78", "Carolina Fernández", "3223456789");

        Estudiante estudiante4 = new Estudiante("Valentina Rojas", 5, "Femenino", "E004",
                "95", "Ricardo Rojas", "3124567890");

        Estudiante estudiante5 = new Estudiante("Mateo Ramírez", 10, "Masculino", "E005",
                "88", "Paula Ramírez", "3015678901");
        guarderia.agregarEstudiante(estudiante1);
        guarderia.agregarEstudiante(estudiante2);
        guarderia.agregarEstudiante(estudiante3);
        guarderia.agregarEstudiante(estudiante4);
        guarderia.agregarEstudiante(estudiante5);

        int menu = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero segun la opcion que desea:\n" +
                "1. Agregar Estudiantes.\n" + "2. Eliminar Estudiante. \n" + "3. Mostrar Estudiantes.\n" +
                "4. Actualizar Estudiante.\n " + "5. Mostrar Mayores de 5\n" + "6. Salir.\n"));
        if (menu == 1) {

            int cantEstudiantes = Integer.parseInt(JOptionPane.showInputDialog("Cuantos estudiantes quiere agregar?"));


            for (int i = 0; i < cantEstudiantes; i++) {

                String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
                int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el edad"));
                String genero = JOptionPane.showInputDialog("Ingrese el genero");
                String id = JOptionPane.showInputDialog("Ingrese el id");
                String alegria = JOptionPane.showInputDialog("Ingrese el alergias");
                String nombreAcudiente = JOptionPane.showInputDialog("Ingrese el nombre acudiente");
                String contactoAcudiente = JOptionPane.showInputDialog("Ingrese el contacto");

                Estudiante newEstudiante = new Estudiante(nombre, edad, genero, id,
                        alegria, nombreAcudiente, contactoAcudiente);


                JOptionPane.showMessageDialog(null, "Estudiante agregado correctamente");
                guarderia.agregarEstudiante(newEstudiante);
            }
        } else if (menu == 2) {
            String eliminarEstudiante = JOptionPane.showInputDialog("Ingrese el id del estudiante quiere eliminar");
            Estudiante estudiante=guarderia.bus
                if (estudiante.getId().equals(eliminarEstudiante)) {
                    guarderia.eliminarEstudiante(estudiante);
                    System.out.println("Estudiante eliminado correctamente");
                }else{
                    JOptionPane.showInputDialog("El estudiante no existe");
                }
            }
        } else if (menu == 3) {
            String estudianteListado= JOptionPane.showInputDialog("Ingrese el id del estudiante que quiere ver: ");
            if (estudianteListado.equals(listaEstudiantes.)) {}
            guarderia.listarEstudiantes();
            System.out.println(listaEstudiantes.toString());
        } else if (menu == 4) {
            String estudianteActualizar = JOptionPane.showInputDialog("Ingrese el id del estudiante quiere actualizar");
            guarderia.agregarEstudiante(estudiante1);
            guarderia.agregarEstudiante(estudiante2);
            guarderia.agregarEstudiante(estudiante3);
            guarderia.agregarEstudiante(estudiante4);
            guarderia.agregarEstudiante(estudiante5);
        } else if (menu == 5) {
            for (Estudiante estudiante : listaEstudiantes) {
                if (estudiante.getEdad() > 5) {
                    listaEstudiantesMayores5.add(estudiante);
                    System.out.println(listaEstudiantesMayores5.toString());
                }
            }
        }else if (menu == 6) {
            System.out.println("saliendo...");
        }
    }
}
     **/