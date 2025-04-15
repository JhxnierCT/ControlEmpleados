/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controlempleados;

    // Empleado.java
public abstract class Empleado {
    protected String codigo;
    protected String nombres;
    protected String apellidos;
    protected String direccion;
    protected double sueldoBasico;

    public Empleado(String codigo, String nombres, String apellidos, String direccion, double sueldoBasico) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.sueldoBasico = sueldoBasico;
    }

    public String getCodigo() {
        return codigo;
    }

    public abstract double calcularSalario();
    public abstract void mostrarDatos();
}
    
