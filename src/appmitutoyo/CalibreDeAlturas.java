/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appmitutoyo;

import appmitutoyo.data.MetricaDeMedicion;
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
              
      
        JGuiExtensible dialog = factory.createDialog(JTipoGui.TABBED,false); 
        
        JGuiExtensible especificaciones = super.createDialog();
        especificaciones.setName("Especificaciones"); 
        
        JGuiExtensible metDeMedGui = metDeMed.createDialog();
        dialog.setName("Calibre de Alturas");
       
       
        dialog.addExtensibleChild(especificaciones);
        dialog.addExtensibleChild(metDeMedGui);
         
        return dialog;       
    }

}
