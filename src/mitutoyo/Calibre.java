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
import mitutoyo.data.Especificaciones;
import mitutoyo.data.Funciones;
import mitutoyo.data.MetricaDeMedicion;
import mitutoyo.data.Singularidad;
import mitutoyo.data.Visualizador;

/**
 * This class creates a graphical interface for one measurement instrument
 * called Calibre
 * 
 * @author a31r1z
 */
public class Calibre {
 
    /**
     * Creates a new Calibre.
     */
    public Calibre() {
         
    }
 
    /**
      * Creates a Calibre extensible gui
      * 
      * @return an extensible gui for this measurement instrument
      */
    
    protected JGuiExtensible createDialog() {
        
        JGuiExtensible dialog = JFactory.getInstance().createDialog(JTipoGui.SIMPLE,false); 
       
        dialog.setName("Calibre");
        
        var especificaciones = new Especificaciones();
        var especificacionesGui= especificaciones.createDialog();
        
        var metDeMed = new MetricaDeMedicion();
        var metDeMedGui = metDeMed.createDialog();
        
        var sing = new Singularidad();
        var singGui = sing.createDialog();
        
        var visual = new Visualizador();
        var visualGui = visual.createDialog();
        
        var funciones = new Funciones();
        var funcionesGui = funciones.createDialog();
       
        especificacionesGui.addJGui(funcionesGui);
        dialog.addJGui(especificacionesGui);
                         
        return dialog;
    } 
}