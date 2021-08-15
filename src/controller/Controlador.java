package controller;
import model.Owner;

import java.util.ArrayList;




;public class Controlador {
    private ArrayList<Owner> owners;
    public Controlador() {
        super();
        owners = new ArrayList<>(); 
    }

    public ArrayList<Owner> getOwners() {
        return owners;
    }

    public boolean addOwner(String nombre) {
        if (nombre == null || nombre.equalsIgnoreCase("")){
            return false;
        }
        Owner cliente = new Owner(nombre);
        owners.add(cliente);
        return true;
    }
}
