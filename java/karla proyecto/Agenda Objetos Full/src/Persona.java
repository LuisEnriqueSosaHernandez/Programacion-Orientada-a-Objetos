
import java.io.Serializable;

public class Persona implements Serializable{
    private final String nombre;
    private final String direccion;
    private final String email;
    int telefono;
   public Persona(String nombre,String direccion,String email,int telefono){
       this.nombre=nombre;
       this.direccion=direccion;
       this.email=email;
       this.telefono=telefono;
   } 

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefono() {
        return telefono;
    }
   

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", direccion=" + direccion + ", email=" + email + ", telefono=" + telefono + '}';
    }
   
    
}
