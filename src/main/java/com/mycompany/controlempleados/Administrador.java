/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controlempleados;


    // Administrador.java
public class Administrador extends Empleado {
    private String numeroSocial;
    private int horasExtras;

    public Administrador(String codigo, String nombres, String apellidos, String direccion, double sueldoBasico, String numeroSocial, int horasExtras) {
        super(codigo, nombres, apellidos, direccion, sueldoBasico);
        this.numeroSocial = numeroSocial;
        this.horasExtras = horasExtras;
    }

    public double calcularSalario() {
        double bono = sueldoBasico * 0.40;
        return sueldoBasico + bono + (horasExtras * 30);
    }

    public void mostrarDatos() {
        System.out.println("Administrador:");
        System.out.println("Código: " + codigo);
        System.out.println("Nombres: " + nombres + " " + apellidos);
        System.out.println("Dirección: " + direccion);
        System.out.println("Número Social: " + numeroSocial);
        System.out.println("Horas Extras: " + horasExtras);
        System.out.println("Salario: $" + calcularSalario());
    }
}

    

