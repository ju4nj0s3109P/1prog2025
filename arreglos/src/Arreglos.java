import javax.swing.*;

public class Arreglos {

    int [] edades ={2,12,14,5};
    int [] edad = new int [8];
    int obtenerPocision0 = edades [0];
    int sobreEscribir = edades [1] = 24;

    public void recorerArreglo (){
        for (int i=0; i < edades.length; i++) {
            JOptionPane.showInputDialog(null, "la edad es: " + edades[i]);
        }
    }


}
