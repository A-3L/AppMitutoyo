/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appmitutoyo;

import jguiextensible.JGuiExtensible;

/**
 *
 * @author a31r1z
 */
public class CalibreDigimatic extends Calibre {

    private Especificaciones especif;
    private Visualizador visual;
    
    public CalibreDigimatic() {
        
        especif= new Especificaciones();
    }
    
    @Override
    protected JGuiExtensible createDialog() {
        
        JGuiExtensible dialog = super.createDialog();
        VisualizadorGUI visualGui = new VisualizadorGUI();
      
        dialog.addExtensibleChild(visualGui);
        dialog.setName("Calibre Digimatic");
       
        return dialog;
               
    }
    
}
