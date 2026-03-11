/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemanotas;

/**
 *
 * @author tobon
 */
import Controlador.ControladorNotas;
import Vista.VistaNotas;

public class SistemaNotas {

    public static void main(String[] args) {

        VistaNotas vista = new VistaNotas();
        ControladorNotas controlador = new ControladorNotas(vista);

        controlador.iniciar();
    }
}
