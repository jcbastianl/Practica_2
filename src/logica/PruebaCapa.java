/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import Control.VendedorControl;
import controlador.TDA.listas.Exception.EmptyException;
import igu.Vendedor.FrmRegistroVendedor;

/**
 *
 * @author sebastian
 */
public class PruebaCapa {
    
    VendedorControl control = new VendedorControl();
    public static void main(String[] args) throws EmptyException {
        new FrmRegistroVendedor().setVisible(true);
    } 
        
      
       
    

}