/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mitutoyo;

import jguiextensible.JFactory;
import jguiextensible.JGuiExtensible;
import jguiextensible.JTipoGui;
import mitutoyo.data.Certificados;
import mitutoyo.data.Especificaciones;

/**
 *
 * @author a31r1z
 */
public class Calibre {
 
    public Calibre() {
         
    }
 
    protected JGuiExtensible createDialog() {
        
        JGuiExtensible dialog = JFactory.getInstance().createDialog(JTipoGui.SIMPLE,false); 
       
        dialog.setName("Calibre");
        
        var especificaciones = new Especificaciones();
        var especificacionesGui= especificaciones.createDialog();
        var certificados = new Certificados();
        var certGui = certificados.createDialog();
       // var singGui = new SingularidadGUI();
       // var metDeMedGui = new MetricaDeMedicionGUI();
       
        dialog.addJGui(especificacionesGui);
        dialog.addJGui(certGui);
       // dialog.addJGui(singGui);
       // dialog.addJGui(metDeMedGui);
                   
        return dialog;
    } 
}