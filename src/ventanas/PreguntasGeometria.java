// @author Fourseagulls
package ventanas;
//LIBRERÍAS NECESARIAS
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

//CLASE PRINCIPAL
public class PreguntasGeometria implements ActionListener{
    //DECLARACION DE COMPONENTES
//tablero de pestañas (JTabbedPane)
    private static JTabbedPane tablero = new JTabbedPane(); //static para poder llamarlo desde el main
    
    //COMPONENTES PESTAÑA 1
    JPanel pan_1;
    JLabel pan_1Preg_0;
    JTextField pan_1Resp_0;
    JLabel pan_1Preg_1;
    JTextField pan_1Resp_1;
    JLabel pan_1Preg_2;
    JTextField pan_1Resp_2;
    JLabel pan_1Preg_3;
    JTextField pan_1Resp_3;
    JLabel pan_1Preg_4;
    JTextField pan_1Resp_4;    
    JButton botonPan_1;
    //preguntas y contestaciones CONSTANTES PRIVADAS
    //PREGUNTAS Y RESPUESTAS PANEL 1
    private final String preg_1_0 = "¿Cuántas caras tiene un Icosaedro?";
    private final String solu_1_0 = "20";
    private final String resp_1_0 = "Un Icosaedro tiene<br><b>20</b> caras";
    private final String preg_1_1 = "¿Cuántos vértices tiene un Icosaedro?";
    private final String solu_1_1 = "12";
    private final String resp_1_1 = "Un Icosaedro tiene<br><b>12</b> vértices";
    private final String preg_1_2 = "¿Cuántas aristas?";
    private final String solu_1_2 = "30";
    private final String resp_1_2 = "Un Icosaedro tiene<br> <b>30</b> aristas";
    private final String preg_1_3 = "¿Sabrías decirme a qué elemento pertenece?";
    private final String solu_1_3 = "Agua";
    private final String resp_1_3 = "El elemento que le corresponde es el<br><b>Agua</b>";
    private final String preg_1_4 = "¿Quién creó los sólidos platónicos?";
    private final String solu_1_4 = "Euclides";
    private final String resp_1_4 = "Aunque se llamen sólido platónicos<br>fue <b>Euclides</b>";
    //---------------------------------------------------
    //----------------------------------------------
    
    //COMPONENTES PESTAÑA 2
    JPanel pan_2;   //panel donde se alojarán los JLabel y los TextField
    JLabel pan_2Preg_0;
    JTextField pan_2Resp_0;
    JLabel pan_2Preg_1;
    JTextField pan_2Resp_1;
    JLabel pan_2Preg_2;
    JTextField pan_2Resp_2;
    JLabel pan_2Preg_3;
    JTextField pan_2Resp_3;
    JLabel pan_2Preg_4;
    JTextField pan_2Resp_4;    
    JButton botonPan_2;
    //preguntas y contestaciones CONSTANTES PRIVADAS
    //PREGUNTAS Y RESPUESTAS PANEL 2
    private final String preg_2_0 = "¿Cuántas caras tiene un Dodecaedro?";
    private final String solu_2_0 = "12";
    private final String resp_2_0 = "Un Dodecaedro tiene<br><b>12</b> caras";
    private final String preg_2_1 = "¿Cuántos vértices tiene un Dodecaedro?";
    private final String solu_2_1 = "20";
    private final String resp_2_1 = "Un Dodecaedro tiene<br><b>20</b> vértices";
    private final String preg_2_2 = "¿Cuántas aristas tiene?";
    private final String solu_2_2 = "30";
    private final String resp_2_2 = "Un Dodecaedro tiene<br><b>30</b> aristas";
    private final String preg_2_3 = "¿Sabrías decirme a qué elemento pertenece?";
    private final String solu_2_3 = "Eter";
    private final String resp_2_3 = "El elemento que le corresponde es el<br><b>Éter</b>";
    private final String preg_2_4 = "¿Qué otro sólido se complementa con el Dodecaedro?";
    private final String solu_2_4 = "Icosaedro";
    private final String resp_2_4 = "El <b>Icosaedro</b><br>igual vertices que caras<br>"
            + "e igual caras que vértices.";
    //---------------------------------------------------
    //-------------------------------------------------
    
    //COMPONENTES PESTAÑA 3
    JPanel pan_3;   //paneldonde se alojarán los JLabel y los TextField
    JLabel pan_3Preg_0;
    JTextField pan_3Resp_0;
    JLabel pan_3Preg_1;
    JTextField pan_3Resp_1;
    JLabel pan_3Preg_2;
    JTextField pan_3Resp_2;
    JLabel pan_3Preg_3;
    JTextField pan_3Resp_3;
    JLabel pan_3Preg_4;
    JTextField pan_3Resp_4;    
    JButton botonPan_3;
    //preguntas y contestaciones CONSTANTES PRIVADAS
    //PREGUNTAS Y RESPUESTAS PANEL 3
    private final String preg_3_0 = "¿Cuántas caras tiene un Tetraedro?";
    private final String solu_3_0 = "4";
    private final String resp_3_0 = "Un Tetraedro tiene<br><b>4</b> caras";
    private final String preg_3_1 = "¿Cuántos vértices tiene un Tetraedro?";
    private final String solu_3_1 = "4";
    private final String resp_3_1 = "Un Tetraedro tiene<br><b>4</b> vértices";
    private final String preg_3_2 = "¿Cuántas aristas tiene?";
    private final String solu_3_2 = "6";
    private final String resp_3_2 = "Un Tetraedro tiene<br><b>6</b> aristas";
    private final String preg_3_3 = "¿Sabrías decirme a qué elemento pertenece?";
    private final String solu_3_3 = "Fuego";
    private final String resp_3_3 = "El elemento que le corresponde es el<br><b>Fuego</b>";
    private final String preg_3_4 = "¿Cómo se llama la figura formada<br>con dos Tetraedros entrecruzados?";
    private final String solu_3_4 = "Merkabah";
    private final String resp_3_4 = "El <b>Merkabah</b><br>¡¡Elvehículo definitivo!!";
    //---------------------------------------------------
    //--------------------------------------------------
    
    //COMPONENTES PESTAÑA DE CIERRE
    JPanel pan_cierre;
    JLabel conclusion;

    //CONSTRUCTOR
    public PreguntasGeometria() {
        //CONSTRUCTOR PANEL 1
        //inicializamos componentes panel 1 (pestaña 1)
        this.pan_1 = new JPanel();
        this.pan_1Preg_0 = new JLabel();
        this.pan_1Resp_0 = new JTextField(20);
        this.pan_1Preg_1 = new JLabel();
        this.pan_1Resp_1 = new JTextField(20);
        this.pan_1Preg_2 = new JLabel();
        this.pan_1Resp_2 = new JTextField(20);
        this.pan_1Preg_3 = new JLabel();
        this.pan_1Resp_3 = new JTextField(20);
        this.pan_1Preg_4 = new JLabel();
        this.pan_1Resp_4 = new JTextField(20);
        this.botonPan_1 = new JButton("RESUELVE");
        
        //COLOCAMOS las preguntas en panel 1
        pan_1Preg_0.setText("<html><div align=center><h2>"+preg_1_0+"</h2></div>");
        pan_1Preg_1.setText("<html><div align=center><h2>"+preg_1_1+"</h2></div>");
        pan_1Preg_2.setText("<html><div align=center><h2>"+preg_1_2+"</h2></div>");
        pan_1Preg_3.setText("<html><div align=center><h2>"+preg_1_3+"</h2></div>");
        pan_1Preg_4.setText("<html><div align=center><h2>"+preg_1_4+"</h2></div>");
        
        //ALINEACIÓN de los textos del panel 1
        pan_1Preg_0.setHorizontalAlignment(0);  //centrado
        pan_1Preg_1.setHorizontalAlignment(0);  //centrado
        pan_1Preg_2.setHorizontalAlignment(0);  //centrado
        pan_1Preg_3.setHorizontalAlignment(0);  //centrado
        pan_1Preg_4.setHorizontalAlignment(0);  //centrado
        
        //  DECLARAMOS el Panel 1 como LAYOUT (GridLayout)
        pan_1.setLayout(new GridLayout(11,1));
        //AGREGAMOS LOS COMPONENTES AL PANEL 1
        pan_1.add(pan_1Preg_0);
        pan_1.add(pan_1Resp_0);
        pan_1.add(pan_1Preg_1);
        pan_1.add(pan_1Resp_1);
        pan_1.add(pan_1Preg_2);
        pan_1.add(pan_1Resp_2);
        pan_1.add(pan_1Preg_3);
        pan_1.add(pan_1Resp_3);
        pan_1.add(pan_1Preg_4);
        pan_1.add(pan_1Resp_4);
        
        //añadimos botón 1
        pan_1.add(botonPan_1);
        
        //accionamos el botón 1
        botonPan_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                mandaRespuesta_1(evt);
            }
        });
        //---------------------------------------------
        //---------------------------------------------
        
        //CONSTRUCTOR PANEL 2
        //inicializamos componentes panel 2 (pestaña 2)
        this.pan_2 = new JPanel();
        this.pan_2Preg_0 = new JLabel();
        this.pan_2Resp_0 = new JTextField(20);
        this.pan_2Preg_1 = new JLabel();
        this.pan_2Resp_1 = new JTextField(20);
        this.pan_2Preg_2 = new JLabel();
        this.pan_2Resp_2 = new JTextField(20);
        this.pan_2Preg_3 = new JLabel();
        this.pan_2Resp_3 = new JTextField(20);
        this.pan_2Preg_4 = new JLabel();
        this.pan_2Resp_4 = new JTextField(20);
        this.botonPan_2 = new JButton("RESUELVE");
        
        //COLOCAMOS las preguntas en panel 2
        pan_2Preg_0.setText("<html><div align=center><h2>"+preg_2_0+"</h2></div>");
        pan_2Preg_1.setText("<html><div align=center><h2>"+preg_2_1+"</h2></div>");
        pan_2Preg_2.setText("<html><div align=center><h2>"+preg_2_2+"</h2></div>");
        pan_2Preg_3.setText("<html><div align=center><h2>"+preg_2_3+"</h2></div>");
        pan_2Preg_4.setText("<html><div align=center><h2>"+preg_2_4+"</h2></div>");
        
        //ALINEACIÓN de los textos del panel 2
        pan_2Preg_0.setHorizontalAlignment(0);  //centrado
        pan_2Preg_1.setHorizontalAlignment(0);  //centrado
        pan_2Preg_2.setHorizontalAlignment(0);  //centrado
        pan_2Preg_3.setHorizontalAlignment(0);  //centrado
        pan_2Preg_4.setHorizontalAlignment(0);  //centrado
        
        //  DECLARAMOS el Panel 2 como LAYOUT (GridLayout)
        pan_2.setLayout(new GridLayout(11,1));
        //AGREGAMOS LOS COMPONENTES AL PANEL 1
        pan_2.add(pan_2Preg_0);
        pan_2.add(pan_2Resp_0);
        pan_2.add(pan_2Preg_1);
        pan_2.add(pan_2Resp_1);
        pan_2.add(pan_2Preg_2);
        pan_2.add(pan_2Resp_2);
        pan_2.add(pan_2Preg_3);
        pan_2.add(pan_2Resp_3);
        pan_2.add(pan_2Preg_4);
        pan_2.add(pan_2Resp_4);
        
        //añadimos botón 2
        pan_2.add(botonPan_2);
        
        //accionamos el botón 2
        botonPan_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                mandaRespuesta_2(evt);
            }
        });
        //---------------------------------------------
        //---------------------------------------------
        
        //CONSTRUCTOR PANEL 3
        //inicializamos componentes panel 3 (pestaña 3)
        this.pan_3 = new JPanel();
        this.pan_3Preg_0 = new JLabel();
        this.pan_3Resp_0 = new JTextField(20);
        this.pan_3Preg_1 = new JLabel();
        this.pan_3Resp_1 = new JTextField(20);
        this.pan_3Preg_2 = new JLabel();
        this.pan_3Resp_2 = new JTextField(20);
        this.pan_3Preg_3 = new JLabel();
        this.pan_3Resp_3 = new JTextField(20);
        this.pan_3Preg_4 = new JLabel();
        this.pan_3Resp_4 = new JTextField(20);
        this.botonPan_3 = new JButton("RESUELVE");
        
        //COLOCAMOS las preguntas en panel 3
        pan_3Preg_0.setText("<html><div align=center><h2>"+preg_3_0+"</h2></div>");
        pan_3Preg_1.setText("<html><div align=center><h2>"+preg_3_1+"</h2></div>");
        pan_3Preg_2.setText("<html><div align=center><h2>"+preg_3_2+"</h2></div>");
        pan_3Preg_3.setText("<html><div align=center><h2>"+preg_3_3+"</h2></div>");
        pan_3Preg_4.setText("<html><div align=center><h2>"+preg_3_4+"</h2></div>");
        
        //ALINEACIÓN de los textos del panel 3
        pan_3Preg_0.setHorizontalAlignment(0);  //centrado
        pan_3Preg_1.setHorizontalAlignment(0);  //centrado
        pan_3Preg_2.setHorizontalAlignment(0);  //centrado
        pan_3Preg_3.setHorizontalAlignment(0);  //centrado
        pan_3Preg_4.setHorizontalAlignment(0);  //centrado
        
        //  DECLARAMOS el Panel 3 como LAYOUT (GridLayout)
        pan_3.setLayout(new GridLayout(11,1));
        //AGREGAMOS LOS COMPONENTES AL PANEL 1
        pan_3.add(pan_3Preg_0);
        pan_3.add(pan_3Resp_0);
        pan_3.add(pan_3Preg_1);
        pan_3.add(pan_3Resp_1);
        pan_3.add(pan_3Preg_2);
        pan_3.add(pan_3Resp_2);
        pan_3.add(pan_3Preg_3);
        pan_3.add(pan_3Resp_3);
        pan_3.add(pan_3Preg_4);
        pan_3.add(pan_3Resp_4);
        
        //añadimos botón 3
        pan_3.add(botonPan_3);
        
        //accionamos el botón 3
        botonPan_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                mandaRespuesta_3(evt);
            }
        });
        //---------------------------------------------
        //---------------------------------------------
        
        //CONSTRUCTOR PANEL CIERRE
        //inicializamos componentes panel cierre (pestaña 4)
        this.pan_cierre = new JPanel();
        this.conclusion = new JLabel();
        conclusion.setHorizontalAlignment(0);   //centrado
        pan_cierre.setLayout(new GridLayout(2,1));
        pan_cierre.add(conclusion);
        //---------------------------------------------
        //---------------------------------------------
        
        //AÑADIMOS PESTAÑAS AL TABLERO
        tablero.add("Icosaedro",pan_1);
        tablero.add("Dodecaedro",pan_2);
        tablero.add("Tetraedro", pan_3);
        tablero.add("Conclusión",pan_cierre);
        
        //ACTIVAMOS Y DESACTIVAMOS PESTAÑAS
        tablero.setEnabledAt(1, false);
        tablero.setEnabledAt(2, false);
        tablero.setEnabledAt(3, false);
        
    }
    //GETER Y SETER PARA MANEJAR EL TABLERO
    public JTabbedPane getTablero() {
        return tablero;
    }

    public void setTablero(JTabbedPane tablero) {
        this.tablero = tablero;
    }
    
    //MÉTODO PRINCIPAL
    public static void main(String[]args){
        //INSTRUCCIONES
        JOptionPane.showMessageDialog(null, "<html><div align=center><h2>Se van a presentar<br>una serie de preguntas<br> que has de contestar correctamente.<br>Presta atención al escribir las respuestas</h2></div>");
        //CREAMOS LA VENTANA
        JFrame ventana = new JFrame("Preguntas Geometría");
        ventana.getContentPane();

        ventana.setSize(400, 600);
        ventana.setLocationRelativeTo(ventana);
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventana.setVisible(true);
        
        //INTRODUCIMOS NUESTRA CLASE EN LA VENTANA
        PreguntasGeometria vPreguntas = new PreguntasGeometria();
        ventana.add(vPreguntas.getTablero());
        
    }

    //MÉTODOS
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    
    //MÉTODOS DE LOS BOTONES DE RESPUESTA
    //respuesta panel 1
    public void mandaRespuesta_1(ActionEvent evt){
        //almacenamos respuestas en variable
        String respuesta_1_0=pan_1Resp_0.getText();
        String respuesta_1_1=pan_1Resp_1.getText();
        String respuesta_1_2=pan_1Resp_2.getText();
        String respuesta_1_3=pan_1Resp_3.getText();
        String respuesta_1_4=pan_1Resp_4.getText();
        //verificamos veracidad - sumamos puntos - damos respuesta correcta
        if(solu_1_0.equals(respuesta_1_0)){
            puntuacion+=1;  //sumamos punto
        }else{
            JOptionPane.showMessageDialog(null, "<html><div align=center><h2>"+resp_1_0+"</h2></div>");
        }
        if(solu_1_1.equals(respuesta_1_1)){
            puntuacion+=1;  //sumamos punto
        }else{
            JOptionPane.showMessageDialog(null, "<html><div align=center><h2>"+resp_1_1+"</h2></div>");
        }
        if(solu_1_2.equals(respuesta_1_2)){
            puntuacion+=1;  //sumamos punto
        }else{
            JOptionPane.showMessageDialog(null, "<html><div align=center><h2>"+resp_1_2+"</h2></div>");
        }
        if(solu_1_3.equalsIgnoreCase(respuesta_1_3)){
            puntuacion+=1;  //sumamos punto
        }else{
            JOptionPane.showMessageDialog(null, "<html><div align=center><h2>"+resp_1_3+"</h2></div>");
        }
        if(solu_1_4.equalsIgnoreCase(respuesta_1_4)){
            puntuacion+=1;  //sumamos punto
        }else{
            JOptionPane.showMessageDialog(null, "<html><div align=center><h2>"+resp_1_4+"</h2></div>");
        }
        
        JOptionPane.showMessageDialog(null, "<html><div align=center><h2>Tablero 1 completado<br>Tienes: "+puntuacion+" puntos</h2></div>");
        
        tablero.setSelectedIndex(1);
        tablero.setEnabledAt(1, true);
        tablero.setEnabledAt(0, false);
    }
    
    //MÉTODOS DE LOS BOTONES DE RESPUESTA
    //respuesta panel 2
    public void mandaRespuesta_2(ActionEvent evt){
        //almacenamos respuestas en variable
        String respuesta_2_0=pan_2Resp_0.getText();
        String respuesta_2_1=pan_2Resp_1.getText();
        String respuesta_2_2=pan_2Resp_2.getText();
        String respuesta_2_3=pan_2Resp_3.getText();
        String respuesta_2_4=pan_2Resp_4.getText();
        //verificamos veracidad - sumamos puntos - damos respuesta correcta
        if(solu_2_0.equals(respuesta_2_0)){
            puntuacion+=1;  //sumamos punto
        }else{
            JOptionPane.showMessageDialog(null, "<html><div align=center><h2>"+resp_2_0+"</h2></div>");
        }
        if(solu_2_1.equals(respuesta_2_1)){
            puntuacion+=1;  //sumamos punto
        }else{
            JOptionPane.showMessageDialog(null, "<html><div align=center><h2>"+resp_2_1+"</h2></div>");
        }
        if(solu_2_2.equals(respuesta_2_2)){
            puntuacion+=1;  //sumamos punto
        }else{
            JOptionPane.showMessageDialog(null, "<html><div align=center><h2>"+resp_2_2+"</h2></div>");
        }
        if(solu_2_3.equalsIgnoreCase(respuesta_2_3)){
            puntuacion+=1;  //sumamos punto
        }else{
            JOptionPane.showMessageDialog(null, "<html><div align=center><h2>"+resp_2_3+"</h2></div>");
        }
        if(solu_2_4.equalsIgnoreCase(respuesta_2_4)){
            puntuacion+=1;  //sumamos punto
        }else{
            JOptionPane.showMessageDialog(null, "<html><div align=center><h2>"+resp_2_4+"</h2></div>");
        }
        
        JOptionPane.showMessageDialog(null, "<html><div align=center><h2>Tablero 2 completado<br>Tienes: "+puntuacion+" puntos</h2></div>");
                
        tablero.setSelectedIndex(2);
        tablero.setEnabledAt(2, true);
        tablero.setEnabledAt(1, false);
    }
    
    //MÉTODOS DE LOS BOTONES DE RESPUESTA
    //respuesta panel 3
    public void mandaRespuesta_3(ActionEvent evt){
        //almacenamos respuestas en variable
        String respuesta_3_0=pan_3Resp_0.getText();
        String respuesta_3_1=pan_3Resp_1.getText();
        String respuesta_3_2=pan_3Resp_2.getText();
        String respuesta_3_3=pan_3Resp_3.getText();
        String respuesta_3_4=pan_3Resp_4.getText();
        //verificamos veracidad - sumamos puntos - damos respuesta correcta
        if(solu_3_0.equals(respuesta_3_0)){
            puntuacion+=1;  //sumamos punto
        }else{
            JOptionPane.showMessageDialog(null, "<html><div align=center><h2>"+resp_3_0+"</h2></div>");
        }
        if(solu_3_1.equals(respuesta_3_1)){
            puntuacion+=1;  //sumamos punto
        }else{
            JOptionPane.showMessageDialog(null, "<html><div align=center><h2>"+resp_3_1+"</h2></div>");
        }
        if(solu_3_2.equals(respuesta_3_2)){
            puntuacion+=1;  //sumamos punto
        }else{
            JOptionPane.showMessageDialog(null, "<html><div align=center><h2>"+resp_3_2+"</h2></div>");
        }
        if(solu_3_3.equalsIgnoreCase(respuesta_3_3)){
            puntuacion+=1;  //sumamos punto
        }else{
            JOptionPane.showMessageDialog(null, "<html><div align=center><h2>"+resp_3_3+"</h2></div>");
        }
        if(solu_3_4.equalsIgnoreCase(respuesta_3_4)){
            puntuacion+=1;  //sumamos punto
        }else{
            JOptionPane.showMessageDialog(null, "<html><div align=center><h2>"+resp_3_4+"</h2></div>");
        }
        
        JOptionPane.showMessageDialog(null, "<html></div align=center><h2>Tablero 3 completado<br>Tienes: "+puntuacion+" puntos</h2></div>");
        
        conclusion.setText("<html><div align=center><h2>GAME OVER<br>Has terminado con una<br> puntuación de "+puntuacion+" puntos.</h2></div>");
        tablero.setSelectedIndex(3);
        tablero.setEnabledAt(3, true);
        tablero.setEnabledAt(2, false);
    }
    
    //DECLARACIÓN DE VARIABLES GLOBALES
    private static int puntuacion=0;

}
