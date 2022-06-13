
package gestiondefacultad;

import java.util.Scanner;


public class estudiante extends persona {
   private String curso;

    public estudiante(String curso) {
        this.curso=curso;
    }

    public estudiante() {
        String curso="";
       
    }

    
    public estudiante(String nombre, String apellido, int dni, int edad, int telefono, boolean estadoCivil,String curso) {
        super(nombre, apellido, dni, edad, telefono, estadoCivil);
        this.curso=curso;
        
        
    }
  
    
    public void mostrarCurso(){
       
        System.out.println("curso="+curso);
        System.out.println(getNombre());
     }
   
   
    

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

   

    
    
    
    
    
    
}
