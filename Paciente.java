package com.mycompany.gestorpaciente;


public class Paciente {
    
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private int telefono;
    private String correoElectronico;
    private int sistolica;
    private int diastolica;
    private String riesgoCardiopatia = "Indeterminado";
    
    public Paciente ( String nombre, String apellido, int telefono, String correoElectronico, int edad, int sistolica, int diastolica) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.sistolica = sistolica;
        this.diastolica = diastolica;
        calcularRiesgo();
    }
                
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return this.id;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public int getTelefono(){
        return telefono;
    }
    public void setTelefono(int numero) {
        this.telefono = numero;
    }
     public String setCorreoElectronico(){
        return correoElectronico;
    }
    public void setCorreoElectronico(String correoElectronico){
        this.correoElectronico = correoElectronico;
    }
    public boolean isBorrado() {
        return false;
    }

    public void calcularRiesgo() {
        if (edad < 45) {
            calcularRiesgoPocaEdad();
        } else if (edad < 65) {
            calcularRiesgoMediaEdad();
        } else {
            calcularRiesgoMuchaEdad();
        }
    }

    public void calcularRiesgoPocaEdad() {
        if (sistolica < 130 && diastolica < 85) {
            this.riesgoCardiopatia = "Bajo";
        } else if (sistolica < 139 && diastolica >= 85) {
            this.riesgoCardiopatia = "Medio";
        } else if (sistolica >= 140 && diastolica > 90) {
            this.riesgoCardiopatia = "Alto";
        }
    }

    public void calcularRiesgoMediaEdad() {
        if (sistolica < 130 && diastolica < 85) {
            this.riesgoCardiopatia = "Bajo";
        } else if (sistolica < 159 && diastolica >= 99) {
            this.riesgoCardiopatia = "Medio";
        } else if (sistolica >= 160 && diastolica >= 100) {
            this.riesgoCardiopatia = "Alto";
        }
    }

    public void calcularRiesgoMuchaEdad() {
        if (sistolica < 130 && diastolica < 85) {
            this.riesgoCardiopatia = "Bajo";
        } else if (sistolica < 139 && diastolica >= 89) {
            this.riesgoCardiopatia = "Medio";
        } else if (sistolica >= 140 && diastolica >= 90) {
            this.riesgoCardiopatia = "Alto";
        }
    }
    public String toStr() {
        return String.format("%-2d %-7s %-7s %-5s %-10s %-10s %-10s %-10s %-10s",id, nombre,apellido,telefono,correoElectronico, edad, sistolica, diastolica, riesgoCardiopatia);
    }    
}