
package clases;

import java.util.LinkedList;

/**
 *
 * @author David Pérez
 */
public class ClsBodega {
    
    // Encapsulamiento
    // Gets y Sets
    
    private String prueba;
    private String codigo;
    private int capacidad;
    private String nombre;
    private String direccion;
    private String ciudad;
    
    LinkedList<ClsTapaboca> listaTapaboca = new LinkedList<ClsTapaboca>();
    ClsResponsable responsable;
    
    
    public void IngresarTapaboca(ClsTapaboca tapaboca){
    
            this.listaTapaboca.add(tapaboca);
    
    }
    
    public void SacarTapaboca(String codigoTapaboca){
        
        for(ClsTapaboca  tapaboca  : this.listaTapaboca){
            
            if(tapaboca.codigo.equals(codigoTapaboca)) {
                
                this.listaTapaboca.remove(tapaboca);
                break;
            }
        
        }
        
    }
    
   
    public ClsBodega(String codigo, String nombre, ClsResponsable responsable){
         this.codigo = codigo;        
         this.nombre = nombre;
         this.responsable = responsable;
    }
     

    public String MostrarCaracteristicas(){
    
        String caracteristicas = "Código: " + this.codigo + "\n"+
                 "Nombre: " + this.nombre + "\n"+
                 "Capacidad: " + this.capacidad + "\n"+
                 "Dirección: " + this.direccion + "\n";
        
        return caracteristicas;
    
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
     
    
    
    
}
