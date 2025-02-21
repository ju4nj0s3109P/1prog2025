import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.util.ArrayList;

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
        listaEstudiantes.add(estudiante1);
        listaEstudiantes.add(estudiante2);
        listaEstudiantes.add(estudiante3);
        listaEstudiantes.add(estudiante4);
        listaEstudiantes.add(estudiante5);


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


                JOptionPane.showMessageDialog(null, newEstudiante);
                listaEstudiantes.add(newEstudiante);
            }
        } else if (menu == 2) {
            String eliminarEstudiante = JOptionPane.showInputDialog("Ingrese el id del estudiante quiere eliminar");
            for (Estudiante estudiante : listaEstudiantes) {
                if (estudiante.getId().equals(eliminarEstudiante)) {
                    listaEstudiantes.remove(estudiante);
                    System.out.println("Estudiante eliminado correctamente");
                }else{
                    JOptionPane.showInputDialog("El estudiante no existe");
                }
            }
        } else if (menu == 3) {
            System.out.println(listaEstudiantes.toString());
        } else if (menu == 4) {
            String estudianteActualizar = JOptionPane.showInputDialog("Ingrese el id del estudiante quiere actualizar");
            for (Estudiante estudiante : listaEstudiantes) {
                if (estudiante.getId().equals(estudianteActualizar)) {
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el edad"));
                    String genero = JOptionPane.showInputDialog("Ingrese el genero");
                    String alegria = JOptionPane.showInputDialog("Ingrese el alergias");
                    String nombreAcudiente = JOptionPane.showInputDialog("Ingrese el nombre acudiente");
                    String contactoAcudiente = JOptionPane.showInputDialog("Ingrese el contacto");

                    Estudiante newEstudiante = new Estudiante(nombre, edad, genero, estudianteActualizar,
                            alegria, nombreAcudiente, contactoAcudiente);


                }
            }
        } else if (menu == 5) {
            for (Estudiante estudiante : listaEstudiantes) {
                if (estudiante.getEdad() > 5) {
                    listaEstudiantesMayores5.add(estudiante);
                    System.out.println(listaEstudiantesMayores5.toString()
                    );
                }
            }
        }else if (menu == 6) {
            System.out.println("saliendo...");
        }
    }
}