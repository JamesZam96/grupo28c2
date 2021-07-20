package model;

import java.util.ArrayList;

public class Wallet {


    public static final int LIMITE_BILLETERA = 500000;


    //Saldo de la billetera
    private int saldo;
    private boolean tieneLimite;
    private int meta;

    //Lista de transacciones de la wallet
    private ArrayList<Transaction> transactions;

    public Wallet(boolean limite) {
        super();
        saldo = 0;
        tieneLimite = limite;
        meta = 0;
        transactions = new ArrayList<>();
    }


    public int getSaldo(){
        return saldo;
    }


    public String putSaldo(int valor){

        if (saldo+valor>LIMITE_BILLETERA && tieneLimite){
            return "No puede superar el limite";
            }
        saldo += valor;
        Transaction transaction= new Transaction(valor, "hoy", 1);
        transactions.add(transaction);
        if (verificarMeta()){System.out.println("Has superado la meta!");}
        return "Operacion exitosa " + saldo;
    }
    
    public String retirarSaldo(int valor){

        // if (valor > saldo){
        //     return "Saldo insuficiente";
        // }

        if (valor > saldo){
            int saldoTemp = saldo;
            saldo = 0;
            return "Solo se retiro: " + saldoTemp;
        }
        saldo -= valor;
        Transaction transaction= new Transaction(valor, "hoy", 2);
        transactions.add(transaction);
        return "Retiro exitoso, su saldo es: " + saldo;
    }

    public String definirMeta(int valor){

        if (valor == 0){
            meta = valor;
            return "Nueva meta agregada!";
        }
        if (valor>LIMITE_BILLETERA && tieneLimite){
            return "No puedes establecer una meta mas alta que el limite";
        }
        if (valor < 0){
            return "Valor ingresado no valido";
        }
        if (valor <= saldo){
            return "Ya has superado este valor";
        }
        meta = valor;
        return "Nueva meta agregada!";
    }

    public boolean verificarMeta(){
        if (saldo >= meta && meta > 0){
            return true;
        }
        return false;
    }

    public String breakLimite(){
        if (!tieneLimite){
            return "Error. Su cuenta es sin limites";
        }

        if (saldo < 10000){
            return "Error. Romper el limite tiene un costo de 10000, usted tiene: "+saldo;
        }
        saldo-=10000;
        tieneLimite = false;
        return "Operacion exitosa. Su cuenta es ahora sin limites, nuevo saldo: "+saldo;
    }

    public String compararBilleteras(Wallet otraWallet){
        if (saldo > otraWallet.getSaldo()){
            return "Tienes mas saldo!";
        }

        else if (saldo == otraWallet.getSaldo()){
            return "Ambos saldos son iguales";
        }else {
            return "Tienes menos saldo :(";
        }

    }


    public void displayExtractos(){
        for (Transaction transaction:transactions){
            System.out.println(transaction);
        }
    }
}
