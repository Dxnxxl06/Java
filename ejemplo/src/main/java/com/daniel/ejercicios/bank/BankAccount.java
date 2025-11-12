package com.daniel.ejercicios.bank;

public class BankAccount {
    private double balance;
    final double AMOUNT_MAX = 10000000;
    final double AMOUNT_MIN = 5000;

    public void deposit(double ammount) {
        if (ammount <= 0){
            System.out.println("Los valores negativos o ceros no estan permitidos para esta transaccion");
            return;
        }
        if (ammount < AMOUNT_MIN){
            System.out.println("El valor minimo para una transaccion es de: " + AMOUNT_MIN);
            return;
        } 
        if(ammount >= AMOUNT_MAX){
            System.out.println("El valor excede el maximo permitido para una sola transaccion");
            return;
        }
        
        balance += ammount;
    }

    
    public void withdraw(double ammount) {
        // Validar que no permita valores negativos, debe tener un minimo de retiro y validar que el monto sea multiplo de 5, 10, 20, 50
        if (ammount <= 0){
            System.out.println("No se permiten retiros de valores negativos o ceros");
            return;
        } else if (ammount > balance ){
            System.out.println("Tus fondos son insuficientes para retirar esa cantidad");
            return;
        } else if (ammount % 5000 != 0 ){
            System.out.println("El monto que estas intentando retirar no es multiplo de 5, 10, 20 o 50 \n Errrrrrrrrrrorrr");
            return;
        }  
        balance -= ammount;
        System.out.println("Retiro exitoso: $" + ammount);
        System.out.println("Saldo restante:" + balance);   
    }

    public void balance(double ammount) {
        System.out.println("\n Su salde es de: "  + balance);   
        return;
    }

    
}


