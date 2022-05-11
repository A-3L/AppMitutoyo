/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appmitutoyo;

import appmitutoyo.interfaces.MetricaMicrometricaGUI;
import appmitutoyo.interfaces.MetricaComparativaGUI;
import appmitutoyo.interfaces.Utilidades;
import jguiextensible.JFactory;
import jguiextensible.JGuiExtensible;
import jguiextensible.JTipoGui;

/**
 *
 * @author a31r1z
 */
public class Comparador {
   
    JFactory factory = new JFactory();

    public Comparador() {
        
    }
    
      protected JGuiExtensible createDialog() {
       
        //JGuiExtensible dialog =  factory.createDialog(JTipoGui.SIMPLE,true);
        JGuiExtensible  dialog= new MetricaComparativaGUI(); 
        JGuiExtensible metMicr = new MetricaMicrometricaGUI();
        
        //dialog.addExtensibleChild(metComp);
        dialog.addExtensibleChild(metMicr);
        dialog.setName("Comparador");
       
      return dialog;       
    }
    
}
