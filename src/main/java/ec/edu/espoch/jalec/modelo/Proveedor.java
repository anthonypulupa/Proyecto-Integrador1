/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.jalec.modelo;

/**
 *
 * @author anthony
 */
public class Proveedor {

    private int id;
    private String nombre;
    private String direccion;
    private String empresa;
    private String productos;

    public Proveedor(int id, String nombre, String direccion, String empresa, String productos) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.empresa = empresa;
        this.productos = productos;
    } 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }
}
