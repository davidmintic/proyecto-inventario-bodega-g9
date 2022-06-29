package clases;

/**
 *
 * @author davidperezarias
 */
public class ClsTapaboca {

    String material;
    String color;
    String tipo;
    String codigo;
    String fecha;
    char empaque; // c=caja o b=bolsa
    String descripcion;
    double precio;

    public ClsTapaboca() {
    }

    public ClsTapaboca(String codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public String MostrarCaracteristicas() {

        String caracteristicas = "Código: " + this.codigo + "\n"
                + "Material: " + this.material + "\n"
                + "Descripción: " + this.descripcion + "\n"
                + "Precio: " + this.precio + "\n";

        return caracteristicas;

    }
    
    
    
    

}
