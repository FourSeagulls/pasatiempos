// @author Fourseagulls
package ventanas;
   
import complementos.BotonSonido;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class VMusical extends JFrame{

    private final JPanel panel;
    private final BotonSonido botonSonido;
    private final BotonSonido botonSonido2;
    private final BotonSonido botonSonido3;
    private final BotonSonido botonSonido4;
    private final JLabel label;
    private final JLabel label1;
    private final JLabel label2;
    
    public VMusical() {
       
        label=new JLabel();
        label.setText("<html><h2>Sigue las reglas para que programa no se cuelgue como tú.");
        label1=new JLabel();
        label1.setText("<html><h2>No dejes el sonido en marcha<br>Aunque ya no lo oigas dale a Pausa.");
        label2=new JLabel();
        label2.setText("<html><h2>Si lo quieres reiniciar dale <b>Doble Click</b>");
        
        botonSonido=new BotonSonido("papiii");
        botonSonido2=new BotonSonido("papiraa");
        botonSonido3=new BotonSonido("pappuppaa");
        botonSonido4=new BotonSonido("tarintantan");
        panel=new JPanel();
        panel.setLayout(new GridLayout(4,3));
        panel.add(botonSonido);
        panel.add(botonSonido2);
        panel.add(botonSonido3);
        panel.add(botonSonido4);
        panel.add(label);
        panel.add(label1);
        panel.add(label2);

        setTitle("Sonido Botón"); 
        setSize(500, 400); 
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        add(panel);
    }


    public static void main(String[] args) {
        new VMusical();
        
    }
}

