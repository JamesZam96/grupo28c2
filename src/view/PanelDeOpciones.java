package view;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

public class PanelDeOpciones extends JPanel implements ActionListener{

    //constantes
    public static final String BTN_SALDO = "Ver saldo";
    public static final String BTN_CARGAR = "Cargar saldo";
    public static final String BTN_AGREGAR = "Agregar cliente";
    public static final String BTN_LISTAR = "Listar clientes";

    // atributos o relacion
    private JButton btnSaldo;
    private JButton btnCargar;
    private JButton btnAgregar;
    private JButton btnListar;

    //Interfaz
    private Interfaz interfaz;

    public PanelDeOpciones(Interfaz inter) {
        
        super();
        interfaz = inter;
        setLayout(new GridLayout(1,3));
        setBorder(new TitledBorder("Opciones"));

        //se inicializan    
        btnSaldo = new JButton(BTN_SALDO);
        btnCargar = new JButton(BTN_CARGAR);
        btnAgregar = new JButton(BTN_AGREGAR);
        btnListar = new JButton(BTN_LISTAR);

        //se modifican las propiedades (opcional)
        btnSaldo.setActionCommand(BTN_SALDO);
        btnCargar.setActionCommand(BTN_CARGAR);
        btnAgregar.setActionCommand(BTN_AGREGAR);
        btnListar.setActionCommand(BTN_LISTAR);

        btnCargar.addActionListener(this);
        btnSaldo.addActionListener(this);
        btnAgregar.addActionListener(this);
        btnListar.addActionListener(this);

        //se agregan
        add(btnSaldo);
        add(btnCargar);
        add(btnAgregar);
        add(btnListar);
    }

    public void agregarCliente() {
        String nombre = JOptionPane.showInputDialog("Digite el nombre del cliente");
            if (nombre != null && !nombre.trim().equalsIgnoreCase("")){
                if (interfaz.addOwner(nombre)){
                    JOptionPane.showMessageDialog(interfaz, "Se agrego el usuario");
                    interfaz.updateList();
                }
                else{
                    JOptionPane.showMessageDialog(interfaz, "No se pudo agregar el usuario");
                }
            }
            else{
                    JOptionPane.showMessageDialog(interfaz, "Revisa los datos");
            }
    }

    public void listarOwners(){
        JOptionPane.showMessageDialog(interfaz, interfaz.listarOwners(), "Listado de clientes", JOptionPane.PLAIN_MESSAGE);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getActionCommand().equals(BTN_SALDO)){
            JOptionPane.showMessageDialog(interfaz, "El saldo es:", "Tu saldo", JOptionPane.INFORMATION_MESSAGE);
            // System.out.println("el saldo");
        }
        else if (e.getActionCommand().equals(BTN_CARGAR)){
            System.out.println("cargar");
        }
        else if (e.getActionCommand().equals(btnAgregar.getActionCommand())){
            agregarCliente();
        }
        else if (e.getActionCommand().equals(BTN_LISTAR)){
            listarOwners();
        }
    }

    

}
