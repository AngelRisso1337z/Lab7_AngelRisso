/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio_7_angelrisso;

import java.util.ArrayList;

public class Cliente {

    private String nombre;
    private int edad;
    private Ordenes ord;
    private ArrayList<Ordenes> ordenes;
    private boolean avanzar;
    public boolean bandera;

    public Cliente() {
    }

    public Cliente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        ord = new Ordenes();
        ordenes = new ArrayList<>();
        avanzar = false;
        bandera = false;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Ordenes> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(ArrayList<Ordenes> ordenes) {
        this.ordenes = ordenes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Ordenes getOrd() {
        return ord;
    }

    public void setOrd(Ordenes ord) {
        this.ord = ord;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public void agregarOrden(cajero c, Producto p) {
        boolean bandera = false;
        for (int i = 0; i < ordenes.size(); i++) {
            if (ordenes.get(i).getCajero().getNombre().equals(c.getNombre())) {
                bandera = true;
                ordenes.get(i).agregarProducto(p);
                ordenes.get(i).setCliente(this);
            }
        }
        if (!bandera) {
            Ordenes tempOrden = new Ordenes();
            tempOrden.setCajero(c);
            tempOrden.agregarProducto(p);
            tempOrden.setCliente(this);
            ordenes.add(tempOrden);
        }
        System.out.println(ordenes);
        System.out.println(ordenes.get(0).getCajero().getNombre());
    }
}
