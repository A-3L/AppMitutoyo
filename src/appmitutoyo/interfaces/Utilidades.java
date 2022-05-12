/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appmitutoyo.interfaces;

import java.awt.BorderLayout;
import java.awt.Container;
import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author a31r1z
 */
public final class Utilidades {

   
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
    
    public static boolean validarCampoVacio(String campo) {
        
        return !(campo.toString().trim().isEmpty());
    }
    
    public static boolean matcher(JFormattedTextField comp, String name, Object obj) {
      
        switch(comp.getValue()) {
            
            case null -> {
                Utilidades.mostrar("ERROR: Faltan datos en:\n "
                          + obj +" -> "+ name);
                comp.requestFocusInWindow();              
             return false;
            }
            case default -> {            
                return true;
            }
        }
       
    }
     
    public static boolean matcher(JTextField comp, String name, Object obj) {
      
        if (!Utilidades.validarCampoVacio(comp.getText())) {
                   
              Utilidades.mostrar("ERROR: Falta introducir datos:\n "
                          + obj +" -> "+ name);
              comp.requestFocusInWindow();
              
            return false;
        }else          
            return true;
       
    }
     
    public static boolean matcher(JComboBox<String> comp, String name, Object obj) {
                  
        if (comp.getSelectedIndex() == 0){
            
             Utilidades.mostrar("ERROR: Falta seleccion en:\n "
                          + obj +" -> " + name);
            comp.requestFocusInWindow();
        
            return false;
        }else 
            return true;
    }
             
     
    public static void saveInXml (String name, Object obj) {
      
       Path path = FileSystems.getDefault().getPath(name);
    
       try (var encoder= new XMLEncoder (new BufferedOutputStream( Files.newOutputStream(path)))) {
           
           encoder.writeObject(obj);
           
        } catch (IOException ex) {
            Logger.getLogger(obj.getClass().getName()).log(Level.SEVERE, null, ex);
        }
}
    
    public static void saveInStream (String name, Object obj) {
        
        Path path = FileSystems.getDefault().getPath(name);
    
        try (var out = new ObjectOutputStream(Files.newOutputStream(path))) {
            
                out.writeObject(obj);    
                
                } catch (IOException ex) {
            Logger.getLogger(obj.getClass().getName()).log(Level.SEVERE, null, ex);
        }   
    }
         
}