package vista.listas.tablas;

import controlador.TDA.listas.DynamicList;
import controlador.TDA.listas.Exception.EmptyException;

import javax.swing.table.AbstractTableModel;
import logica.Vendedor;

/**
 *
 * @author jsbal
 */
public class ModeloTablaVendedor extends AbstractTableModel {

    private DynamicList<Vendedor> vendedores;

    @Override
    public int getRowCount() {
        return vendedores.getLenght();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        try {
            Vendedor p = vendedores.getInfo(rowIndex);
            switch (columnIndex) {
                case 0:
                    return (p != null) ? p.getDNI() : " ";
                case 1:
                    return (p != null) ? p.getApellido() + " " + p.getNombre() : "";
                case 2:
                    return (p != null) ? p.getTelefono() : "";
                case 3:
                    return (p != null) ? p.getEmail() : "";
              
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
                return "DNI";
            case 1:
                return "USUARIO";
            case 2:
                return "TELEFONO";
            case 3:
                return "EMAIL";
            default:
                return null;
        }
    }

    public DynamicList<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(DynamicList<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

}