package com.daniel;

public class Main {

    public static void main(String[] args) {

        Condicionales instancia = new Condicionales();
        instancia.esPar(
            
        );
        int resultado = instancia.logitudeDeText("Lorem ipsum asdkajssshhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhdddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddigbhquleccccccccccccbiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiqqbeciddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjsdcbnmkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkbsakjdcdbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbblllllllllllllllllkasdcbjjjjjjjjjjjjjjksddddddddddddddddddddddddddddddddjksdhfkjshsdjkfh");
        //Static - Para operaciones y no almacenan valores
        Condicionales.diaSemana(4);
        System.out.println("Que muestra? "+ resultado);
        System.out.println(instancia.mayor(0, 0, 0));
        System.out.println(instancia.mayor(-11, -9, -1));
        System.out.println(instancia.mayor(100, 10, 2));
        System.out.println(instancia.mayor(100, 10, 200));
    }
}

/**System.out.println(1+2);
        System.out.println(1-2);
        System.out.println(1*2);
        System.out.println(1/2);
        System.out.println(10%2);
        actividades(2);

        System.out.println(Math.pow(2,5));

        var resultado = circunferencia(30);
        System.out.println(resultado);
        //int dia = 5;
        //actividades(dia);
        //actividades(++dia);
        //actividades(dia++);
        //actividades(dia);

        //int numero = 100;
        //long otroNumero = 10L;
        //Boolean bandera = true;
        //Float decimal = 0.5F;
        //double decimalPro = 0.5;
        //char caracter = 'A';
        //String saludo = "Hello world!";

        //System.out.println("Tipos Primitivos"); //No es primitivo
        //System.out.println(numero);
        //System.out.println(otroNumero);
        //System.out.println(bandera);
        //System.out.println(decimal); //Float
        //System.out.println(decimalPro);  System.out.println(caracter);
        //int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //System.out.println(numeros[0]);
        //System.out.println(numeros[1]);
        //System.out.println(numeros[2]);
        //System.out.println(numeros[3]);
        //System.out.println(saludo); // NO es primitivo es de referencia
        }

        public static double circunferencia(int diametro) {
            System.out.println("Circunferencia");
            return 2 * Math.PI * diametro;
        }

        public static void actividades(int dia) {
            String[] cosasPorHacer = {"Ir a la iglesia", "Ir a campus", "Ir a campus", "Ir a campus", "Ir a campus", "Ir por ultima vez a campus", "Ser feliz"};
            System.out.println("Que nos toca hacer Hoy!");
            if (dia >= 7) {
                System.out.println("Bye!");
            } else {
                System.out.println(cosasPorHacer[dia]);
                System.out.println(dia);
            }
            System.out.println(cosasPorHacer[dia]);
            System.out.println(dia);
        **/