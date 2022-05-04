/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appmitutoyo.interfaces;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author a31r1z
 */
public final class Utilidades {

   
    public static boolean validarCampoVacio(String campo) {
        
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
    
    public static JFrame crearFrame(Container gui) {
       
    JFrame frame;
    frame= new JFrame(gui.getName());
     
    frame.add(gui, BorderLayout.CENTER);
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.setTitle(gui.toString());
    
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    frame.setMinimumSize(frame.getMinimumSize());
    
    return frame;
    
    }
    
    public static void saveInXml (String name, Object obj) {
      
       XMLEncoder encoder;
      try {
            encoder = new XMLEncoder(
                new BufferedOutputStream(
                    new FileOutputStream(name)));
            encoder.writeObject(obj);
            encoder.close();
  } catch (FileNotFoundException ex) {
      java.util.logging.Logger.getLogger(obj.getClass().getName()).log(java.util.logging.Level.SEVERE, null, ex);
     
  }
}
}