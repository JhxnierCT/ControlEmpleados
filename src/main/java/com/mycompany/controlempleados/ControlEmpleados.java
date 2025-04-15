/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.controlempleados;



import java.util.Scanner;

public class ControlEmpleados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Municipalidad muni = new Municipalidad();

        int opcion;
        do {
            System.out.println("\n----- MENÚ -----");
            System.out.println("1. Ingresar Empleado");
            System.out.println("2. Buscar Empleado por Código");
            System.out.println("3. Total a Pagar en Salarios");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Tipo de empleado (1-Trabajador, 2-Inspector, 3-Obrero, 4-Administrador): ");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Código: ");
                    String cod = sc.nextLine();
                    System.out.print("Nombres: ");
                    String nom = sc.nextLine();
                    System.out.print("Apellidos: ");
                    String ape = sc.nextLine();
                    System.out.print("Dirección: ");
                    String dir = sc.nextLine();
                    System.out.print("Sueldo Básico: ");
                    double sb = sc.nextDouble();
                    sc.nextLine();

                    if (tipo == 1) {
                        System.out.print("Área: ");
                        String area = sc.nextLine();
                        System.out.print("Horas Extras: ");
                        int he = sc.nextInt();
                        sc.nextLine();
                        muni.agregarEmpleado(new Trabajador(cod, nom, ape, dir, sb, area, he));
                    } else if (tipo == 2) {
                        System.out.print("Especialidad: ");
                        String esp = sc.nextLine();
                        System.out.print("Horas Extras: ");
                        int he = sc.nextInt();
                        sc.nextLine();
                        muni.agregarEmpleado(new Inspector(cod, nom, ape, dir, sb, esp, he));
                    } else if (tipo == 3) {
                        System.out.print("Dependencia: ");
                        String dep = sc.nextLine();
                        System.out.print("Teléfono: ");
                        String tel = sc.nextLine();
                        muni.agregarEmpleado(new Obrero(cod, nom, ape, dir, sb, dep, tel));
                    } else if (tipo == 4) {
                        System.out.print("Número Social: ");
                        String ns = sc.nextLine();
                        System.out.print("Horas Extras: ");
                        int he = sc.nextInt();
                        sc.nextLine();
                        muni.agregarEmpleado(new Administrador(cod, nom, ape, dir, sb, ns, he));
                    }
                    break;

                case 2:
                    System.out.print("Ingrese el código del empleado a buscar: ");
                    String codBuscar = sc.nextLine();
                    muni.buscarEmpleado(codBuscar);
                    break;

                case 3:
                    muni.totalPagar();
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);
    }
}
