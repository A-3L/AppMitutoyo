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
import mitutoyo.data.Singularidad;
import mitutoyo.data.Visualizador;

/**
 * This class creates a graphical interface for one measurement instrument
 * called CalibreDigimatic
 * Superclass: Calibre.
 * 
 * @see Calibre
 * @author a31r1z
 */
public class CalibreDigimatic extends Calibre {

    /**
     * Creates a new CalibreDigimatic
     */  
    public CalibreDigimatic() {
       
    }
   /**
      * Creates a CalibreDigimatic extensible gui
      * 
      * @return an extensible gui for this measurement instrument
      */
    @Override
    protected JGuiExtensible createDialog() {
        
        JGuiExtensible dialog = JFactory.getInstance().createDialog(JTipoGui.SIMPLE,true); 
        JGuiExtensible dialogo = super.createDialog();
      
        var sing = new Singularidad();
        var singGui = sing.createDialog();
        
        dialogo.setName("Especificaciones");
        dialog.setName("Calibre Digimatic");
        
        dialogo.addJGui(singGui);
        dialog.addJGui(dialogo);   
           
        return dialog;              
    }
    
}
