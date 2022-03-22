/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appmitutoyo;

import jguiextensible.JFactory;
import jguiextensible.JGuiExtensible;
import jguiextensible.JTipoGui;

/**
 *
 * @author a31r1z
 */
public class Micrometro {
    
    private JFactory factory;

    public Micrometro() {
        
        factory = new JFactory();
    }
    
     protected JGuiExtensible createDialog() {
        
         JGuiExtensible dialog = factory.createDialog(JTipoGui.SIMPLE, false);
         JGuiExtensible metMicr = new MetricaMicrometricaGUI();
         JGuiExtensible funciones = new FuncionesGUI();
         
         dialog.addExtensibleChild(metMicr);
         dialog.addExtensibleChild(funciones);
         dialog.setName("Micrometro");
      
       
        return dialog;       
    }
    
    
}
