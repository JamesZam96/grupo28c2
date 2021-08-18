package view;

import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PanelOwners extends JPanel implements ActionListener{

    private JList<String> listaOwners;
    private Interfaz interfaz;

    public PanelOwners(Interfaz inter) {
        super();
        setLayout(new GridLayout());
        setBorder(new TitledBorder("Clientes"));
        interfaz = inter;


        // String[] datos = {"unos","dos","tres"};
        listaOwners = new JList<>();

        add(listaOwners);
    }

    public void updateList(String[] nombres){
        listaOwners.setListData(nombres);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
    
}
