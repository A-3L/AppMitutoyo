/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mitutoyo;

import jguiextensible.JFactory;
import jguiextensible.JGuiExtensible;
import jguiextensible.JTipoGui;

/**
 *
 * @author a31r1z
 */
public class MicrometroDeAlturas extends Micrometro {

    public MicrometroDeAlturas() {
    }
    
    @Override
    public JGuiExtensible createDialog() {
        
        JGuiExtensible dialog = JFactory.getInstance().createDialog(JTipoGui.TREE, true);
       
         
         return dialog;
        
    }
    
}
