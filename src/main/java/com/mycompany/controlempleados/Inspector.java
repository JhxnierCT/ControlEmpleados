/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controlempleados;

    // Inspector.java
public class Inspector extends Empleado {
    private String especialidad;
    private int horasExtras;

    public Inspector(String codigo, String nombres, String apellidos, String direccion, double sueldoBasico, String especialidad, int horasExtras) {
        super(codigo, nombres, apellidos, direccion, sueldoBasico);
        this.especialidad = especialidad;
        this.horasExtras = horasExtras;
    }

    public double calcularSalario() {
        double bono = sueldoBasico * 0.30;
        return sueldoBasico + bono + (horasExtras * 20);
    }

    public void mostrarDatos() {
        System.out.println("Inspector:");
        System.out.println("Código: " + codigo);
        System.out.println("Nombres: " + nombres + " " + apellidos);
        System.out.println("Dirección: " + direccion);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Horas Extras: " + horasExtras);
        System.out.println("Salario: $" + calcularSalario());
    }
}

    

