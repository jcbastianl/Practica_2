/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.Date;
import static logica.Casa.createID;

/**
 *
 * @author sebastian
 */
public class Venta {
    private String id; 
    private static long idCounter = 0;
    private Date fechaVenta;
    private Vendedor vendedor;
    private Casa casa;
    private double monto;

    public Venta() {
        this.id = createID();
    }
    
    public static synchronized String createID() {
        return String.valueOf(idCounter++);
    }

    public Venta(String id, Date fechaVenta, Vendedor vendedor, Casa casa, double monto) {
        this.id = createID();
        this.fechaVenta = fechaVenta;
        this.vendedor = vendedor;
        this.casa = casa;
        this.monto = monto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

   
    
}
