/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.jalec.vista;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author anthony
 */
public class Inventarios {

  

public class Inventario extends javax.swing.JInternalFrame {
    private static ArrayList<String> productos = new ArrayList<>();
    private DefaultListModel<String> modelo = new DefaultListModel<>();

    public Inventario() {
        initComponents();
        jListInventario.setModel(modelo);
        cargarProductos();
        
    }

    public static void agregarProductos(String producto) {
        productos.add(producto);
    }

    private void cargarProductos() {
        modelo.clear();
        for (String p : productos) {
            modelo.addElement(p);
        }
    }

    public void actualizarLista() {
        cargarProductos();
    }

    public void agregar() {
        
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    private void initComponents() {
        jScrollPane1 = new javax.swing.JScrollPane();
        jListInventario = new javax.swing.JList<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Inventario");

        jScrollPane1.setViewportView(jListInventario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );

        pack();
    }

    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> jListInventario;
}

    
}
