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
public class MicrometroDeInteriores extends Micrometro {
    
    private final JFactory factory;

    public MicrometroDeInteriores() {
        
        factory = new JFactory();
    }
    
       protected JGuiExtensible createDialog() {
        
        JGuiExtensible dialog = factory.createDialog(JTipoGui.TREE, false);
        JGuiExtensible mic =super.createDialog();
        JGuiExtensible micDeInt = new MetricaDeInterioresGUI();
        Comparador comp = new Comparador();
        JGuiExtensible compGui = comp.createDialog();
           
        dialog.addExtensibleChild(mic);
        dialog.addExtensibleChild(micDeInt);
        dialog.addExtensibleChild(compGui);
        dialog.setName("Micrometro de interiores");
                      
        return dialog;
    }
    
}
