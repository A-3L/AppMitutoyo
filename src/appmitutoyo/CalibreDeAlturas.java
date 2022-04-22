/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appmitutoyo;

import appmitutoyo.interfaces.MetricaDeMedicionGUI;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSlider;
import jguiextensible.JFactory;
import jguiextensible.JGuiExtensible;
import jguiextensible.JGuiTabbed;
import jguiextensible.JTipoGui;

/**
 *
 * @author a31r1z
 */
public class CalibreDeAlturas extends Calibre{

    JFactory factory = new JFactory();
    
    public CalibreDeAlturas() {
        
    }
    
    @Override
    protected JGuiExtensible createDialog() {
              
        //JGuiExtensible dialog = factory.createDialog(JTipoGui.TABBED, false);
        JGuiExtensible especif = super.createDialog();
        especif.setName("Especificaciones"); 
        
        JGuiExtensible dialog = new MetricaDeMedicionGUI();
        dialog.setName("Calibre de Alturas");
       
        dialog.addExtensibleChild(especif);
        //dialog.addExtensibleChild(metMed);
        return dialog;       
    }
    
}
