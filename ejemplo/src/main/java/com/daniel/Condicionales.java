package com.daniel;

public class Condicionales {
    //1. Crea una funcion que diga si un numero es par o no
    int input = 2;

    public void esPar() {
        if(input % 2 == 0) {
            //Par
            System.out.println("Es par");
        } else {
            //Parn't
            System.out.println("No es par");
        }
    }

    //Declara una variable con el dia de la semana (1-7) y
    // muestra su nombre con switch
    public static void diaSemana(int dia) {
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default: 
                System.out.println("Sabado");
                break;
        }
    }

    // Muestra longitud de cadena de texto
    public int logitudeDeText(String cadena) {
        return cadena.length();
    }
    // Elimina espaciado de inicio y fin de un string
    public String cadenaFormateada(String cadena) {
        var valor = cadena.trim();
        
        //System.out.println(cadena);
        return valor;
    }

    public int mayor(int a, int b, int c) {
        if(a > b && b > c) {
            return a;
        } else if(b>a && b>c) {
            return b;
        }
        return c;
    }
}

