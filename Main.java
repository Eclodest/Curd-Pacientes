package com.mycompany.gestorpaciente;

import java.util.Scanner;

public class Main {
    static Scanner leer = new Scanner(System.in);
    static GestorPaciente gp = new GestorPaciente();
    
    public static void main(String[] args){
        int opcion;
        
        System.out.println("=================================");
        System.out.println("~GESTOR DE PACIENTES DEL HOPITAL~");
        System.out.println("=================================");
        
        boolean salir = false;
        do {
            menu();
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    ingresarPaciente();
                    break;
                case 2:
                    mostrarPaciente();
                    break;
                case 3:
                    modificarPaciente();
                    break;
                case 4:
                    eliminarPaciente();
                    break;
                case 5:
                    mocearPaciente();
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida...");
                    System.out.println("Vuelva a Empezar");
            }
        }while (!salir);
        System.out.println("Sayonara baby!");
    }
    private static void menu() {
        System.out.println();
        System.out.println();
        System.out.println("===============================");
        System.out.println("-Menu de opciones del hospital-");
        System.out.println("===============================");
        System.out.println("1.- Ingresar nuevo paciente.");
        System.out.println("2.- Mostrar pacientes.");
        System.out.println("3.- Modificar datos de paciente.");
        System.out.println("4.- Eliminar datos de paciente.");
        System.out.println("5.- Mocear pacientes.");
        System.out.println("0.- SALIR");
        System.out.println();
        System.out.print("Seleccione una opcion: ");
    }
    private static void ingresarPaciente() {
        String nombre;
        String apellido;
        int telefono;
        String correoElectronico;
        int edad;
        int sistolica;
        int diastolica;
        String riesgoCardiopatia;
        
        System.out.println("Ingresar datos de Paciente");
        System.out.println("==========================");
        System.out.println();
        System.out.println("Nombre: ");
        nombre = leer.next();
        System.out.println("Apellido: ");
        apellido = leer.next();
        System.out.println("Telefono: ");
        telefono = leer.nextInt();
        System.out.println("Correo: ");
        correoElectronico = leer.next();
        System.out.println("Edad: ");
        edad = leer.nextInt();
        System.out.println("Sistolica: ");
        sistolica = leer.nextInt();
        System.out.println("Diastolica: ");
        diastolica = leer.nextInt();
        
        gp.agregarPaciente(new Paciente( nombre, apellido, telefono, correoElectronico, edad, sistolica, diastolica));
    }
    
     private static void eliminarPaciente() {
        System.out.println("======================================");
        System.out.println("Ingrese el ID del paciente a eliminar: ");
        int idEliminar = leer.nextInt();
        gp.eliminarPaciente(idEliminar);
    }
    private static void mostrarPaciente() {
        cabeceraListarPaciente();
        for (Paciente a : gp.listarPacientes()) {
            System.out.println(a.toStr());
        }
    }  
    private static void cabeceraListarPaciente() {
        System.out.println("         LISTADO DE PACIENTES");
        System.out.println("===============================================================================");
        System.out.println("ID NOMBRE APELLIDO TELEFONO CORREOELECTRONICO EDAD SIASTOLICA DIASTOLICA RIESGO");
        System.out.println("===============================================================================");
    }
    private static void  mocearPaciente() {
        gp.agregarPaciente(new Paciente("Patricio","Quiroga",10123123,"asdfj@gmail.com" ,30, 120,76));
        gp.agregarPaciente(new Paciente("Julio","César",42565463,"3fvdfgj@gmail.com" ,50 , 124, 72));
        gp.agregarPaciente(new Paciente("Santiago","Abascal",54645262,"Abascal777@gmail.com" ,44 ,140,90));
        
        System.out.println("\n3 registros agregados con exito.......!");

    }
    
    private static void modificarPaciente() {
        System.out.println("Elige el indice del paciente a modificar ");
        int indice = leer.nextInt();
        String nombre;
        String apellido;
        int telefono;
        String correoElectronico;
        int edad;
        int sistolica;
        int diastolica;
        
        System.out.println("Ingresar datos de Paciente");
        System.out.println("==========================");
        System.out.println();
        System.out.println("Nombre: ");
        nombre = leer.next();
        gp.Pacientes.get(indice).setNombre(nombre);
        System.out.println("Apellido: ");
        apellido = leer.next();
        gp.Pacientes.get(indice).setApellido(apellido);
        System.out.println("Telefono: ");
        telefono = leer.nextInt();
        gp.Pacientes.get(indice).setTelefono(telefono);
        System.out.println("Alumno modificado correctamente");
    }
}
