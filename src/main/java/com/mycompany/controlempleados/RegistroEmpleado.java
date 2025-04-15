/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controlempleados;

/**
 *
 * @author COTAYA
 */
    // NodoEmpleado.java
public class RegistroEmpleado {
    Empleado empleado;
    RegistroEmpleado siguiente;

    public RegistroEmpleado(Empleado empleado) {
        this.empleado = empleado;
        this.siguiente = null;
    }
}

    

