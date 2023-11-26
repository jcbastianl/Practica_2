/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.Casa;

import controlador.DAO.DaoImplement;
import controlador.TDA.listas.DynamicList;
import logica.Casa;




/**
 *
 * @author jsbal
 */
public class CasaControl extends DaoImplement<Casa> {
   private DynamicList<Casa> casas;
    private Casa casa;

    public CasaControl() {
        super(Casa.class);
    }

    public DynamicList<Casa> getCasas() {
        casas = all();
        return casas;
    }

    public void setCasa(DynamicList<Casa> casas) {
        this.casas = casas;
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
    
    public Boolean persist(){
        
        
        return persist(casa);
    }
     
}
