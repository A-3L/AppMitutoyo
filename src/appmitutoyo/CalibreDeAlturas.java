/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appmitutoyo;

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

     JFactory factory;
     
    public CalibreDeAlturas() {
        
      factory = new JFactory();  
    }
    
    @Override
    protected JGuiExtensible createDialog() {
        
       
        MetricaDeMedicion metDeMed = new MetricaDeMedicion();
        
        JGuiExtensible cal = super.createDialog();
        JGuiExtensible dialog= metDeMed.createDialog();
         
        dialog.addExtensibleChild(cal);
        dialog.setName("Calibre de Alturas");
       
        return dialog;       
    }
    
}
