/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.List;


/**
 *
 * @author sebastian
 */
public class Casa {
    //Los datos de la casa (dimension del terreno, area de construccion, direccion, tipo de casa, y demas datos que cosidere necesarios). 
    
    private String id;
    private static long idCounter = 0;
    private String dimension;
    private String area;
    private String direccion;
    private String tipo;
    private List<Venta> ventas;

    public Casa() {
         this.id = createID();
    }
     public static synchronized String createID() {
        return String.valueOf(idCounter++);
    }

    public Casa(String dimension, String area, String direccion, String tipo, List<Venta> ventas) {

    this.id = createID();
    
    this.dimension = dimension;
    this.area = area;
    this.direccion = direccion;
    this.tipo = tipo;
    this.ventas = ventas;

}

    public String getId() {
        return id;
    }

    
    public String setId(String id) {
        return this.id = id;
    }
   

 

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    @Override
    public String toString() {
        return "Casa{" + "id=" + id + ", direccion=" + direccion + '}';
    }
  
    
}