/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appmitutoyo;

import appmitutoyo.interfaces.MetricaDeMedicion;
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

    private JFactory factory = new JFactory();
    private MetricaDeMedicion metDeMed = new MetricaDeMedicion();
      
    public CalibreDeAlturas() {
        
    }
    
    @Override
    protected JGuiExtensible createDialog() {
              
        //JFactory factory = new JFactory();
        JGuiExtensible dialogo = factory.createDialog(JTipoGui.SIMPLE, true); 
        
        JGuiExtensible especificaciones = super.createDialog();
        //especif.setName("Especificaciones"); 
        
        JGuiExtensible dialog = metDeMed.createDialog();
      //  dialogo.setName("Calibre de Alturas");
       
        dialogo.addExtensibleChild(especificaciones);
        dialogo.addExtensibleChild(dialog);
        return dialogo;       
    }

}
