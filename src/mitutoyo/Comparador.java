/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mitutoyo;

import mitutoyo.interfaces.MetricaMicrometricaGUI;
import mitutoyo.interfaces.MetricaComparativaGUI;
import jguiextensible.JFactory;
import jguiextensible.JGuiExtensible;
import jguiextensible.JTipoGui;
import mitutoyo.interfaces.FuncionesGUI;
import mitutoyo.interfaces.MetricaDeInterioresGUI;
import mitutoyo.interfaces.ObservacionesGUI;
import mitutoyo.interfaces.VisualizadorGUI;

/**
 *
 * @author a31r1z
 */
public class Comparador {
   
   

    public Comparador() {
        
    }
    
      protected JGuiExtensible createDialog() {
       
        JGuiExtensible dialog = JFactory.getInstance().createDialog(JTipoGui.TABBED,true);
        JGuiExtensible tree =  JFactory.getInstance().createDialog(JTipoGui.TREE,false);
       
        Calibre calibre = new Calibre();
        JGuiExtensible especif = calibre.createDialog();
        JGuiExtensible metComp= new MetricaComparativaGUI(); 
        JGuiExtensible metMicr = new MetricaMicrometricaGUI();
        
        var visualGui = new VisualizadorGUI();
        var funciones = new FuncionesGUI();
        var metDeInt= new MetricaDeInterioresGUI();
        var obs = new ObservacionesGUI();
         
        especif.setName("Especificaciones");
        dialog.setName("Comparador");
        tree.setName("Visualizador");
        
        metMicr.addJGui(metComp);
        metDeInt.addJGui(obs);
        visualGui.addJGui(funciones); 
        tree.addJGui(visualGui);
        tree.addJGui(metDeInt);
        
        dialog.addJGui(especif);
        dialog.addJGui(metMicr);
        dialog.addJGui(tree);
        
        return dialog;       
    }
    
}
