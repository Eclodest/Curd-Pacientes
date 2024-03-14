package com.mycompany.gestorpaciente;

import java.util.ArrayList;

public class GestorPaciente {
    public ArrayList<Paciente> Pacientes = new ArrayList<Paciente>();
    private int id = 0;
        
    public void agregarPaciente(Paciente ingresado) {
        ingresado.setId(id++);
        Pacientes.add(ingresado);
    }
    
    public void eliminarPaciente(int id) {
        Paciente pacienteEliminar = null;
        for (Paciente paciente : Pacientes) {
            if (paciente.getId() == id) {
                pacienteEliminar = paciente;
                break;
            }
        }
        if (pacienteEliminar != null) {
            Pacientes.remove(pacienteEliminar);
        }else {
            System.out.println("No se encontro ningun paciente con el ID ingresado.");
        }
    }
    
    public ArrayList<Paciente> listarPacientes() {
        ArrayList<Paciente> pacientesNoBorrados = new ArrayList<Paciente>();
        for (Paciente paciente : Pacientes) {
            if (!paciente.isBorrado()) {
                pacientesNoBorrados.add(paciente);
            }
        }
        return pacientesNoBorrados;
    }
}

