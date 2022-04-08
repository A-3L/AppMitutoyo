/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appmitutoyo;

import appmitutoyo.interfaces.MetricaMicrometricaGUI;
import appmitutoyo.interfaces.MetricaComparadorGUI;
import jguiextensible.JFactory;
import jguiextensible.JGuiExtensible;
import jguiextensible.JTipoGui;

/**
 *
 * @author a31r1z
 */
public class Comparador {
    
     private  JFactory factory;

    public Comparador() {
        
         factory = new JFactory();
    }
    
      protected JGuiExtensible createDialog() {
       
        JGuiExtensible dialog =  factory.createDialog(JTipoGui.SIMPLE,false);
        JGuiExtensible metComp = new MetricaComparadorGUI(); 
        JGuiExtensible metMicr = new MetricaMicrometricaGUI();
        
        dialog.addExtensibleChild(metComp);
        dialog.addExtensibleChild(metMicr);
        dialog.setName("Comparador");
       
      return dialog;       
    }
    
}
