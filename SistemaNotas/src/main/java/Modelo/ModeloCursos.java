/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author tobon
 */
public class ModeloCursos {

    private ModeloEstudiantes[] estudiantes;
    private int cantidad;

    public ModeloCursos(int cantidad) {
        this.cantidad = cantidad;
        estudiantes = new ModeloEstudiantes[cantidad];
    }

    public void agregarEstudiante(int posicion, ModeloEstudiantes e) {
        estudiantes[posicion] = e;
    }

    public void mostrarOrdenados() {

        for (int i = 0; i < cantidad - 1; i++) {
            for (int j = 0; j < cantidad - 1 - i; j++) {

                if (estudiantes[j].calcularDefinitiva() >
                        estudiantes[j + 1].calcularDefinitiva()) {

                    ModeloEstudiantes aux = estudiantes[j];
                    estudiantes[j] = estudiantes[j + 1];
                    estudiantes[j + 1] = aux;
                }
            }
        }

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Codigo: " + estudiantes[i].getCodigo());
            System.out.println("Nombre: " + estudiantes[i].getNombre());
            System.out.println("Definitiva: " + estudiantes[i].calcularDefinitiva());
            System.out.println("Estado: " + estudiantes[i].obtenerAprobacion());
            System.out.println("-----------------------");
        }
    }

    public void mostrarMayoresA(double limite) {
        for (int i = 0; i < cantidad; i++) {
            if (estudiantes[i].calcularDefinitiva() > limite) {
                System.out.println(estudiantes[i].getCodigo() + " - "
                        + estudiantes[i].getNombre()
                        + " - " + estudiantes[i].calcularDefinitiva());
            }
        }
    }

    public void modificarNota(int codigo, double nuevaDes, double nuevaMat) {

        boolean encontrado = false;

        for (int i = 0; i < cantidad; i++) {
            if (estudiantes[i].getCodigo() == codigo) {
                estudiantes[i].setNotaDesarrollo(nuevaDes);
                estudiantes[i].setNotaMatematica(nuevaMat);
                encontrado = true;
            }
        }

        if (!encontrado)
            System.out.println("Estudiante no encontrado.");
        else
            System.out.println("Notas modificadas correctamente.");
    }

    public void incrementarTodos(double incremento) {
        if (incremento > 0.5) {
        return;
    }
        for (int i = 0; i < cantidad; i++) {
            estudiantes[i].incrementarDesarrollo(incremento);
        }
        System.out.println("Incremento aplicado.");
    }
}
