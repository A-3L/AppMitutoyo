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

/**
 *
 * @author a31r1z
 */
public class MicrometroDeInteriores extends Micrometro {
    
    private JFactory factory;

    public MicrometroDeInteriores() {
        
       
    }
    
    @Override
       protected JGuiExtensible createDialog() {
           
        factory = new JFactory();  
        JGuiExtensible dialog = factory.createDialog(JTipoGui.TREE, true);
       
        List<JGuiExtensible> listaGuis = new ArrayList<>();
        List<JGuiExtensible> lista = new ArrayList<>();
        
        Calibre cal = new Calibre();
        CalibreDeAlturas calAlt = new CalibreDeAlturas(); 
        CalibreDigimatic calDig = new CalibreDigimatic();
        Articulo articulo = new Articulo();
        Dimensiones dimensiones = new Dimensiones();
        
        MetricaComparativa metComp = new MetricaComparativa();
        MetricaDeInterioresGUI metDeInt= new MetricaDeInterioresGUI();
        Visualizador visual= new Visualizador();
        
        JGuiExtensible compGui = metComp.createDialog();
        JGuiExtensible calAltGui = calAlt.createDialog();
        JGuiExtensible microGui= super.createDialog();
        JGuiExtensible articuloGui= articulo.createDialog();
        JGuiExtensible dimensionesGui= dimensiones.createDialog();
        
        compGui.addExtensibleChild(new VisualizadorGUI());
        
        compGui.setName("Metrica comparativa");
        microGui.setName("Metrica micrometrica");
        calAltGui.setName("Especificaciones");
        
        articuloGui.addExtensibleChild(dimensionesGui);
         
        dialog.addExtensibleChild(articuloGui);
        dialog.addExtensibleChild(metComp.createDialog());
        lista.add(calAltGui);
         
        listaGuis.add(compGui);
        listaGuis.add(microGui);
        
        dialog.addExtensibleChildrenList(lista);
       
       
       
          
        dialog.addExtensibleChildrenList(listaGuis);
         
        dialog.setName("Micrometro de interiores");
                
        return dialog;
    }
   
}
