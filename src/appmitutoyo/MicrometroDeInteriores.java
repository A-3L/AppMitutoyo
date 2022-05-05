/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appmitutoyo;

import appmitutoyo.interfaces.MetricaDeInteriores;
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
        
        CalibreDeAlturas calAlt = new CalibreDeAlturas();
       
        MetricaDeInteriores metrDeInt = new MetricaDeInteriores();
        Comparador comp = new Comparador();
        
        Calibre cal = new Calibre();
        
        CalibreDigimatic calDig = new CalibreDigimatic();
       
         
         listaGuis.add(metrDeInt.createDialog());
         //listaGuis.add(super.createDialog());
         //listaGuis.add(cal.createDialog());
         //listaGuis.add(calDig.createDialog());
        // lista.add(metrDeInt.createDialog());
         lista.add(calAlt.createDialog());
       
       // dialog.addExtensibleChild(calAlt.createDialog());
       // dialog.addExtensibleChild(comp.createDialog());
        dialog.addExtensibleChildrenList(listaGuis);
        dialog.addExtensibleChildrenList(lista);
       //  dialog.addExtensibleChild(metrDeInt.createDialog());
        //dialog.addExtensibleChild(compGui);
       // dialog.addExtensibleChild(calAlt.createDialog());
       // dialog.addExtensibleChild(calDig.createDialog());
        
        calAlt.createDialog().setName("Especificaciones");
        dialog.setName("Micrometro de interiores");
        
       // Calibre cal = new Calibre();
       // dialog.addExtensibleChild(cal.createDialog());
         
                      
        return dialog;
    }
    
    @Override
       public String toString() {
           return "Micrometro de interiores";
       }
}
