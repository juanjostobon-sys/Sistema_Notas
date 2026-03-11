/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ModeloCursosTest {

    @Test
    public void testAgregarYModificarNota() {

        ModeloCursos curso = new ModeloCursos(1);

        ModeloEstudiantes e = new ModeloEstudiantes(23000, "Carlos", 3.0, 3.0);

        curso.agregarEstudiante(0, e);

        curso.modificarNota(23000, 5.0, 5.0);

        assertEquals(5.0, e.getNotaDesarrollo(), 0.01);
        assertEquals(5.0, e.getNotaMatematica(), 0.01);
    }

    @Test
    public void testIncrementarTodos() {

        ModeloCursos curso = new ModeloCursos(1);

        ModeloEstudiantes e = new ModeloEstudiantes(24000, "Laura", 4.0, 4.0);

        curso.agregarEstudiante(0, e);

        curso.incrementarTodos(0.5);

        assertEquals(4.5, e.getNotaDesarrollo(), 0.01);
    }
}
