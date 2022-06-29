
package clases;

/**
 *
 * @author davidperezarias
 */
public class ClsEmpleado {
    
    private String id;
    private String nombre;
    private String cargo;
    private String tipoDocumento;
    private String telefono;
    private int antiguedad; //En meses

    public ClsEmpleado(String id, String nombre, String cargo, String tipoDocumento, String telefono, int antiguedad) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
        this.tipoDocumento = tipoDocumento;
        this.telefono = telefono;
        this.antiguedad = antiguedad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
    
}
