/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mitutoyo;

import mitutoyo.data.Articulo;
import mitutoyo.data.Dimensiones;
import mitutoyo.interfaces.ArticuloGUI;
import mitutoyo.interfaces.DimensionesGUI;
import jguiextensible.JFactory;
import jguiextensible.JGuiExtensible;
import jguiextensible.JTipoGui;

/**
 *
 * @author a31r1z
 */
public class Calibre {
    
    private Articulo articulo = new Articulo();
    private Dimensiones dimensiones = new Dimensiones();
    private final JFactory factory = new JFactory();;
    
    
    public Calibre() {
         
    }
 
    protected JGuiExtensible createDialog() {
        
        JGuiExtensible dialog = factory.createDialog(JTipoGui.SIMPLE,false);         
        var articuloGui = new ArticuloGUI();
        var dimensionesGui = new DimensionesGUI();
        
        dialog.addExtensibleChild(articuloGui);
        dialog.addExtensibleChild(dimensionesGui);
        dialog.setName("Calibre");
                      
        return dialog;
    } 
}