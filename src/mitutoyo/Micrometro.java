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
import mitutoyo.data.Especificaciones;
import mitutoyo.data.MetricaDeMedicion;
import mitutoyo.data.MetricaMicrometrica;

/**
 * This class creates a graphical interface for one measurement instrument
 * called Micrometro
 * 
 * @author a31r1z
 */
public class Micrometro {
   
     /**
      * Creates a new Micrometro
      */
     public Micrometro() {
        
    }
     /**
      * Creates a Micrometro extensible gui
      * 
      * @return an extensible gui for this measurement instrument
      */
     protected JGuiExtensible createDialog() {
         
        JGuiExtensible dialog = JFactory.getInstance().createDialog(JTipoGui.TABBED,false);
                
        var metMicr = new MetricaMicrometrica();
        var metMicrGui = metMicr.createDialog();
        
        var especif = new Especificaciones();
        var especifGui = especif.createDialog();
        
        var metDeMed = new MetricaDeMedicion();
        var metDeMedGui = metDeMed.createDialog(); 
           
         metDeMedGui.addJGui(metMicrGui);
       
         dialog.addJGui(especifGui);
         dialog.addJGui(metDeMedGui);
         dialog.addJGui(metMicrGui);
               
         dialog.setName("Micrometro");
               
        return dialog;       
    }
    
    
}
