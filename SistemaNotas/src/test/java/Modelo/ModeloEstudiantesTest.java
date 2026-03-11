/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;
/**
 *
 * @author tobon
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ModeloEstudiantesTest {

    @Test
    public void testCalcularDefinitiva() {

        ModeloEstudiantes e = new ModeloEstudiantes(22000, "Juan", 4.0, 3.0);

        double definitiva = e.calcularDefinitiva();

        assertEquals(3.55, definitiva, 0.01);
    }

    @Test
    public void testAprobacion() {

        ModeloEstudiantes e = new ModeloEstudiantes(22001, "Ana", 5.0, 5.0);

        assertEquals("SI APRUEBA", e.obtenerAprobacion());
    }

    @Test
    public void testNoAprueba() {

        ModeloEstudiantes e = new ModeloEstudiantes(22002, "Luis", 2.0, 2.0);

        assertEquals("NO APRUEBA", e.obtenerAprobacion());
    }

    @Test
    public void testIncrementarDesarrollo() {

        ModeloEstudiantes e = new ModeloEstudiantes(22003, "Maria", 4.8, 4.0);

        e.incrementarDesarrollo(0.5);

        assertEquals(5.0, e.getNotaDesarrollo(), 0.01);
    }
}
