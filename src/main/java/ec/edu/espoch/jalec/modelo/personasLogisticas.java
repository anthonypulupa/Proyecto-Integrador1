/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.jalec.modelo;

/**
 *
 * @author anthony
 */
public class personasLogisticas {
    
    private String fecha;
    private String producto;
    private String categoria;
    private String cantidad;
    private String tipo; // Entrada o Salida

    public personasLogisticas(String fecha, String producto, String categoria, String cantidad, String tipo) {
        this.fecha = fecha;
        this.producto = producto;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
