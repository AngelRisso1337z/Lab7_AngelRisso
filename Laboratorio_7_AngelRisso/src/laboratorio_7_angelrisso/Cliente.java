/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio_7_angelrisso;

public class Cliente {
    String nombre;
    int edad;
    Ordenes ord;

    public Cliente() {
    }

    public Cliente(String nombre, int edad, Ordenes ord) {
        this.nombre = nombre;
        this.edad = edad;
        this.ord = ord;
    }

    public String getNombre() {
        return nombre;
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
    
}
