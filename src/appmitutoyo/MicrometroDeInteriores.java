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
    
    private JFactory factory;

    public MicrometroDeInteriores() {
        
       
    }
    
    @Override
       protected JGuiExtensible createDialog() {
           
        factory = new JFactory();  
        JGuiExtensible dialog = factory.createDialog(JTipoGui.TREE, true);
       
        
        CalibreDeAlturas calAlt = new CalibreDeAlturas();
        JGuiExtensible calAltGui = calAlt.createDialog();
       // JGuiExtensible metrDeInt = new MetricaDeInterioresGUI();
        Comparador comp = new Comparador();
        JGuiExtensible compGui = comp.createDialog();
        //Calibre cal = new Calibre();
        
        //CalibreDigimatic calDig = new CalibreDigimatic();
         JGuiExtensible mic =super.createDialog();
       
        dialog.addExtensibleChild(calAltGui);
        dialog.addExtensibleChild(mic);
       // dialog.addExtensibleChild(metrDeInt);
        dialog.addExtensibleChild(compGui);
       // dialog.addExtensibleChild(calAlt.createDialog());
       // dialog.addExtensibleChild(calDig.createDialog());
        
        calAltGui.setName("Especificaciones");
        dialog.setName("Micrometro de interiores");
        
       // Calibre cal = new Calibre();
       // dialog.addExtensibleChild(cal.createDialog());
         
                      
        return dialog;
    }
    
}
