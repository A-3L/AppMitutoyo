/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mitutoyo;

import mitutoyo.data.MetricaDeMedicion;
import mitutoyo.interfaces.MetricaDeMedicionGUI;
import jguiextensible.JFactory;
import jguiextensible.JGuiExtensible;
import jguiextensible.JTipoGui;

/**
 *
 * @author a31r1z
 */
public class CalibreDeAlturas extends Calibre{

    private final JFactory factory = new JFactory();
    private final MetricaDeMedicion metDeMed = new MetricaDeMedicion();
      
    public CalibreDeAlturas() {
        
    }
    
    @Override
    protected JGuiExtensible createDialog() {
              
      
        JGuiExtensible dialog = factory.createDialog(JTipoGui.TABBED,true); 
        
        JGuiExtensible especificaciones = super.createDialog();
        especificaciones.setName("Especificaciones"); 
        
        JGuiExtensible metDeMedGui = new MetricaDeMedicionGUI();
        dialog.setName("Calibre de Alturas");
       
       
        dialog.addExtensibleChild(especificaciones);
        dialog.addExtensibleChild(metDeMedGui);
         
        return dialog;       
    }

}
