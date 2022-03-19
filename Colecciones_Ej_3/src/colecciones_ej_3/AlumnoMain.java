/*
Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de
tipo Integer con sus 3 notas.
En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bluce tendremos el siguiente método en la clase Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su
nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
Dentro del método se usará la lista notas para calcular el promedio final de alumno.
Siendo este promedio final, devuelto por el método y mostrado en el main.
 */
package colecciones_ej_3;

import alumno_Ej_3Servicios.AlumnosServicio;
import colecciones_eje3Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoMain {

    public static void main(String[] args) {
       Scanner leer=new Scanner (System.in).useDelimiter("\n");
       String res;
       String nombreBuscar;
       AlumnosServicio alServ=new AlumnosServicio();// comunico con el servicio
       
       ArrayList<Alumno>alumnos=new ArrayList<>();// arrayList de alumnos
       
       do {
           System.out.println("Ingrese el nombre :");
           String nombre=leer.next();
           
           System.out.println("Ingrese la primer nota :");
           Integer nota1=leer.nextInt();
           
           System.out.println("Ingrsee la segunta nota :");
           Integer nota2=leer.nextInt();
           
           System.out.println("Ingrese la tercera nota:");
           Integer nota3=leer.nextInt();
           
           Alumno al=new Alumno();// creo alumno
          
           alumnos.add(al);// agrego alumno al Array
           
           
           System.out.println("Quiere crear otro alumno? si/no");
           res=leer.next();
          
       }while("si".equalsIgnoreCase(res));
       

       System.out.println(" Cantidad de alumnos ingresados "+alumnos.size());//mustro la Cant de alumnos 
    
        System.out.println("Ingresa el nombre del alumno para ver el promedio : ");
        nombreBuscar=leer.next();
        
        for (Alumno aux : alumnos) {
            if(aux.getNombre().equals(nombreBuscar))
                promedio=alServ.
        }
        
}

