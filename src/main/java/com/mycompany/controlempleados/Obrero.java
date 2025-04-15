/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controlempleados;


    // Obrero.java
public class Obrero extends Empleado {
    private String dependencia;
    private String telefono;

    public Obrero(String codigo, String nombres, String apellidos, String direccion, double sueldoBasico, String dependencia, String telefono) {
        super(codigo, nombres, apellidos, direccion, sueldoBasico);
        this.dependencia = dependencia;
        this.telefono = telefono;
    }

    public double calcularSalario() {
        double bono = sueldoBasico * 0.10;
        return sueldoBasico + bono;
    }

    public void mostrarDatos() {
        System.out.println("Obrero:");
        System.out.println("Código: " + codigo);
        System.out.println("Nombres: " + nombres + " " + apellidos);
        System.out.println("Dirección: " + direccion);
        System.out.println("Dependencia: " + dependencia);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Salario: $" + calcularSalario());
    }
}

    

