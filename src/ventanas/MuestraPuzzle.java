// @author Fourseagulls
package ventanas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDialog;

public class MuestraPuzzle extends JDialog implements ActionListener{
    JPanel panel;
    JLabel label;
    JLabel label2;
    JButton boton;
    
    public MuestraPuzzle(VentanaPuzzle miVentanaPuzzle, boolean modal){
        super(miVentanaPuzzle, modal);
        this.panel = new JPanel();
        panel.setLayout(new GridLayout(1,2));
        this.label = new JLabel();
        this.label2 = new JLabel();
        this.boton = new JButton();
        
        this.setSize(300, 500);
        this.setLocationRelativeTo(null);
        this.setTitle("Muestra del puzzle");
        this.setUndecorated(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        panel.setBackground(new Color(102,153,255));
        
        label.setIcon(new ImageIcon(getClass().getResource("/img_puzzle/miniPuzzle.png")));
        label2.setText("<html><h2 align=center>Observa la foto<br>"
                + "cierra la ventana<br>"
                + "y completa el puzzle<br>"
                + "¡¡Vamos que nos vamos!!</h2>");
        
                
        boton.setText("¡¡Vamos que nos vamos!!");
        boton.setSize(200, 50);
        boton.setVisible(true);
        boton.addActionListener((ActionEvent evt) ->
        {
            dispose();
        });
        
        add(panel);
        panel.add(label);
        label2.add(boton);
        panel.add(label2);
        // Ajusta el tamaño al de los componentes
        pack();
        
    }   //Fin constructor

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}   // Fin clase
