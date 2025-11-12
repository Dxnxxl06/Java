package com.daniel;

import java.util.Scanner;

// public class Main {



//     public  static final int DIAS_DELA_SEMANA = 7;
//     public static void main(String[] args) { 

//         // //no es primitivo
//         // int numero = (1);
//         // long otroNumero = 100000000L;
//         // boolean verdadero = true;
//         // float decimal = 4.5f;
//         // double decimalPro = 3.1416;
//         // char caracter = 'A';
//         // String saludo = "Hola mundo"; 

//         // System.out.println("Tipos primitivos en Java:");
//         // System.out.println(saludo);
//         // System.out.println(numero);
//         // System.out.println(otroNumero);
//         // System.out.println(verdadero);
//         // System.out.println(decimal);
//         // System.out.println(decimalPro);
//         // System.out.println(caracter);
        
//         // System.out.println("Tipos referencia en Java:");
//         // int [] numeros = {1,2,3,4,5,6,7,8,9,10};

//         // System.out.println(numeros[5]);
//         // System.out.println(numeros[8]);
//         // System.out.println(numeros[1]);
//         // System.out.println(saludo);

//         System.out.println(1+2);
//         System.out.println(1-2);
//         System.out.println(1*2);
//         System.out.println(1/2);
//         System.out.println(5%2);
//         System.out.println(Math.pow( 2 , 5));
         

//         circunferencia(7);
//     }

//     public static double  circunferencia(int diametro) {
//         System.out.println("Circunferencia de un circulo");
//         return 2 * Math.PI * diametro;
        
//     }

//     public static  void actividades(int dia){
//         String [] cosasPorHacer = {"Ir a la iglesaia", "Venir a campus","ir a campus de nuevo",
//             "si fui a campus?", "no volver a campus", "ser feliz", "descansar"};
//             System.out.println("Cosas por hacer el dia ");
//             if(dia >= DIAS_DELA_SEMANA){
//                 System.out.println("No hay actividades para este dia");
//             }
//             else{
//             System.out.println(cosasPorHacer[dia]);
//             System.out.println(dia);
//             }
//     }
// }


// import java.util.Random;
// import java.util.Scanner;


// public class Main {
//     final  static int maxRange = 10000;
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         Random random = new Random(); 
//         //CALCULAR EL MINIMO Y EL MAXIMOO ALEATORIO DE UN ARRAY
//         System.out.println("Ingrese el valor minimo:");
//         var min = scan.nextInt();
//         System.out.println("Ingrese el valor maximo:");
//         var max = scan.nextInt();
//         int[] numbers = new int[maxRange];
//         for(int a=0; a < numbers.length; a++) {
//             numbers[a] = random.nextInt(min, max+1);
//         }
//         System.out.println("Ingrese la cantidad de numeros a buscar:");
//         var counter = scan.nextInt();
//         for(int a=0; a < counter; a++) {
//             System.out.println("Ingrese el inidice a buscar [1 hasta "+maxRange+"]:");
//             var index = scan.nextInt();
//             System.out.println("Oiga el indice es: "+ (index)+"  = " + numbers[index -1]);
//         }
//         scan.close();
//     }
// }


//import  java.util.Scanner;


//import com.daniel.ejercicios.bank.*;


/*public class Main {
    public static void main(String[] args) { //Crea una clase con el atributo privado balance.
        Scanner scanner = new Scanner(System.in); // 
        boolean flag = true;
        var account = new BankAccount();
       
        while (flag){
            System.out.println("""
            **********Menu**********
            1. Consignar
            2. Retirar
            3. Ver saldo
            0. Salir
            
            """);
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Ingrese el monto que quiere consignar:");
                    if (!scanner.hasNextDouble()){
                        System.out.println("Por favor ingrese un valor numerico, no sea como dario");
                        scanner.next();
                    } 
                    break; 
                case 2:
                    System.out.println("Ingrese el monto que quiere retirar:");
                    if (!scanner.hasNextDouble()){
                        System.out.println("Por favor ingrese un valor numerico, no sea como dario");
                        scanner.next();
                    }
                    break;
                case 3:
                    System.out.println("Digite su contrasena para ver su saldo:" );
                    account.balance(0);
                    break;
                case 0:
                    //salir
                    flag = false;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.......\nPresione Enter para continuar");
                    scanner.nextLine();
                    break;  
                    
            }
        }
        scanner.close();
    }
}*/

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println("""
                    *****Menu*****
                    1.Digitar usuraio y contrasena
                    0.Salir
                    """);
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Ingrese su usuario y contrasena");
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    scanner.nextLine();
            }
        }
        scanner.close();
    }
}