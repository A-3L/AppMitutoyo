/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mitutoyo;

import jguiextensible.JFactory;
import jguiextensible.JGuiExtensible;
import jguiextensible.JTipoGui;
import mitutoyo.interfaces.FuncionesGUI;
import mitutoyo.interfaces.MetricaDeInterioresGUI;
import mitutoyo.interfaces.ObservacionesGUI;

/**
 *
 * @author a31r1z
 */

public class CalibreDeAlturas extends Calibre{

  
      
    public CalibreDeAlturas() {
        
    }
    
    @Override
    protected JGuiExtensible createDialog() {
               
        JGuiExtensible dialog = JFactory.getInstance().createDialog(JTipoGui.TABBED,false); 
        
        var especificaciones = super.createDialog();
        var metDeInt = new MetricaDeInterioresGUI();
        var funciones = new FuncionesGUI();
        var obs = new ObservacionesGUI();
         
        especificaciones.setName("Especificaciones"); 
        dialog.setName("Calibre de Alturas");
        
        funciones.addExtensibleChild(obs);
        dialog.addExtensibleChild(especificaciones);
        dialog.addExtensibleChild(metDeInt);
        dialog.addExtensibleChild(funciones);
         
        return dialog;       
    }

}
