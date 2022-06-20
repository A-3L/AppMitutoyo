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

/**
 *
 * @author a31r1z
 */
public class CalibreDigimatic extends Calibre {

    private final JFactory factory = new JFactory();
    
    public CalibreDigimatic() {
       
    }
    
    @Override
    protected JGuiExtensible createDialog() {
        
        JGuiExtensible dialog = factory.createDialog(JTipoGui.SIMPLE,true); 
        JGuiExtensible dialogo = super.createDialog();
        FuncionesGUI funciones = new FuncionesGUI();
        VisualizadorGUI visualGui = new VisualizadorGUI();
      
        dialog.addExtensibleChild(dialogo);
        dialog.addExtensibleChild(visualGui);
       
        dialogo.setName("Especificaciones");
        dialog.setName("Calibre Digimatic");
          
        return dialog;              
    }
    
}
