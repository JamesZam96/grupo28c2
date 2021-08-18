package view;

import javax.swing.JList;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PanelOwners extends JPanel implements ActionListener{

    private JList listaOwners;
    private Interfaz interfaz;

    public PanelOwners(Interfaz inter) {
        super();
        interfaz = inter;


        String[] datos = {"unos","dos","tres"};
        listaOwners = new JList<>(datos);

        add(listaOwners);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
    
}
