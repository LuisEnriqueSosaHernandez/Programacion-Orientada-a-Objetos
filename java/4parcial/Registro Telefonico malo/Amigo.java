public class Amigo implements java.io.Serializable {
 
    int CodigoAmigo;
    String Nombre;
    String Apellido;
    String Numtel;
 
    public Amigo(int codigoAmigo, String nombre, String apellido, String numtel) {
        super();
        CodigoAmigo = codigoAmigo;
        Nombre = nombre;
        Apellido = apellido;
        Numtel = numtel;
    }
 
    public Amigo() {
        super();
    }
 
    public String getApellido() {
        return Apellido;
    }
 
    public void setApellido(String apellido) {
        Apellido = apellido;
    }
 
    public int getCodigoAmigo() {
        return CodigoAmigo;
    }
 
    public void setCodigoAmigo(int codigoAmigo) {
        CodigoAmigo = codigoAmigo;
    }
 
    public String getNumtel() {
        return Numtel;
    }
 
    public void setNumtel(String numtel) {
        Numtel = numtel;
    }
 
    public String getNombre() {
        return Nombre;
    }
 
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
 
    public void mostrar() {
        System.out.println("Posicion en la agenda: "+this.getCodigoAmigo());
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Apellidos: "+this.getApellido());
        System.out.println("Numero telefonico: "+this.getNumtel());
    }
 
}


