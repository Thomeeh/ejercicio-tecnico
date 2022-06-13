
package gestiondefacultad;




public class persona {
    String nombre;
    String apellido;
    int dni;
    int edad;
    int telefono;
    boolean estadoCivil;    

    public persona() {
        String nombre="";
        String apellido="";
        int dni=0;
        int edad=0;
        int telefono=0;
        boolean estadoCivil=false;
    }

     
    
    public persona(String nombre,String apellido,int dni,int edad,int telefono,
            boolean estadoCivil) {
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.edad=edad;
        this.telefono=telefono;
        this.estadoCivil=estadoCivil;
        
    }
    public void cambiarEstado(){
        if(estadoCivil==false){
        this.estadoCivil=true;
        }
        else{
        this.estadoCivil=false;
        }
        
        
    }
    public void mostrarEstado(){
        System.out.println("nuevo estado ="+getEstadoCivil());
    }

    
    
    
    
    
    
    
    
    
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(boolean estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "persona{" + "nombre=" + nombre + '}';
    }

    

   


    
  

}


    




