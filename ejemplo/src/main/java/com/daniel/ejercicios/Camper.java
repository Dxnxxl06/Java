package com.daniel.ejercicios;

public class Camper {
    public String nombre, apellido;
    public int edad;
    public String tipoDocumento, documento;
    public int estratoSocial;
    public String genero;
    public String email, telefono;
    public int nivelIngles;

    public void Camper(String _nombre, String apellido, int edad, String documento, String tipoDocumento, String genero, String email, String telefono) {
        nombre = _nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.tipoDocumento = tipoDocumento;
        this.genero = genero;
        this.email = email;
        this.telefono = telefono;
        estratoSocial = 1;
        nivelIngles = 1;
    }
        
    public void cambiarNombre(String nuevo){
        nombre = nuevo;
    }
    public void domir () {
        System.out.println("Duerme: "+nombre);
    }
    
    public void divertirse () {
        System.out.println("Se divierte el camper: "  +nombre);
    }
    public void estudiar () {
        System.out.println("\"Estudia\""  +nombre);
    }
    public void reportar () {
        System.out.println("REporta a otro: " +nombre);
    }
    public void calificar () {
        System.out.println("Califica: "  +nombre);
    }
    public void asistencia () {
        System.out.println("Pone asistencia: " +nombre);
    }
}
