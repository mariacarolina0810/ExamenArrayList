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

        for(int i=0; i<nombreE.size(); i++){
            TotalTiempos += tiempoE.get(i);
            System.out.println("Nombre: "+nombreE.get(i)+"\tVelocidad: "+velocidadE.get(i)+"\tTiempo: "+tiempoE.get(i));
        }
        TotalTiempos=TotalTiempos/tiempoE.size();
        System.out.println("El promedio de tiempo de los estudiantes es: " +TotalTiempos);
        int posicionmayor=0;
        double nmayor = velocidadE.get(0);
       for(int y=1; y<velocidadE.size(); y++){
           if(velocidadE.get(y) > nmayor){
               nmayor = velocidadE.get(y);
               posicionmayor = y;
           }
       }
       
               System.out.println("El esttudiante más rapido es: " +nombreE.get(posicionmayor));
               
          int contador=0;
          for(int j=0; j<tiempoE.size(); j++){
            if(tiempoE.get(j)>TotalTiempos){
                contador++;
            }
        }
          System.out.println("Los estudiantes que tuvieron el tiempo por encima del promedio son: "+contador);
                
    }
}
