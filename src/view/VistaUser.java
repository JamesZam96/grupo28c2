package view;

import model.Company;
import model.Owner;

public class VistaUser {
    
    public static void main(String[] args) {
        Owner owner1 = new Owner("Susen");
        Owner owner2 = new Owner("Luisa");

        System.out.println(owner1.getNombre());
        System.out.println(owner2.getNombre());
        owner1.getWallet().putSaldo(3000000);

        Company empresa = new Company("Nestle");
        String response = empresa.myWallet().putSaldo(10000000);
        System.out.println(response);
    }
}
