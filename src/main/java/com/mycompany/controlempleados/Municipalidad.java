/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controlempleados;

// Municipalidad.java
public class Municipalidad {
    private RegistroEmpleado primero;

    public Municipalidad() {
        primero = null;
    }

    public void agregarEmpleado(Empleado emp) {
        RegistroEmpleado nuevo = new RegistroEmpleado(emp);
        if (primero == null) {
            primero = nuevo;
        } else {
            RegistroEmpleado temp = primero;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
        }
    }

    public void buscarEmpleado(String codigo) {
        RegistroEmpleado temp = primero;
        while (temp != null) {
            if (temp.empleado.getCodigo().equals(codigo)) {
                temp.empleado.mostrarDatos();
                return;
            }
            temp = temp.siguiente;
        }
        System.out.println("Empleado no encontrado.");
    }

    public void totalPagar() {
        double total = 0;
        RegistroEmpleado temp = primero;
        while (temp != null) {
            total += temp.empleado.calcularSalario();
            temp = temp.siguiente;
        }
        System.out.println("Total a pagar en salarios: $" + total);
    }
}

