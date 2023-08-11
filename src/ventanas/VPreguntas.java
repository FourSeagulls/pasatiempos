// @author Fourseagulls
package ventanas;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;


public class VPreguntas implements ActionListener{
    //DECLARACION DE COMPONENTES
//tablero de pestañas (JTabbedPane)
    JTabbedPane tablero = new JTabbedPane();
    
    //componentes pestaña 1
    JPanel pan_1 = new JPanel();
    JLabel pan_1Preg_0 = new JLabel();
    JTextField pan_1Resp_0 = new JTextField(20);
    JLabel pan_1Preg_1 = new JLabel();
    JTextField pan_1Resp_1 = new JTextField(20);
    JButton botonPan_1 = new JButton();
    
    //componentes pestaña 2
    JPanel pan_2 = new JPanel();
    JLabel pan_2Preg_0 = new JLabel();
    JTextField pan_2Resp_0 = new JTextField(20);
    JLabel pan_2Preg_1 = new JLabel();
    JTextField pan_2Resp_1 = new JTextField(20);
    JButton botonPan_2 = new JButton();
    
    //componentes pestaña 3
    JPanel pan_3 = new JPanel();
    JLabel pan_3Preg_0 = new JLabel();
    JTextField pan_3Resp_0 = new JTextField(20);
    JLabel pan_3Preg_1 = new JLabel();
    JTextField pan_3Resp_1 = new JTextField(20);
    JButton botonPan_3 = new JButton();

    public VPreguntas() {
        //CONSTRUCCIÓN PESTAÑAS
        //pestaña 1 (JPanel)
        pan_1Preg_0.setText("<html><h2>¿Cuantas caras tiene un Icosaedro?</h2>");
        pan_1Preg_1.setText("<html><div align=center><h2>¿Puedes decirme la capital de Marruecos?</h2></div>");
        //alineamos los textos
        pan_1Preg_0.setHorizontalAlignment(0);  //centrado
        pan_1Preg_1.setHorizontalAlignment(0);  //centrado
        botonPan_1.setText("Resuelve");
        //acvcionamos el botón
        botonPan_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                mandaRespuesta_1(evt);
            }
        });
        //pestaña 2 (JPanel)
        pan_2Preg_0.setText("<html><h2>¿Cuantas caras tiene un Dodecaedro?</h2>");
        pan_2Preg_1.setText("<html><div align=center><h2>¿Puedes decirme la capital de Gambia?</h2></div>");
        //alineamos los textos
        pan_2Preg_0.setHorizontalAlignment(0);  //centrado
        pan_2Preg_1.setHorizontalAlignment(0);  //centrado
        botonPan_2.setText("Resuelve");
        botonPan_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                mandaRespuesta_2(evt);
            }
        });
        //pestaña 3 (JPanel)
        pan_3Preg_0.setText("<html><h2>¿Cuantas caras tiene un Cubo?</h2>");
        pan_3Preg_1.setText("<html><div align=center><h2>¿Puedes decirme la capital de Mozambique?</h2></div>");
        //alineamos los textos
        pan_3Preg_0.setHorizontalAlignment(0);  //centrado
        pan_3Preg_1.setHorizontalAlignment(0);  //centrado
        botonPan_3.setText("Resuelve");
        botonPan_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                mandaRespuesta_3(evt);
            }
        });
        
        //DISEÑO PANELES (Layout)        
        //  Diseño Panel 1
        pan_1.setLayout(new GridLayout(5,1));
        pan_1.add(pan_1Preg_0);
        pan_1.add(pan_1Resp_0);
        pan_1.add(pan_1Preg_1);
        pan_1.add(pan_1Resp_1);
        pan_1.add(botonPan_1);
        
        //  Diseño Panel 2
        pan_2.setLayout(new GridLayout(5,1));
        pan_2.add(pan_2Preg_0);
        pan_2.add(pan_2Resp_0);
        pan_2.add(pan_2Preg_1);
        pan_2.add(pan_2Resp_1);
        pan_2.add(botonPan_2);
        
        //  Diseño Panel 3
        pan_3.setLayout(new GridLayout(5,1));
        pan_3.add(pan_3Preg_0);
        pan_3.add(pan_3Resp_0);
        pan_3.add(pan_3Preg_1);
        pan_3.add(pan_3Resp_1);
        pan_3.add(botonPan_3);
        
        //AÑADIMOS PESTAÑAS AL TABLERO
        tablero.add("pestaña 1",pan_1);
        tablero.add("pestaña 2",pan_2);
        tablero.add("pestañe 3", pan_3);
        
        //ACTIVAMOS Y DESACTIVAMOS PESTAÑAS
        tablero.setEnabledAt(1, false);
        tablero.setEnabledAt(2, false);
        
    }
    //GETER Y SETER PARA MANEJAR EL TABLERO
    public JTabbedPane getTablero() {
        return tablero;
    }

    public void setTablero(JTabbedPane tablero) {
        this.tablero = tablero;
    }
    
    public static void main(String[]args){
        //CREAMOS LA VENTANA
        JFrame ventana = new JFrame("Preguntas diversas");
        ventana.getContentPane();

        ventana.setSize(400, 300);
        ventana.setLocationRelativeTo(ventana);
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventana.setVisible(true);
        
        //INTRODUCIMOS NUESTRA CLASE EN LA VENTANA
        VPreguntas vPreguntas = new VPreguntas();
        ventana.add(vPreguntas.getTablero());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    //MÉTODOS DE LOS BOTONES DE RESPUESTA
    public void mandaRespuesta_1(ActionEvent evt){
        //almacenamos respuestas en variable
        String respuesta_1_0=pan_1Resp_0.getText();
        String respuesta_1_1=pan_1Resp_1.getText();
        //verificamos veracidad
        if("20".equals(respuesta_1_0)){
            JOptionPane.showMessageDialog(null, "<html><h2>Has acertado la pregunta primera</h2>");
            puntuacion+=1;  //sumamos punto
        }else{
            JOptionPane.showMessageDialog(null, "<html><h2>Lo siento un Icosaedro tiene 20 caras</h2>");
        }
        if("Maputo".equals(respuesta_1_1)){
            JOptionPane.showMessageDialog(null, "<html><h2>Has acertado la pregunta segunda</h2>");
            puntuacion+=1;  //sumamos punto
        }else{
            JOptionPane.showMessageDialog(null, "<html><h2>Lo siento la capital de Mozambique es Maputo</h2>");
        }
        JOptionPane.showMessageDialog(null, "<html><h2>Tablero 1 completado<br>Tienes: "+puntuacion+" puntos</h2>");
        tablero.setSelectedIndex(1);
        tablero.setEnabledAt(1, true);
    }
    public void mandaRespuesta_2(ActionEvent evt){
        JOptionPane.showMessageDialog(null, "Tablero 2 completado");
        tablero.setSelectedIndex(2);
        tablero.setEnabledAt(2, true);
    }
    public void mandaRespuesta_3(ActionEvent evt){
        JOptionPane.showMessageDialog(null, "Tablero 3 completado");
        tablero.setSelectedIndex(2);
        //tablero.setEnabledAt(1, true);
    }
    
    int puntuacion;

}
