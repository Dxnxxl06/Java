package com.daniel.game.ahorcado;

import java.util.Random;
import java.util.Scanner;

public class Ahorcado {
    String palabraSecreta, palabraTablero;
    String[] palabras;
    int intentos;
    int errores;

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
            intentos = 0;

    }
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
    //Ejecutar
    public void ejecutar (Scanner scan) {
        
        while (true) {
            System.out.println(mensaje());
            var letra = scan.next();
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
                System.out.println("Ahhhh Error");
                System.out.println("Ta' maaaaaal");
            }
            break;
        }
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