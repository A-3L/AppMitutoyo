/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mitutoyo;

import mitutoyo.interfaces.FuncionesGUI;
import mitutoyo.interfaces.VisualizadorGUI;
import jguiextensible.JFactory;
import jguiextensible.JGuiExtensible;
import jguiextensible.JTipoGui;
import mitutoyo.interfaces.ObservacionesGUI;

/**
 *
 * @author a31r1z
 */
public class CalibreDigimatic extends Calibre {

      
    public CalibreDigimatic() {
       
    }
    
    @Override
    protected JGuiExtensible createDialog() {
        
        JGuiExtensible dialog = JFactory.getInstance().createDialog(JTipoGui.SIMPLE,true); 
        JGuiExtensible dialogo = super.createDialog();
        
        var visualGui = new VisualizadorGUI();
        var obs = new ObservacionesGUI();
        
        dialogo.setName("Especificaciones");
        dialog.setName("Calibre Digimatic");
        
        visualGui.addExtensibleChild(obs);
        dialog.addExtensibleChild(dialogo);   
        dialog.addExtensibleChild(visualGui);
          
        
          
        return dialog;              
    }
    
}
