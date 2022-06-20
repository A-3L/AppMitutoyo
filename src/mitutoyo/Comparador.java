/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mitutoyo;

import mitutoyo.interfaces.MetricaMicrometricaGUI;
import mitutoyo.interfaces.MetricaComparativaGUI;
import mitutoyo.interfaces.Utilidades;
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
