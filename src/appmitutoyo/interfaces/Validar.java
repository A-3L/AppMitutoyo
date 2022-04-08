/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appmitutoyo.interfaces;

import javax.swing.JOptionPane;

/**
 *
 * @author a31r1z
 */
public final class Validar {

   
    public static boolean campoVacio(String campo) {
        
        return !(campo.toString().trim().isEmpty());
    }
    
    public static boolean numeroEntero(String campo) {
        try {
            Long.parseLong(campo);
            return true;
        }catch(NumberFormatException e) {
              return false;
        } 
    }
   
    public static boolean numeroDecimal(String campo) {
        try {
            Float.parseFloat(campo);
            return true;
        }catch(NumberFormatException e) {
              return false;
        } 
    }
    
    public static boolean rango(String campo, double inf, double sup) {
      
          var numero = Double.parseDouble(campo);
           if (numero >= inf || numero <= sup) 
            return true;
           else
            return false;
        
    }
    
    public static void mostrar(String message) {
        
        JOptionPane.showMessageDialog(null,message);
    }
}
