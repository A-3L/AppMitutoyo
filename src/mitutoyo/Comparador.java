/**
 * AppMitutoyo is an application to show how works the implementation of the library JGuiExtensible
 * that develops a reusable gui pattern.
 * 
 * Copyright (C) 2022 Alberto Eiriz Lopez
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 * 
*/
package mitutoyo;

import jguiextensible.JFactory;
import jguiextensible.JGuiExtensible;
import jguiextensible.JTipoGui;
import mitutoyo.data.Certificados;
import mitutoyo.data.MetricaComparativa;
import mitutoyo.data.MetricaDeInteriores;
import mitutoyo.data.MetricaDeMedicion;
import mitutoyo.data.Observaciones;
import mitutoyo.data.Visualizador;

/**
 * This class creates a graphical interface for one measurement instrument
 * called Comparador.
 * Superclass: Calibre.
 * 
 * @see Calibre
 * @author a31r1z
 */
public class Comparador extends Calibre {
   
    /**
     * Creates a new Comparador
     */
    public Comparador() {
        
    }
      /**
      * Creates a Comparador extensible gui
      * 
      * @return an extensible gui for this measurement instrument
      */
      protected JGuiExtensible createDialog() {
       
        JGuiExtensible dialog = JFactory.getInstance().createDialog(JTipoGui.TABBED,true);
        JGuiExtensible tree =  JFactory.getInstance().createDialog(JTipoGui.TREE,false);
       
        var especif = super.createDialog();
        
        var metComp= new MetricaComparativa(); 
        var metCompGui = metComp.createDialog();
              
        var visual = new Visualizador();
        var visualGui = visual.createDialog();
        
        var metDeMed = new MetricaDeMedicion();
        var metDeMedGui = metDeMed.createDialog();
        
        var metDeInt= new MetricaDeInteriores();
        var metDeIntGui = metDeInt.createDialog();
        
        var certif = new Certificados();
        var certifGui = certif.createDialog();
        
        var obs = new Observaciones();
        var obsGui = obs.createDialog();
         
        especif.setName("Especificaciones");
        dialog.setName("Comparador");
        tree.setName("Metricas");
    
        visualGui.addJGui(obsGui); 
        
        tree.addJGui(metDeMedGui);
        tree.addJGui(metCompGui);
        tree.addJGui(metDeIntGui);
        
        
        dialog.addJGui(especif);    
        dialog.addJGui(tree);
        dialog.addJGui(visualGui);
        dialog.addJGui(certifGui);
        
        return dialog;       
    }
    
}
