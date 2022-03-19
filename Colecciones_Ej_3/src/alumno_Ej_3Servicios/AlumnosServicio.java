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
package alumno_Ej_3Servicios;

import colecciones_eje3Entidades.Alumno;
import java.util.ArrayList;

public class AlumnosServicio {
    public Alumno crearAlumno(String nombre, Integer nota1,Integer nota2,Integer nota3){
        ArrayList<Integer>notas=new ArrayList<>();// creo un array para las notas 
        notas.add(nota1);
        notas.add(nota2);// agrego las notas al array de notas
        notas.add(nota3);
        
        Alumno al=new Alumno();
        al.setNombre(nombre);// setteo el nombre del alumno
        al.setNotas(notas);// seteo el array con las tres notas 
        
        return al;
    }
    
    public Double notaFinal(ArrayList<Integer>notas){
        Double promedio;
        Double notaFinal = null;
        
        for (Integer nota : notas) {
            notaFinal=notaFinal+nota;
        }
        promedio=notaFinal/3;
        
        return promedio;
    }
    
   
}






