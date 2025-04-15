/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controlempleados;


    // Trabajador.java
public class Trabajador extends Empleado {
    private String area;
    private int horasExtras;

    public Trabajador(String codigo, String nombres, String apellidos, String direccion, double sueldoBasico, String area, int horasExtras) {
        super(codigo, nombres, apellidos, direccion, sueldoBasico);
        this.area = area;
        this.horasExtras = horasExtras;
    }

    public double calcularSalario() {
        double bono = sueldoBasico * 0.20;
        return sueldoBasico + bono + (horasExtras * 10);
    }

    public void mostrarDatos() {
        System.out.println("Trabajador:");
        System.out.println("Código: " + codigo);
        System.out.println("Nombres: " + nombres + " " + apellidos);
        System.out.println("Dirección: " + direccion);
        System.out.println("Área: " + area);
        System.out.println("Horas Extras: " + horasExtras);
        System.out.println("Salario: $" + calcularSalario());
    }
}

 
