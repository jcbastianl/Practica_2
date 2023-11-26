/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.listas.tablas;

import controlador.TDA.listas.DynamicList;
import controlador.TDA.listas.Exception.EmptyException;
import javax.swing.table.AbstractTableModel;
import logica.Venta;

/**
 *
 * @author jsbal
 */
public class ModeloTablaVenta extends AbstractTableModel {
     private DynamicList<Venta> ventas;

    public int getRowCount() {
        return ventas.getLenght();
    }

    public int getColumnCount() {
        return 5; 
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        try {
            Venta v = ventas.getInfo(rowIndex);
            switch (columnIndex) {
                case 0: 
                    return (v != null) ? v.getId() : "";
                case 1:
                    return (v != null) ? v.getFechaVenta() : "";
                case 2:
                    return (v != null) ? v.getVendedor().getNombre() : "";
                case 3:
                    return (v != null) ? v.getVendedor().getApellido() : "";
                case 4:
                    return (v != null) ? v.getCasa().getDireccion() : "";
                case 5:
                    return (v != null) ? v.getMonto() : "";
                default:
                    return null;
            }
        } catch (EmptyException ex) {
            return null;
        }
    }

    
    public String getColumnName(int column) {
        switch (column) {
            case 0: 
                return "ID";
            case 1:
                return "FECHA";
            case 2:
                return "VENDEDOR";
            case 3:
                return "CASA";
            case 4:
                return "MONTO";
            default:
                return null;
        }
    }

    public DynamicList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(DynamicList<Venta> ventas) {
        this.ventas = ventas; 
    }


}
