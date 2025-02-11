// Clase Main
import java.util.ArrayList;
public class Main {
    //Metodo Principal
    public static void main(String[] args) {
        String nombre = "Juan Jose";
        int edad = 18;
        boolean isVivo = true;
        char inicial = 'j';

/**
 *       System.out.printf("Hello soy " + nombre + " tengo "
 *               + edad + " estoy " + isVivo + " mi inicial es " + inicial + "\n");
 */
//        numMayor();
//          nominverso();
//        tablaDeMultiplicacionX();
        numeroRepetido();


    }
//Ejercicio 1
    public static void nominverso() {

        String nombre1 = "carlos";
        String nombre2 = "jose";
        String nombre3 = "pablo";
        String nombre4 = "andres";
        String nombre5 = "liliana";

        ArrayList listaNombres = new ArrayList();

        listaNombres.add(nombre1);
        listaNombres.add(nombre2);
        listaNombres.add(nombre3);
        listaNombres.add(nombre4);
        listaNombres.add(nombre5);
        System.out.println(listaNombres.reversed());
        }
// Ejercicio 2

    public static void numMayor() {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;

        if (num1 == num2 && num1 == num3) {
            System.out.println("Todos los numeros son iguales");
        } else if (num1 > num2 && num1 >num3) {
            System.out.println("El numero mayor es el " + num1);
        }else if (num2 > num1 && num2 > num3) {
            System.out.println("El numero mayor es el " + num2);
        }else{
            System.out.println("El numero mayor es el " + num3);
                  }


    }
 //Ejercicio 3

    public static void tablaDeMultiplicacionX() {
        int num=2;
        int multipicador=0;
        ArrayList listaMultiplicacion = new ArrayList();
        for (int i=0;i<=10;i++) {
            int multiplicacion = num*i;
            listaMultiplicacion.add(multiplicacion);
        }
        System.out.println(listaMultiplicacion);
    }

 // Ejercicio 4

    public static void numeroRepetido() {
        int num1 = 1;
        int num2 = 2;
        int num3 = 1;
        ArrayList listaNumeros = new ArrayList();
        listaNumeros.add(num1);
        listaNumeros.add(num2);
        listaNumeros.add(num3);
        boolean repetidos = listaNumeros.equals(num1);
        System.out.println(repetidos);
    }





}
