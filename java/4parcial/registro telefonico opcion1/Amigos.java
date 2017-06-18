import java.io.Serializable;
public class Amigos implements java.io.Serializable {
 
      private static final long serialVersionUID = 1L;
    private Amigo[] amigos;
    private int nElementos;
 
    public Amigos() {
        
        nElementos = 0;
        amigos = inicializar(nElementos);
    }
 
    private Amigo[] inicializar(int nElementos) {
        try {
            return new Amigo[nElementos];
        } catch (OutOfMemoryError e) {
            System.out.println(e.toString());
            return amigos;
        }
    }
 
    public Amigo elemento(int i) {
        if (i >= 0 && i < nElementos) {
            return amigos[i];
        } else {
            System.out.println("No hay elementos en esa posici&#65533;n");
            return null;
        }
    }
 
    public int longitud() {
        return amigos.length;
    }
 
    public void agregar(Amigo unAmigo) {
        Amigo[] copiaDeLista;
 
         
        copiaDeLista = amigos;
        nElementos = copiaDeLista.length;
        amigos = inicializar(nElementos + 1);
        for (int i = 0; i < nElementos; i++) {
            amigos[i] = copiaDeLista[i];
        }
        amigos[nElementos] = unAmigo;
        nElementos++;
    }
 
    public boolean eliminar(int cod) {
        Amigo[] copiaDeLista;
        int posi = buscar(cod);
        if (posi != -1) { 
            amigos[posi] = null;
            copiaDeLista = amigos;
            if (copiaDeLista.length != 0) {
                nElementos = copiaDeLista.length;
                amigos = inicializar(nElementos - 1);
                for (int i = 0; i < nElementos; i++) {
                    if (copiaDeLista[i] != null) {
                        amigos[i] = copiaDeLista[i];
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
            if (amigos[i].getCodigoAmigo() == cod) {
                posi = i;
            }
        }
        return posi;
    }
}
