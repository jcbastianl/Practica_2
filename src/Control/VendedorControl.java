/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import controlador.DAO.DaoImplement;
import controlador.TDA.listas.DynamicList;
import controlador.TDA.listas.Exception.EmptyException;



import logica.Vendedor;

/**
 *
 * @author sebastian
 */
public class VendedorControl extends DaoImplement <Vendedor> {

    private Vendedor vendedor = new Vendedor();

    private DynamicList<Vendedor> vendedores;

    public VendedorControl() {
        super(Vendedor.class);
    }

  

    //Método que permite guardar
    public Boolean guardar() {
            
            return true;
        
    }

    public Integer posVerificar() throws EmptyException {
        Integer bandera = 0;
        for (Integer i = 0; i < vendedores.getLenght(); i++) {
            if (vendedores.getInfo(i) == null) {
                bandera = i;
                break;
            }
        }
        return bandera;
    }

    public void imprimir() throws EmptyException {
        for (int i = 0; i < vendedores.getLenght(); i++) {
            System.out.println(vendedores.getInfo(i));
        }
    }

    public Vendedor getVendedor() {
        if (vendedor == null) {
            vendedor = new Vendedor();
        }
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public DynamicList<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(DynamicList<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    @Override
    public String toString() {
        return "DNI: " + getVendedor().getDNI() + " Apellidos: " + getVendedor().getApellido() + " Nombres: " + getVendedor().getNombre();
    }

}