/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author tobon
 */
public class ModeloEstudiantes {

    private int codigo;
    private String nombre;
    private double notaDesarrollo;
    private double notaMatematica;

    public ModeloEstudiantes(int codigo, String nombre, double notaDesarrollo, double notaMatematica) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.notaDesarrollo = notaDesarrollo;
        this.notaMatematica = notaMatematica;
    }

    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) {
        if (codigo > 21000) this.codigo = codigo;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getNotaDesarrollo() { return notaDesarrollo; }
    public void setNotaDesarrollo(double notaDesarrollo) { this.notaDesarrollo = notaDesarrollo; }

    public double getNotaMatematica() { return notaMatematica; }
    public void setNotaMatematica(double notaMatematica) { this.notaMatematica = notaMatematica; }

    public double calcularDefinitiva() {
        return (notaDesarrollo * 0.55) + (notaMatematica * 0.45);
    }

    public String obtenerAprobacion() {
        return calcularDefinitiva() >= 3.5 ? "SI APRUEBA" : "NO APRUEBA";
    }

    public void incrementarDesarrollo(double incremento) {
        if (notaDesarrollo + incremento <= 5.0)
            notaDesarrollo += incremento;
        else
            notaDesarrollo = 5.0;
    }
}
