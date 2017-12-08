/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio_7_angelrisso;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Ordenes extends Thread {

    private cajero cajeros;
    private Producto productos;
    private ArrayList<Producto> producto;
    private boolean avanzar;
    private boolean bandera;
    
    public Ordenes() {
        producto=new ArrayList();
        avanzar = false;
        bandera = false;

    }

    private Cliente cliente;

   

    public void seguir() {
        avanzar = true;
    }

    

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void agregarProducto(Producto p) {
        producto.add(p);
    }

    public void setCajero(cajero cajeros) {
        this.cajeros = cajeros;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.producto = productos;
    }

    public cajero getCajero() {
        return cajeros;
    }

    public ArrayList<Producto> getProductos() {
        return producto;
    }

    @Override
    public void run() {
        bandera = true;
        
        while (true) {
            if (avanzar) {
                System.out.println(productos);
                DefaultTableModel modeloLista = (DefaultTableModel) cajeros.getVe().tb_cosa.getModel();
                cajeros.getVe().lbl_cajero.setText(cajeros.getNombre());
                cajeros.getVe().lbl_cliente.setText(cliente.getNombre());
                ArrayList<Producto> algo = new ArrayList<>();
                for (Producto p : producto) {
                    cajeros.getVe().tf_producto.setText(p.getNombre());
                    try {
                        Thread.sleep(p.getTime() * 1000);
                        Object[] row = new Object[]{p.getNombre(), cliente.getNombre(), p.getTime()};
                        modeloLista.addRow(row);
                        algo.add(p);
                    } catch (Exception e) {
                    }
                }
                producto.removeAll(algo);
                avanzar = false;
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        }
    }

}
