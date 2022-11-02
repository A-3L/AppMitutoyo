/**
 * AppMitutoyo is an application to show how works the implementation of the library JGuiExtensible
 * that develops a reusable gui pattern.
 * 
 * Copyright (C) 2022 Alberto Eiriz Lopez
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 * 
*/
package mitutoyo;

import java.awt.BorderLayout;
import java.awt.Container;
import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.IOException;
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
 * Class of a sort of utilities about editing fields of a graphical interface
 * 
 * @author a31r1z
 */
public final class Utilidades {

    /**
     * Creates a instance of Utilidades
     */
    public Utilidades() {
    }

    
    /**
     * Shows one dialog with a warning message
     * 
     * @param message the message to show. 
     */
    public static void mostrar(String message) {
        
        JOptionPane.showMessageDialog(null,message);
    }
    
    /**
     * Creates a frame containing the gui argument.
     * 
     * @param gui the graphical interface that contains the frame
     * @return a frame with the extensible gui inside
     */
    public static JFrame crearFrame(Container gui)  {
       
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
    
    /**
     * Method to confirm that the field is not empty.
     * 
     * @param campo field that must not be empty.
     * @return true or false if field is or not empty.
     */
    public static boolean validarCampoVacio(String campo) {
        
        return !(campo.trim().isEmpty());
    }
    
    /**
     * Confirms that the value of comp is in range between max and min
     * 
     * @param comp the integer value of the field
     * @param max the maxim value of the range
     * @param min the minimum value of the range
     * @return true or false if the value is in the range.
     */
    public static boolean rango(JFormattedTextField comp, int max, int min) {
        
        Long value = (Long)comp.getValue(); 
        
        return (value<min || value>max); 
    }  
    
    /**
     * Overloaded method to validate that the field´s value is not null.
     * 
     * @param comp the field to match the value.
     * @param name name of the field.
     * @param max maxim value of range
     * @param min minim value of range
     * @param obj object that his field must be matched
     * @return true or false if the field is null or not.
     */
     public static boolean matcher(JFormattedTextField comp, String name, int max, int min, Object obj) {
      
        switch(comp.getValue()) {
        
        case null -> {
                       Utilidades.mostrar(" ATENCION: Faltan datos en:\n "
                       + obj +" -> "+ name);
                       comp.requestFocusInWindow();
                       
                       return false;
                    }
        default -> {
            
                      if (rango(comp, max, min)) {
                          Utilidades.mostrar("ATENCION: Numero fuera de rango (" +min+ ", " +max+ ") en:\n"
                          + obj +" -> "+ name);
                          comp.setValue(null);
                          comp.requestFocusInWindow();
                       
                          return false;}
                      else{
                          return true;
                       }
                    }
        }
    }
    
    /**
     * Overloaded method to validate that the field´s value is not null.
     *
     * @param comp the field to match the value.
     * @param name  name of the field.
     * @param obj object that his field must be matched
     * @return true or false if the field is null or not.
     */
    public static boolean matcher(JFormattedTextField comp, String name, Object obj) {
      
        switch(comp.getValue()) {
        
        case null -> {
                       Utilidades.mostrar("ATENCION: Faltan datos en:\n "
                       + obj +" -> "+ name);
                       comp.requestFocusInWindow();
                       
                       return false;
                    }
        default -> {
                       return true;
                    }
        }  
    }
    
    /**
     * Overloaded method to validate that the field´s value is not null.
     * 
     * @param comp the field to match the value.
     * @param name name of the field.
     * @param obj object that his field must be matched
     * @return true or false if the field is null or not.
     */
    public static boolean matcher(JTextField comp, String name, Object obj) {
      
        if (!Utilidades.validarCampoVacio(comp.getText())) {
                   
              Utilidades.mostrar("ATENCION: Falta introducir datos:\n "
                          + obj +" -> "+ name);
              comp.requestFocusInWindow();
              
            return false;
        }else          
            return true;
       
    }
    
     /**
     * Overloaded method to validate that the field´s value is not null.
     * 
     * @param comp the field to match the value.
     * @param name name of the field.
     * @param obj object that his field must be matched
     * @return true or false if the field is null or not.
     */
    public static boolean matcher(JComboBox<String> comp, String name, Object obj) {
                  
        if (comp.getSelectedIndex() == 0){
            
             Utilidades.mostrar("ATENCION: Falta seleccion en:\n "
                          + obj +" -> " + name);
            comp.requestFocusInWindow();
        
            return false;
        }else 
            return true;
    }
             
    /**
     * Saves the object in a XML file in the filesystem of the project. In folder /store
     * 
     * @param name the name of the object to save
     * @param obj object to be saved.
     */ 
    public static void saveInXml (String name, Object obj) {
      
          Path path = FileSystems.getDefault().getPath(name);
        
        try (var encoder= new XMLEncoder (new BufferedOutputStream( Files.newOutputStream(path)))) {
        
        encoder.writeObject(obj);
        
        } catch (IOException ex) {
        Logger.getLogger(obj.getClass().getName()).log(Level.SEVERE, null, ex);
        }
    }
  
         
}