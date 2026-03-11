/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author tobon
 */
import Modelo.ModeloCursos;
import Modelo.ModeloEstudiantes;
import Vista.VistaNotas;

public class ControladorNotas {

    private ModeloCursos curso;
    private VistaNotas vista;

    public ControladorNotas(VistaNotas vista) {
        this.vista = vista;
    }

    public void iniciar() {

        boolean salir = false;

        while (!salir) {

            int opcion = vista.mostrarMenu();

            switch (opcion) {

                case 1:
                    int cantidad = vista.pedirCantidad();
                    curso = new ModeloCursos(cantidad);

                    for (int i = 0; i < cantidad; i++) {
                        ModeloEstudiantes e = vista.pedirEstudiante();
                        curso.agregarEstudiante(i, e);
                    }
                    break;

                case 2:
                    if (curso != null)
                        curso.mostrarOrdenados();
                    else
                        System.out.println("Primero registre estudiantes.");
                    break;

                case 3:
                    if (curso != null) {
                        double limite = vista.pedirLimite();
                        curso.mostrarMayoresA(limite);
                    } else {
                        System.out.println("Primero registre estudiantes.");
                    }
                    break;

                case 4:
                    if (curso != null) {
                        double incremento = vista.pedirIncremento();
                        curso.incrementarTodos(incremento);
                    } else {
                        System.out.println("Primero registre estudiantes.");
                    }
                    break;

                case 5:
                    if (curso != null) {
                        int codigo = vista.pedirCodigoModificar();
                        double nuevaDes = vista.pedirNuevaNotaDesarrollo();
                        double nuevaMat = vista.pedirNuevaNotaMatematica();
                        curso.modificarNota(codigo, nuevaDes, nuevaMat);
                    } else {
                        System.out.println("Primero registre estudiantes.");
                    }
                    break;

                case 6:
                    salir = true;
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }
        }
    }
}