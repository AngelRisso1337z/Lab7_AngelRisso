/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio_7_angelrisso;

public class cajero {

    private String nombre;
    private int ID;
    VentanaCajero ve;

    
    public cajero() {
    }

    public cajero(String nombre, int ID, VentanaCajero ve) {
        this.nombre = nombre;
        this.ID = ID;
        this.ve = ve;
    }

    public VentanaCajero getVe() {
        return ve;
    }

    public void setVe(VentanaCajero ve) {
        this.ve = ve;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
