
package gestiondefacultad;


public class personalDeServicio extends empleados {
    private String seccion;
    
    
    public personalDeServicio(){
    String seccion="";
    }

    public personalDeServicio(String seccion) {
        this.seccion = seccion;
    }

    public personalDeServicio( int incorporacion, int despacho, float sueldo,String seccion) {
        super(incorporacion, despacho, sueldo);
        this.seccion = seccion;
    }

    public personalDeServicio( String nombre, String apellido, int dni, int edad, int telefono, boolean estadoCivil, int incorporacion, int despacho, float sueldo,String seccion) {
        super(nombre, apellido, dni, edad, telefono, estadoCivil, incorporacion, despacho, sueldo);
        this.seccion = seccion;
    }
    
    

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
    
    
}
