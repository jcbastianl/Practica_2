/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.listas.tablas;

import controlador.TDA.listas.DynamicList;
import controlador.TDA.listas.Exception.EmptyException;
import javax.swing.table.AbstractTableModel;
import logica.Casa;


/**
 *
 * @author jsbal
 */
public class ModeloTablaCasa extends AbstractTableModel{
    private DynamicList<Casa> casas;

    @Override
    public int getRowCount() {
        return casas.getLenght();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        try {
            Casa p = casas.getInfo(rowIndex);
            switch (columnIndex) {
                case 0:
                    return (p != null) ? p.getDimension() : " ";
                case 1:
                    return (p != null) ? p.getArea() : " ";
                case 2:
                    return (p != null) ? p.getDireccion() : " " ;
                case 3:
                    return (p != null) ? p.getTipo() : " " ;
              
                default:
                    return null;
            }
            
        } catch (EmptyException ex) {
            return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Dimension";
            case 1:
                return "Area";
            case 2:
                return "Direccion";
            case 3:
                return "Tipo";
            default:
                return null;
        }
    }

    public DynamicList<Casa> getCasas() {
        return casas;
    }

    public void setCasas(DynamicList<Casa> casas) {
        this.casas = casas;
    }

}
