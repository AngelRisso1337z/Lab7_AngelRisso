/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio_7_angelrisso;

import javax.swing.JLabel;

/**
 *
 * @author HP_AMD_64
 */
public class HiloNombres extends Thread {

    private JLabel nomCajero;
    private JLabel nomCliente;
    private JLabel cosas;
    private JLabel cosas2;
    private int wait;

    public HiloNombres() {
    }

    public HiloNombres(JLabel nomCajero, JLabel nomCliente, JLabel cosas, JLabel cosas2, int wait) {
        this.nomCajero = nomCajero;
        this.nomCliente = nomCliente;
        this.cosas = cosas;
        this.cosas2 = cosas2;
        this.wait = wait;
    }

    @Override
    public void run() {
        String nombreC=nomCajero.getName();
        String nombreCl=nomCliente.getName();
        
    }

}
