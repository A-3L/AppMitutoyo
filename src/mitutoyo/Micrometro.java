/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mitutoyo;

import mitutoyo.interfaces.MetricaMicrometricaGUI;
import jguiextensible.JFactory;
import jguiextensible.JGuiExtensible;
import jguiextensible.JTipoGui;
import mitutoyo.interfaces.EspecificacionesGUI;

/**
 *
 * @author a31r1z
 */
public class Micrometro {
   
   
     public Micrometro() {
        
    }
    
     protected JGuiExtensible createDialog() {
         
        JGuiExtensible dialog = JFactory.getInstance().createDialog(JTipoGui.SIMPLE,false);
                
        // var especif= new EspecificacionesGUI();
         var metMicr = new MetricaMicrometricaGUI();
         var calibre = new CalibreDeAlturas();
         var cal = calibre.createDialog();
      
         //dialog.addJGui(especif);
         
         dialog.addJGui(cal);
         dialog.addJGui(metMicr);
        
         dialog.setName("Micrometro");
               
        return dialog;       
    }
    
    
}
