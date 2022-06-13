
package gestiondefacultad;

import java.util.Scanner;


public class profesor extends empleados {
    private String departamento;

    public profesor(){
        String departamento="";
    }

    public profesor(String departamento) {
        this.departamento = departamento;
    }

    public profesor(String departamento, int incorporacion, int despacho, float sueldo) {
        super(incorporacion, despacho, sueldo);
        this.departamento = departamento;
    }

    public profesor(String nombre, String apellido, int dni, int edad,
            int telefono, boolean estadoCivil, int incorporacion,
            int despacho, float sueldo,String departamento) {
        super(nombre, apellido, dni, edad, telefono, estadoCivil, incorporacion, despacho, sueldo);
        this.departamento = departamento;
    }
  

    

    
    
    public void cambioDepartamento(){
        Scanner numero = new Scanner(System.in);
        System.out.println("elegir el cambio de departamento ");
        System.out.println("lenguaje,matematica,arquitectura");
        String opcion;
        opcion=numero.nextLine();
        switch(opcion){
            case "lenguaje":
                this.departamento="lenguaje";
               
                break;
            case "matematica":
                this.departamento="matematica";
                break;
            case "arquitectura":
                this.departamento="arquitectura";
                break;
            default:
                System.out.println("incorrecto");
                
                break;
        }
    
    }
    
    
    
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "profesor{" + "departamento=" + departamento + '}';
    }
    public void mostrarTodo(){
        System.out.println("departamento:"+departamento);
        System.out.println("nombre"+nombre);
    }
   
    
    
    
    
    
    
    
}
