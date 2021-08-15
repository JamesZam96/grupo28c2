package view;

import model.Wallet;

public class Vista {
    
    public static void main(String[] args) {
        Wallet wallet1 = new Wallet(true);
        Wallet wallet2 = new Wallet(false);
        try {
            System.out.println(wallet1.getSaldo()/0);
        } catch (Exception e) {
            System.out.println("Paso algo raro");
        }

        try {
            String saldo1 = wallet1.putSaldo(60000);
            System.out.println(saldo1);
            // System.out.println(wallet1.getSaldo());
            String saldo2 = wallet2.putSaldo(60000);
            System.out.println(saldo2);
            // System.out.println(wallet2.getSaldo());
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }


        System.out.println(wallet2.retirarSaldo(200));
        wallet2.displayExtractos();
        
        wallet2.generarRegistros();
    }
}
