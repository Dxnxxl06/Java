package com.daniel.game.ahorcado;

import java.util.Random;
import java.util.Scanner;

public class Ahorcado {
    private String palabraSecreta, palabraTablero; // Palabra secreta a adivinar
    private String[] palabras; // Array de palabres posibles
    public String[] palabrasAdivinadas; // Array de palabras adivinadas
    public int intentos; // NUmero de intentos
    private int errores; // Numero de errores
    public String[] palabrasUsadas; // Array de palabras usadas

    public Ahorcado(){
        palabras = new String[]{
            "programacion",
            "java",
            "computadora",
            "teclado",
            "internet",
            "variable",
            "funcion",
            "objeto",
            "clase",
            "constructor",
            "compilador",
            "algoritmo",
            "desarrollador",
            "interfaz",
            "depuracion"
        };
        //Aqui
            palabraTablero = "";
            errores = 0;
            intentos = 5;
            palabrasUsadas = new String[0-27];

    }


    public int verErrores(){
        return errores;
    }
    //Iniciar
    public void iniciar(){
        var r = new Random();

        palabraSecreta = palabras[r.nextInt(palabras.length)]; //INTERFAZ
        palabraTablero = "";
        var flag = "_ ";
        for (int i = 0; i < palabraSecreta.length(); i++){ 
            palabraTablero += flag; //   _
    }
    System.out.println(palabraSecreta + "\n"+ palabraTablero);
    }
     //Mismo iniciar pero el string va a  ser con carcacter
    public void iniciar(String caracter){
        var r = new Random();

        palabraSecreta = palabras[r.nextInt(palabras.length)]; //INTERFAZ
        palabraTablero = "";
        var flag = "x ";
        for (int i = 0; i < palabraSecreta.length(); i++){ 
            palabraTablero += flag; //   _
    }
    System.out.println(palabraSecreta + "\n"+ palabraTablero);
    }

    //Ejecutar
    public void ejecutar (Scanner scan) {
        
        while (true) {
            System.out.println(mensaje());
            var letra = scan.next();
            var guardarLetra = x;
            if(palabraSecreta.contains(letra)){
                for(int i =0; i < palabraSecreta.length(); i++){
                    if(String.valueOf(palabraSecreta.charAt(i)) == letra){
                        // _ _ _ _ _ _ _ _ _ _
                        //0123456789
                        var letras = palabraTablero.replace(" ", "").toCharArray();
                        letras[i] = letra.charAt(0); // _a__a_
                        palabraSecreta = ""; // 
                        for(char c : letras){
                            palabraSecreta += String.valueOf(c) + " ";
                        } 
                    }
                }
            }else {
                
                errores++;
                if(validacionGameOver()){
                    System.out.println("Game over");
                    break;
                } 
                System.out.println("Ahhhh Error");
                System.out.println("Ta' maaaaaal");
                

            }
            break;
        }
    }

    private boolean validacionGameOver(){
        return errores >= intentos;
    }

    private boolean validarJuego() {
        return palabraTablero.replace(" ", "").equals(palabraSecreta);
    }

    public String mensaje() {
        StringBuilder strBuild = new StringBuilder();
        strBuild.append("***Ahorcado***\n");
        strBuild.append("Intentos restantes:");
        strBuild.append(intentos);
        strBuild.append("\nErrores");
        strBuild.append("\nPalabra:");
        return strBuild.toString();
    }
}