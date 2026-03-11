/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

/**
 *
 * @author tobon
 */
import java.util.Scanner;
import Modelo.ModeloEstudiantes;

public class VistaNotas {

    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n   MENU    ");
        System.out.println("1. Registrar estudiantes");
        System.out.println("2. Mostrar lista");
        System.out.println("3. Mostrar los mayores a la nota limite");
        System.out.println("4. subir la nota desarrollo");
        System.out.println("5. Cambiar nota de estudiante");
        System.out.println("6. Salir");
        System.out.print("Seleccione opcion: ");
        return Integer.parseInt(sc.nextLine());
    }

    public int pedirCantidad() {
        System.out.print("Cuantos estudiantes va a ingresar: ");
        return Integer.parseInt(sc.nextLine());
    }

    public ModeloEstudiantes pedirEstudiante() {

        System.out.print("Ingrese el codigo del estudiante mayor a 21000: ");
        int codigo = Integer.parseInt(sc.nextLine());

        System.out.print("Nombre del estudiante: ");
        String nombre = sc.nextLine();

        System.out.print("Nota de desarrollo: ");
        double des = Double.parseDouble(sc.nextLine().replace(",", "."));

        System.out.print("Nota de matematicas: ");
        double mat = Double.parseDouble(sc.nextLine().replace(",", "."));

        return new ModeloEstudiantes(codigo, nombre, des, mat);
    }

    public double pedirLimite() {
        System.out.print("Ingrese la nota limite: ");
        return Double.parseDouble(sc.nextLine().replace(",", "."));
    }

    public double pedirIncremento() {
        System.out.print("Ingrese cuanto incrementara (0.0 - 0.5): ");
        return Double.parseDouble(sc.nextLine().replace(",", "."));
    }

    public int pedirCodigoModificar() {
        System.out.print("Codigo del estudiante: ");
        return Integer.parseInt(sc.nextLine());
    }

    public double pedirNuevaNotaDesarrollo() {
        System.out.print("Nueva nota de desarrollo: ");
        return Double.parseDouble(sc.nextLine().replace(",", "."));
    }

    public double pedirNuevaNotaMatematica() {
        System.out.print("Nueva nota de matematicas: ");
        return Double.parseDouble(sc.nextLine().replace(",", "."));
    }
}