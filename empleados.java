
package gestiondefacultad;


public class empleados extends persona {
   private int incorporacion;
   private int despacho;
   private float sueldo;
   
   public empleados(){
   int incorporacion=0;
   int despacho=0;
   float sueldo=0;
   }

    public empleados(int incorporacion, int despacho, float sueldo) {
        this.incorporacion = incorporacion;
        this.despacho = despacho;
        this.sueldo = sueldo;
    }

    public empleados( String nombre, String apellido, int dni, int edad, int telefono,
            boolean estadoCivil,int incorporacion, int despacho, float sueldo) {
        super(nombre, apellido, dni, edad, telefono, estadoCivil);
        this.incorporacion = incorporacion;
        this.despacho = despacho;
        this.sueldo = sueldo;
    }
   
   
   
   
   
    

    public int getIncorporacion() {
        return incorporacion;
    }

    public void setIncorporacion(int incorporacion) {
        this.incorporacion = incorporacion;
    }

    public int getDespacho() {
        return despacho;
    }

    public void setDespacho(int despacho) {
        this.despacho = despacho;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    
    
    
  

   



}
