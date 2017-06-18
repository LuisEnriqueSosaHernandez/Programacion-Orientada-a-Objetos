public class Empleado implements java.io.Serializable {
 
    int CodigoEmpleado;
    String Nombre;
    String Apellido;
    int Nihss;
 
    public Empleado(int codigoEmpleado, String nombre, String apellido, int nihss) {
        super();
        CodigoEmpleado = codigoEmpleado;
        Nombre = nombre;
        Apellido = apellido;
        Nihss = nihss;
    }
 
    public Empleado() {
        super();
    }
 
    public String getApellido() {
        return Apellido;
    }
 
    public void setApellido(String apellido) {
        Apellido = apellido;
    }
 
    public int getCodigoEmpleado() {
        return CodigoEmpleado;
    }
 
    public void setCodigoEmpleado(int codigoEmpleado) {
        CodigoEmpleado = codigoEmpleado;
    }
 
    public int getNihss() {
        return Nihss;
    }
 
    public void setNihss(int nihss) {
        Nihss = nihss;
    }
 
    public String getNombre() {
        return Nombre;
    }
 
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
 
    public void mostrar() {
        System.out.println(this.getCodigoEmpleado());
        System.out.println(this.getNombre());
        System.out.println(this.getApellido());
        System.out.println(this.getNihss());
    }
 
    //public abstract double CalcularIngreo();  
}


