package com.mycompany.miprimerprogramag9;

import clases.*;

import javax.swing.JOptionPane;

/**
 *
 * @author davidperezarias
 */
public class MiPrimerProgramaG9 {

    public static void main(String[] args) {

       
        ClsResponsable responsable = new ClsResponsable(10, "30456", "Benito Pérez", "jefe",  "cc", "3157262", 2);
        
        responsable.getAntiguedad();
        
        ClsBodega bodega = new ClsBodega("BOD01", "Bodega la 51", responsable);
        
       

        ClsTapaboca tapaboca = new ClsTapaboca("CODET01", "Este es el mejor "
                + "tapabocas del mundo que tiene las 3 B");

        ClsTapaboca tapaboca2 = new ClsTapaboca("CODET02", "Este es desechable");
        
        
        
        
        bodega.IngresarTapaboca(tapaboca);       
        bodega.IngresarTapaboca(tapaboca2);
        
        

        System.out.println("Tapabocas 1: ");
        System.out.println(tapaboca.MostrarCaracteristicas());
        System.out.println("-------------------------");
        System.out.println("Tapabocas 2: ");
        System.out.println(tapaboca2.MostrarCaracteristicas());
        
        System.out.println("-------------------------");
        System.out.println("Responsable 2: ");
        System.out.println(responsable);

    }
}
