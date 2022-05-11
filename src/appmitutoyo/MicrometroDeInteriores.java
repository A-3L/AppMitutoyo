/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appmitutoyo;

import appmitutoyo.data.MetricaComparativa;
import appmitutoyo.data.MetricaDeInteriores;
import appmitutoyo.data.Visualizador;
import appmitutoyo.interfaces.MetricaDeInterioresGUI;
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
        MetricaComparativa metComp = new MetricaComparativa();
        MetricaDeInteriores metDeInt= new MetricaDeInteriores();
        Visualizador visual= new Visualizador();
        
        JGuiExtensible compGui = metComp.createDialog();
        JGuiExtensible calAltGui = calAlt.createDialog();
        JGuiExtensible microGui= super.createDialog();
        
        compGui.addExtensibleChild(visual.createDialog());
        
        compGui.setName("Metrica comparativa");
        microGui.setName("Metrica micrometrica");
        calAltGui.setName("Especificaciones");
         
        dialog.addExtensibleChild(calAltGui);
        
        lista.add(metDeInt.createDialog());
         
        listaGuis.add(microGui);   
        listaGuis.add(compGui);
        
        dialog.addExtensibleChildrenList(lista);
        dialog.addExtensibleChildrenList(listaGuis);
         
        dialog.setName("Micrometro de interiores");
                
        return dialog;
    }
   
}
