/**
 *
 * @author Guillermo
 */
package clases;

//------------------------------------------------------------------------------

import java.util.HashSet;
import java.util.Objects;

public class Alumno {
    
    private int legajo;
    private String apellido;
    private String nombre;
    HashSet<Materia> materias = new HashSet<Materia>();

    
    //--------------------------------------------------------------------------
    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }
    
        
    //--------------------------------------------------------------------------
    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //--------------------------------------------------------------------------
    public boolean agregarMateria(Materia materiaParam){
        
       return this.materias.add(materiaParam);
    }
    
    public int cantindadMaterias(){
       
        return this.materias.size();
    }
    //--------------------------------------------------------------------------

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.legajo;
        hash = 41 * hash + Objects.hashCode(this.apellido);
        hash = 41 * hash + Objects.hashCode(this.nombre);
        return hash;
    }
       

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.legajo != other.legajo) {
            return false;
        }
        return true;
    }
    //--------------------------------------------------------------------------

    @Override
    public String toString() {
        return  this.apellido + ", " + this.nombre;
    }
    
}
//------------------------------------------------------------------------------