/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mitutoyo;

import mitutoyo.interfaces.MetricaMicrometricaGUI;
import mitutoyo.interfaces.FuncionesGUI;
import mitutoyo.interfaces.Utilidades;
import java.util.Arrays;
import jguiextensible.JFactory;
import jguiextensible.JGuiExtensible;
import jguiextensible.JTipoGui;
import mitutoyo.interfaces.EspecificacionesGUI;
import mitutoyo.interfaces.VisualizadorGUI;

/**
 *
 * @author a31r1z
 */
public class Micrometro {
   
   
     public Micrometro() {
        
    }
    
     protected JGuiExtensible createDialog() {
         
        JGuiExtensible dialog = JFactory.getInstance().createDialog(JTipoGui.SIMPLE,false);
                
         var especif= new EspecificacionesGUI();
         var metMicr = new MetricaMicrometricaGUI();
      
         dialog.addExtensibleChild(especif);
         dialog.addExtensibleChild(metMicr);
        
         dialog.setName("Micrometro");
               
        return dialog;       
    }
    
    
}
