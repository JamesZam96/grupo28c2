package view;

import javax.swing.JFrame;

import controller.Controlador;

import java.awt.BorderLayout;

public class Interfaz extends JFrame{

    private PanelDeOpciones panelOpciones;
    private Controlador control;
    private PanelOwners panelOwners;

    public Interfaz() {
        super();
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setTitle("Wallet");


        //inicializar
        panelOpciones = new PanelDeOpciones(this);
        control  = new Controlador();
        panelOwners = new PanelOwners(this);

        //modificar las propiedades

        //agregar
        add(panelOpciones, BorderLayout.SOUTH);
        add(panelOwners,BorderLayout.CENTER);
    }

    public boolean addOwner(String nombre) {
        return control.addOwner(nombre);
    }

    public String listarOwners(){
        return control.listarOwners();
    }
    
    public void updateList() {
        panelOwners.updateList(control.getDataOwners());;
        
    }
public static void main(String[] args) {
    Interfaz inter = new Interfaz();
    inter.setVisible(true);

}
}

