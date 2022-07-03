/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mitutoyo;

import mitutoyo.data.Articulo;
import mitutoyo.data.Dimensiones;
import mitutoyo.data.MetricaComparativa;
import mitutoyo.data.MetricaDeInteriores;
import mitutoyo.data.Visualizador;
import mitutoyo.interfaces.MetricaComparativaGUI;
import mitutoyo.interfaces.MetricaDeInterioresGUI;
import mitutoyo.interfaces.VisualizadorGUI;
import java.util.ArrayList;
import java.util.List;
import jguiextensible.JFactory;
import jguiextensible.JGuiExtensible;
import jguiextensible.JTipoGui;
import mitutoyo.data.Especificaciones;
import mitutoyo.interfaces.EspecificacionesGUI;
import mitutoyo.interfaces.FuncionesGUI;
import mitutoyo.interfaces.MetricaDeMedicionGUI;
import mitutoyo.interfaces.MetricaMicrometricaGUI;
import mitutoyo.interfaces.ObservacionesGUI;

/**
 *
 * @author a31r1z
 */
public class MicrometroDeInteriores extends Micrometro {
    
    private JFactory factory;

    public MicrometroDeInteriores() {
        
        factory = new JFactory();
       
    }
    
    @Override
       protected JGuiExtensible createDialog() {
               
        JGuiExtensible dialog = factory.createDialog(JTipoGui.TREE, true);
       
        List<JGuiExtensible> listaGuis = new ArrayList<>();
        List<JGuiExtensible> lista = new ArrayList<>();
        
       
 
        var metComp = new MetricaComparativa();
        var metDeInt= new MetricaDeInterioresGUI();
        var metDeMed= new MetricaDeMedicionGUI();
        var metMicr = new MetricaMicrometricaGUI();
        var especif = new EspecificacionesGUI();
        var visual= new VisualizadorGUI();
        var funciones = new FuncionesGUI();
        var obs = new ObservacionesGUI();
        
        JGuiExtensible compGui = metComp.createDialog(); 
        JGuiExtensible microGui= super.createDialog();
        
        lista.add(metDeMed);
        lista.add(compGui);
        lista.add(metDeInt);
          
        listaGuis.add(visual);
        
        dialog.addExtensibleChild(microGui); 
        visual.addExtensibleChild(obs);
        dialog.addExtensibleChildrenList(lista);   
        dialog.addExtensibleChildrenList(listaGuis);
        dialog.addExtensibleChild(funciones);
        
        compGui.setName("Metrica comparativa");
        microGui.setName("Especificaciones");
        obs.setName("Observaciones");
        dialog.setName("Micrometro de interiores");
                
        return dialog;
    }
   
}
