/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control.Casa;

import controlador.DAO.DaoImplement;
import controlador.TDA.listas.DynamicList;
import controlador.TDA.listas.Exception.EmptyException;

import logica.Casa;


/**
 *
 * @author jsbal
 */


public class CasaControl extends DaoImplement <Casa> {
    private Casa casa = new Casa();

    private DynamicList<Casa> casas;

    public CasaControl() {
        super(Casa.class);
    }

    
    
   

    //Método que permite guardar
    public Boolean guardar() {
       

        //casas.add(getCasa());

        return true;

  
    }

    public Integer posVerificar() throws EmptyException {
        Integer bandera = 0;
        for (Integer i = 0; i < casas.getLenght(); i++) {
            if (casas.getInfo(i) == null) {
                bandera = i;
                break;
            }
        }
        return bandera;
    }

    public void imprimir() throws EmptyException {
        for (int i = 0; i < casas.getLenght(); i++) {
            System.out.println(casas.getInfo(i));
        }
    }

    public Casa getCasa() {
        if (casa == null) {
            casa = new Casa();
        }
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public DynamicList<Casa> getCasas() {
        return casas;
    }

    public void setVendedores(DynamicList<Casa> casas) {
        this.casas = casas;
    }

    

   

}
 