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
import mitutoyo.data.Funciones;
import mitutoyo.data.MetricaComparativa;
import mitutoyo.data.MetricaDeInteriores;
import mitutoyo.data.Singularidad;
import mitutoyo.data.Visualizador;

/**
 * This class creates a graphical interface for one measurement instrument
 * called Micrometro de Alturas.
 * Superclass: Micrometro.
 * 
 * @see Micrometro
 * @author a31r1z
 */
public class MicrometroDeAlturas extends Micrometro {

    /**
     * Creates a new MicrometroDeAlturas
     */
    public MicrometroDeAlturas() {
    }
     /**
      * Creates a MicrometroDeAlturas extensible gui
      * 
      * @return a extensible gui for this measurement instrument
      */
    @Override
    public JGuiExtensible createDialog() {
        
        var dialog = JFactory.getInstance().createDialog(JTipoGui.SIMPLE, true);
        var tree1 = JFactory.getInstance().createDialog(JTipoGui.TREE, false);
        var tree =  JFactory.getInstance().createDialog(JTipoGui.TREE, false);
       
        var especif = super.createDialog();
        
        var visual = new Visualizador();
        var visualGui = visual.createDialog();
        
        var metComp = new MetricaComparativa();
        var metCompGui = metComp.createDialog();
        
        var metDeInt= new MetricaDeInteriores();
        var metDeIntGui = metDeInt.createDialog();
        
        var sing = new Singularidad();
        var singGui = sing.createDialog();
        
        var certif = new Certificados();
        var certifGui = certif.createDialog();
        
        var funciones = new Funciones();
        var funcionesGui = funciones.createDialog();
        
        tree.setName("Otras Metricas");
        tree1.setName("Funciones");
        dialog.setName("Micrometro de Alturas");
        
        tree.addJGui(metCompGui);
        tree.addJGui(metDeIntGui);
        tree.addJGui(visualGui);
             
        tree1.addJGui(funcionesGui);
        tree1.addJGui(singGui);
        
        especif.addJGui(tree);    
        especif.addJGui(tree1);
        especif.addJGui(certifGui);
        
        dialog.addJGui(especif);
           
         return dialog;
        
    }
    
}
