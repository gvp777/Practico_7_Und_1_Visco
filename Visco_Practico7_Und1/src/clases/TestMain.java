/**
 *
 * @author AsRock
 */
package clases;

import java.util.ArrayList;

/*
ENUNCIADO:

    Se pide:

    En el método main de una clase de nombre Colegio:
    
    a) Crear las materias:
        i. Ingles I de primer año.
        ii. Matemáticas de primer año.
        iii. Laboratorio 1 de primer año
    
    b) Crear 2 alumnos.
        a. López Martin con legajo 1001.
        b. Martínez Brenda con legajo 1002.
        c) Inscribir a López en las 3 materias.
        d) Inscribir a Martínez en las 3 materias y volver a inscribirlo en Laboratorio 1.
        e) Visualizar la cantidad de materias a las que está inscripto cada alumno.
*/


public class TestMain {
    
    public static void main(String[] args) {
        
        //---Creo el Array donde voy a guardar el punto a) y B) del enunciado de arriba---
        ArrayList <Materia> materias = new ArrayList<>();
        ArrayList <Alumno> alumnos = new ArrayList<>();
        
        
        
        //---Creo los objeto de clase Materia---
        
        Materia inglesPrimerAnio = new Materia(1, "Ingles",1);
        Materia matematicasPrimerAnio =new Materia(2, "Matemáticas",1);
        Materia laboratorioPrimerAnio =new Materia(3, "Laboratorio",1);
        
        //---Creo los objeto de clase Alumno---
        
         Alumno lopezMartin  = new Alumno(1001,"López","Martin");
         Alumno martinezBrenda = new Alumno(1002,"Martínez","Brenda");
        
         
         
        //---Agrego materias al Array<Materia>---
        
        materias.add(inglesPrimerAnio);
        materias.add(matematicasPrimerAnio);
        materias.add(laboratorioPrimerAnio);
        
        //---Agrego alumnos al Array<Alumno>---
        
        alumnos.add(new Alumno(1001,"López","Martin"));
        alumnos.add(new Alumno(1002,"Martínez","Brenda"));
        
        
        
        //---Inscribo a López en las 3 materias---
        
        lopezMartin.agregarMateria(inglesPrimerAnio);
        lopezMartin.agregarMateria(matematicasPrimerAnio);
        lopezMartin.agregarMateria(laboratorioPrimerAnio);
        
        
        //---Inscribo a Martínez en las 3 materias y vuelvo a inscribirla en Laboratorio 1---
        
        martinezBrenda.agregarMateria(inglesPrimerAnio);
        martinezBrenda.agregarMateria(matematicasPrimerAnio);
        martinezBrenda.agregarMateria(laboratorioPrimerAnio);                   
        martinezBrenda.agregarMateria(laboratorioPrimerAnio);                   //<---Se repite la incripcion en una materia que 'Brenda Martínez' ya estaba inscrippta
        
        
        //---Visualizo la cantidad de materias a las que está inscripto cada alumno---
        
        System.out.println("Cantidad de Materias por López,Martin: " 
                                + lopezMartin.cantindadMaterias());
        
        
        System.out.println("Cantidad de Materias por Martínez, Brenda: " 
                                + martinezBrenda.cantindadMaterias());
        
        
             
        
        
        
    }
}
