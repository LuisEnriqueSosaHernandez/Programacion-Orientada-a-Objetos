import java.io.Serializable;
public class Empleados implements java.io.Serializable {
 
      private static final long serialVersionUID = 1L;
    private Empleado[] empleados;
    private int nElementos;
 
    public Empleados() {
        // Crea el array
        nElementos = 0;
        empleados = inicializar(nElementos);
    }
 
    private Empleado[] inicializar(int nElementos) {
        try {
            return new Empleado[nElementos];
        } catch (OutOfMemoryError e) {
            System.out.println(e.toString());
            return empleados;
        }
    }
 
    public Empleado elemento(int i) {
        if (i >= 0 && i < nElementos) {
            return empleados[i];
        } else {
            System.out.println("No hay elementos en esa posici&#65533;n");
            return null;
        }
    }
 
    public int longitud() {
        return empleados.length;
    }
 
    public void agregar(Empleado unEmpleado) {
        Empleado[] copiaDeLista;
 
        //el array crece conforme se le van anadiendo nuevos elementos 
        copiaDeLista = empleados;
        nElementos = copiaDeLista.length;
        empleados = inicializar(nElementos + 1);
        for (int i = 0; i < nElementos; i++) {
            empleados[i] = copiaDeLista[i];
        }
        empleados[nElementos] = unEmpleado;
        nElementos++;
    }
 
    public boolean eliminar(int cod) {
        Empleado[] copiaDeLista;
        int posi = buscar(cod);
        if (posi != -1) { // el array disminuye cuando se eliminan elementos
            empleados[posi] = null;
            copiaDeLista = empleados;
            if (copiaDeLista.length != 0) {
                nElementos = copiaDeLista.length;
                empleados = inicializar(nElementos - 1);
                for (int i = 0; i < nElementos; i++) {
                    if (copiaDeLista[i] != null) {
                        empleados[i] = copiaDeLista[i];
                    }
                }
                nElementos--;
                return true;
            }
        }
        return false;
    }
 
    public int buscar(int cod) {
        int posi = -1;
        for (int i = 0; i < nElementos; i++) {
            if (empleados[i].getCodigoEmpleado() == cod) {
                posi = i;
            }
        }
        return posi;
    }
}
