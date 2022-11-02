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

import mitutoyo.data.MetricaComparativa;
import java.util.ArrayList;
import java.util.List;
import jguiextensible.JFactory;
import jguiextensible.JGuiExtensible;
import jguiextensible.JTipoGui;
import mitutoyo.data.Certificados;
import mitutoyo.data.Funciones;
import mitutoyo.data.MetricaDeInteriores;
import mitutoyo.data.MetricaDeMedicion;
import mitutoyo.data.Observaciones;
import mitutoyo.data.Singularidad;
import mitutoyo.data.Visualizador;

/**
 *This class creates a graphical interface for one measurement instrument
 * called MicrometroDeInteriores.
 * Superclass: Micrometro
 * 
 * @see Micrometro
 * @author a31r1z
 */
public class MicrometroDeInteriores extends Micrometro {
    
   /**
    * Creates a new MicrometroDeInteriores
    */

    public MicrometroDeInteriores() {
        
    }
    /**
      * Creates a MicrometroDeInteriores extensible gui
      * 
      * @return a extensible gui for this measurement instrument
      */ 
    
    @Override
       protected JGuiExtensible createDialog() {
               
        JGuiExtensible dialog = JFactory.getInstance().createDialog(JTipoGui.TREE, true);
       
        List<JGuiExtensible> listaGuis = new ArrayList<>();
        List<JGuiExtensible> lista = new ArrayList<>();
        
        var especif= super.createDialog();     
        
        var metComp = new MetricaComparativa();
        var metCompGui = metComp.createDialog();  
        
        var metDeInt= new MetricaDeInteriores();
        var metDeIntGui = metDeInt.createDialog(); 
        
        var metDeMed= new MetricaDeMedicion();
        var metDeMedGui = metDeMed.createDialog();  
        
        var visual= new Visualizador();
        var visualGui = visual.createDialog(); 
        
        var funciones = new Funciones();
        var funcionesGui = funciones.createDialog();
        
        var obs = new Observaciones();
        var obsGui = obs.createDialog();
        var obs2Gui = obs.createDialog();
        
        var certif = new Certificados();
        var certifGui = certif.createDialog();   
        
        var sing = new Singularidad();
        var singGui = sing.createDialog();
        
        
        especif.addJGui(metDeIntGui);
        especif.addJGui(metCompGui);
        
        visualGui.addJGui(obsGui);
        funcionesGui.addJGui(obs2Gui);
        
        lista.add(metDeIntGui);
        lista.add(metCompGui);
        
        listaGuis.add(singGui);
        listaGuis.add(certifGui);
        listaGuis.add(visualGui);
 
        dialog.addJGui(especif); 
        dialog.addJGuiChildrenList(lista);   
        dialog.addJGuiChildrenList(listaGuis);
        dialog.addJGui(funcionesGui);
        
        
        especif.setName("Especificaciones");
        obsGui.setName("Observaciones");
        dialog.setName("Micrometro de interiores");
                
        return dialog;
    }
   
}
