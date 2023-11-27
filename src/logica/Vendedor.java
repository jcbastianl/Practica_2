/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.io.Serializable;
import java.util.List;
/**
 *
 * @author sebastian
 */
public class Vendedor implements Serializable {

    
    private Integer id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private List<Venta> ventas;
    private int numeroVentas;
    private String DNI;
    

    public Vendedor() {
    }

    public Vendedor(Integer id, String nombre, String apellido, String telefono, String email, List<Venta> ventas, int numeroVentas, String DNI) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
       
        this.ventas = ventas;
        this.numeroVentas = numeroVentas;
        this.DNI = DNI;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

 

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    public int getNumeroVentas() {
        return numeroVentas;
    }

    public void setNumeroVentas(int numeroVentas) {
        this.numeroVentas = numeroVentas;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return   " " + nombre + "," + apellido ;
    }

    
}
   