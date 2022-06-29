
package clases;

/**
 *
 * @author davidperezarias
 */
public class ClsResponsable extends ClsEmpleado{

    private double capacidadCarga;

    public ClsResponsable(double capacidadCarga, String id, String nombre, String cargo, String tipoDocumento, String telefono, int antiguedad) {
        super(id, nombre, cargo, tipoDocumento, telefono, antiguedad);
        this.capacidadCarga = capacidadCarga;
    }
    
   
    
     public String MostrarCaracteristicas() {

        String caracteristicas = "Código: " + super.getId() + "\n"
                + "Nombre: " + super.getNombre() + "\n"
                + "Tipo Documento: " + super.getTipoDocumento() + "\n";

        return caracteristicas;

    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
    
    
    
    
    
    
}
