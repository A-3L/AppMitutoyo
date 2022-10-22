/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mitutoyo;

import mitutoyo.data.MetricaComparativa;
import mitutoyo.interfaces.MetricaDeInterioresGUI;
import mitutoyo.interfaces.VisualizadorGUI;
import java.util.ArrayList;
import java.util.List;
import jguiextensible.JFactory;
import jguiextensible.JGuiExtensible;
import jguiextensible.JTipoGui;
import mitutoyo.data.Funciones;
import mitutoyo.data.MetricaDeInteriores;
import mitutoyo.data.MetricaDeMedicion;
import mitutoyo.data.Observaciones;
import mitutoyo.data.Visualizador;
import mitutoyo.interfaces.FuncionesGUI;
import mitutoyo.interfaces.MetricaDeMedicionGUI;
import mitutoyo.interfaces.ObservacionesGUI;

/**
 *
 * @author a31r1z
 */
public class MicrometroDeInteriores extends Micrometro {
    
  

    public MicrometroDeInteriores() {
        
    }
    
    @Override
       protected JGuiExtensible createDialog() {
               
        JGuiExtensible dialog = JFactory.getInstance().createDialog(JTipoGui.TREE, true);
       
        List<JGuiExtensible> listaGuis = new ArrayList<>();
        List<JGuiExtensible> lista = new ArrayList<>();
        
        var metComp = new MetricaComparativa();
        var metDeInt= new MetricaDeInteriores();
        var metDeMed= new MetricaDeMedicion();
        var visual= new Visualizador();
        var funciones = new Funciones();
        var obs = new Observaciones();
  
        
        JGuiExtensible metCompGui = metComp.createDialog(); 
        JGuiExtensible metDeIntGui = metDeInt.createDialog();
        JGuiExtensible metDeMedGui = metDeMed.createDialog();
        JGuiExtensible visualGui = visual.createDialog();
        JGuiExtensible funcionesGui = funciones.createDialog();
        JGuiExtensible obsGui = obs.createDialog();
        JGuiExtensible obs2Gui = obs.createDialog();
        JGuiExtensible microGui= super.createDialog();        
               
        lista.add(metDeMedGui);
        lista.add(metCompGui);
        lista.add(metDeIntGui);
         
        visualGui.addJGui(obsGui);
        funcionesGui.addJGui(obs2Gui);
        
        listaGuis.add(visualGui);
   
        dialog.addJGui(microGui); 
        dialog.addJGuiChildrenList(lista);   
        dialog.addJGuiChildrenList(listaGuis);
        dialog.addJGui(funcionesGui);
        
        metCompGui.setName("Metrica comparativa");
        microGui.setName("Especificaciones");
        obsGui.setName("Observaciones");
        dialog.setName("Micrometro de interiores");
                
        return dialog;
    }
   
}
