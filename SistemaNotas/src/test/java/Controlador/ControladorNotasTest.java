/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Controlador;

import Vista.VistaNotas;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ControladorNotasTest {

    @Test
    public void testCrearControlador() {

        VistaNotas vista = new VistaNotas();
        ControladorNotas controlador = new ControladorNotas(vista);

        assertNotNull(controlador);
    }
}
