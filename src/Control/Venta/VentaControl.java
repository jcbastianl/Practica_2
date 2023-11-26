/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control.Venta;

import controlador.DAO.DaoImplement;
import controlador.TDA.listas.DynamicList;
import controlador.TDA.listas.Exception.EmptyException;
import logica.Venta;

/**
 *
 * @author jsbal
 */
public class VentaControl extends DaoImplement <Venta> {
     private Venta venta = new Venta();

    private DynamicList<Venta> ventas;

    public VentaControl(Class<Venta> clazz) {
        super(clazz);
    }

    
    //Método que permite guardar
   public Boolean guardar() {
       try {

        ventas.add(getVenta());

        return true;

    } catch (Exception e) {
       return false;
    }
    }

    public Integer posVerificar() throws EmptyException {
        Integer bandera = 0;
        for (Integer i = 0; i < ventas.getLenght(); i++) {
            if (ventas.getInfo(i) == null) {
                bandera = i;
                break;
            }
        }
        return bandera;
    }

    public void imprimir() throws EmptyException {
        for (int i = 0; i < ventas.getLenght(); i++) {
            System.out.println(ventas.getInfo(i));
        }
    }

    public Venta getVenta() {
        if (venta == null) {
            venta = new Venta();
        }
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public DynamicList<Venta> getVentas() {
        return ventas;
    }

    public void setVendedores(DynamicList<Venta> ventas) {
        this.ventas = ventas;
    }

    
}
