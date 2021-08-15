package view;

import javax.swing.JFrame;
import java.awt.BorderLayout;

public class Interfaz extends JFrame{

    private PanelDeOpciones panelOpciones;
    public Interfaz() {
        super();
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setTitle("Wallet");


        //inicializar
        panelOpciones = new PanelDeOpciones(this);

        //modificar las propiedades

        //agregar
        add(panelOpciones, BorderLayout.SOUTH);
    }


    
public static void main(String[] args) {
    Interfaz inter = new Interfaz();
    inter.setVisible(true);
}
}

