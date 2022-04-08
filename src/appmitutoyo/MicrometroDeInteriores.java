/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appmitutoyo;

import appmitutoyo.interfaces.MetricaDeInterioresGUI;
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
        
        JGuiExtensible dialog = factory.createDialog(JTipoGui.TREE, true);
        JGuiExtensible mic =super.createDialog();
        JGuiExtensible micDeInt = new MetricaDeInterioresGUI();
        Comparador comp = new Comparador();
        JGuiExtensible compGui = comp.createDialog();
        CalibreDeAlturas calAlt = new CalibreDeAlturas();
        //CalibreDigimatic calDig = new CalibreDigimatic();
           
        dialog.addExtensibleChild(mic);
        dialog.addExtensibleChild(micDeInt);
        dialog.addExtensibleChild(compGui);
        dialog.addExtensibleChild(calAlt.createDialog());
       // dialog.addExtensibleChild(calDig.createDialog());
        dialog.setName("Micrometro de interiores");
                      
        return dialog;
    }
    
}
