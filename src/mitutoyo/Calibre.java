/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mitutoyo;

import mitutoyo.data.Articulo;
import mitutoyo.data.Dimensiones;
import jguiextensible.JFactory;
import jguiextensible.JGuiExtensible;
import jguiextensible.JTipoGui;
import mitutoyo.interfaces.EspecificacionesGUI;
import mitutoyo.interfaces.MetricaDeMedicionGUI;

/**
 *
 * @author a31r1z
 */
public class Calibre {
    
    private final JFactory factory = new JFactory();
    
    
    public Calibre() {
         
    }
 
    protected JGuiExtensible createDialog() {
        
        JGuiExtensible dialog = factory.createDialog(JTipoGui.SIMPLE,false); 
        
        dialog.setName("Calibre");
        
        var especificacionesGui = new EspecificacionesGUI();
        var metDeMedGui = new MetricaDeMedicionGUI();
       
        dialog.addExtensibleChild(especificacionesGui);
        dialog.addExtensibleChild(metDeMedGui);
                   
        return dialog;
    } 
}