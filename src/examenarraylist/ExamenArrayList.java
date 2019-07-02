/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenarraylist;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jaimetoon
 */
public class ExamenArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        double promedioT, PromdioEP = 0, tiempo = 0, TotalTiempos = 0,velocidad;
        int metro = 100;
        String nombre;
        ArrayList<String> nombreE = new ArrayList();
        ArrayList<Double> velocidadE = new ArrayList();
        ArrayList<Double> tiempoE = new ArrayList();

                
        boolean continuar = true;
        int decision = 1;
        while (continuar) {
            System.out.println("Ingrese el nombre del estudiante");
            nombreE.add(leer.next());
            System.out.println("Ingrese la velocidad del estudiante");
            velocidad = leer.nextDouble();
            velocidadE.add(velocidad);
            tiempo = (100 / velocidad);
            tiempoE.add(tiempo);

            System.out.println("Desea ingresar mas Datos de alumnos? (1 para continuar, 2 para salir)");
            decision = leer.nextInt();

            if (decision == 2) {
                continuar = false;
            }
        }

              
    }
}
