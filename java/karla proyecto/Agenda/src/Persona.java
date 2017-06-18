public class Persona {
    private final String nombre;//DECLARACION DE LOS ATRUBUTOS DE LA CLASE PERSONA 
    private final String direccion;
    private String email;
    private final String telefono;
public Persona(String nombre, String direccion, String email, String telefono) {//CONSTRUCTOR DE LA CASE QUE RECIBE LOS PARAMETOS ADECUADOS
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
       //AQUI COMENTAREO POCO POR QUE YA ME DUELEN LOS DEDOS , ESTO PARECE CUENTO :V
    }
    public String getNombre() {//LOS METODOS GET SIRVEN PARA ENVIAR LOS DATOS O QUE LA CLASE MAIN OBTENGA EL ATRIBUTO INDICADO , RETORNA EL PARAMETRO INDICADO
        return nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getEmail() {
        return email;
    }


    public String getTelefono() {
        return telefono;
    }
    @Override//SOBREECRITURA 
    
    public String toString() {//METODO TO STRING PARA RETORNAR TODOS LOS ATRIBUTOS DE LA CLASE, SE INDICAN , PERO SIRVE PARA RETORNAR
       return "Registro:\n" + "Nombre: " + nombre + "\n Direccion: " +
             direccion + "\n Email: " + email + "\n Numero Telefonico: " + telefono+"\n";
    }
    
}/*NOTA: POR LA REDACCION EN LOS COMENTARIOS PARECE SACADO DE UN TUTORIAL , DE HECHO CREO QUE SERIA BUENO HACER VIDEOTUTORIALES PARA FACILITARLES LA VIDA A LAS PERSONAS
ESTE PROGRAMA ES REALIZADO CON FINES EDUCATIVOS Y PARA PASAR LA MATERIA, DERECHOS RESERVADOS S.A. DE C.V.
DIRECCION:INSTITUTO TECNOLOGICO DE MEXICO CAMPUS VERACRUZ.
ESTE PROGRAMA ES AUSPICIADO POR COCA COLA 
PATROCINADOR OFICIAL:MOTORES SOSA
AGRADECIMIENTOS ESPECIALES A LA PERSONA A LA QUE LE ROBO EL INTERNET XS , JAJA NA , ME LO PAGA MI MAMA.
AUTO: RAUL VERGARA.
*/
