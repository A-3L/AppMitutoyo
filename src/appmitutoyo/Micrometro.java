/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appmitutoyo;

import appmitutoyo.interfaces.MetricaMicrometricaGUI;
import appmitutoyo.interfaces.FuncionesGUI;
import appmitutoyo.interfaces.Utilidades;
import java.util.Arrays;
import jguiextensible.JFactory;
import jguiextensible.JGuiExtensible;
import jguiextensible.JTipoGui;

/**
 *
 * @author a31r1z
 */
public class Micrometro {
   

    public Micrometro() {
        
       
    }
    
     protected JGuiExtensible createDialog() {
        
         JGuiExtensible dialog = new MetricaMicrometricaGUI();
         dialog.setName("Metrica micrometrica");
         
         JGuiExtensible funciones = new FuncionesGUI();
         //funciones.setName("Funciones");
         
         dialog.addExtensibleChild(funciones);
         dialog.setName("Micrometro");
               
        return dialog;       
    }
    
    
}
