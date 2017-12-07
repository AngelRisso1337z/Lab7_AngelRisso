/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio_7_angelrisso;

import java.util.ArrayList;

public class Ordenes {
    private ArrayList<Producto>productos=new ArrayList();
    
    public Ordenes() {
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    
    public void setProductos(Producto p) {
        this.productos.add(p);
    }

    @Override
    public String toString() {
        return productos.toString();
    }
    
}
