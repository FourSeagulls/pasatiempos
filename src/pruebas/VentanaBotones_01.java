// @author Usuario
package pruebas;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.*;
import javax.swing.border.*;

public class VentanaBotones_01 extends JFrame implements ActionListener {
   
    // Crear 12 botones con imágenes diferentes
    JButton boton1 = new JButton(new ImageIcon("src/img_puzzle/a1.png"));
    JButton boton2 = new JButton(new ImageIcon("src/img_puzzle/a2.png"));
    JButton boton3 = new JButton(new ImageIcon("src/img_puzzle/a3.png"));
    JButton boton4 = new JButton(new ImageIcon("src/img_puzzle/a4.png"));
    
    JButton boton5 = new JButton(new ImageIcon("src/img_puzzle/a5.png"));
    JButton boton6 = new JButton(new ImageIcon("src/img_puzzle/a6.png"));
    JButton boton7 = new JButton(new ImageIcon("src/img_puzzle/a7.png"));
    JButton boton8 = new JButton(new ImageIcon("src/img_puzzle/a8.png"));
    
    JButton boton9 = new JButton(new ImageIcon("src/img_puzzle/a9.png"));
    JButton boton10 = new JButton(new ImageIcon("src/img_puzzle/a10.png"));
    JButton boton11 = new JButton(new ImageIcon("src/img_puzzle/a11.png"));
    JButton boton12 = new JButton(new ImageIcon("src/img_puzzle/a12.png"));
    
    // Crear una variable para guardar el botón pulsado
    JButton botonPulsado = null;

    public VentanaBotones_01() {
        // Configurar la ventana
        setTitle("Ventana con botones");
        setSize(800,600);
        setLocationRelativeTo(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Añadir los botones al panel
        JPanel panel = new JPanel(); 
        panel.setLayout(new GridLayout(3, 4)); // Usar un GridLayout con tres fila y cuatro columnas
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        
        panel.add(boton5);
        panel.add(boton6);
        panel.add(boton7);
        panel.add(boton8);
        
        panel.add(boton9);
        panel.add(boton10);
        panel.add(boton11);
        panel.add(boton12);

        // Añadir el panel a la ventana
        add(panel);

        // Añadir los listeners a los botones
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);
        boton4.addActionListener(this);
        
        boton5.addActionListener(this);
        boton6.addActionListener(this);
        boton7.addActionListener(this);
        boton8.addActionListener(this);
        
        boton9.addActionListener(this);
        boton10.addActionListener(this);
        boton11.addActionListener(this);
        boton12.addActionListener(this);

        // Ajustar el tamaño de los botones y quitar los bordes
        boton1.setPreferredSize(new Dimension(200, 200));
        boton1.setBorder(new EmptyBorder(0, 0, 0, 0));
        boton2.setPreferredSize(new Dimension(200, 200));
        boton2.setBorder(new EmptyBorder(0, 0, 0, 0));
        boton3.setPreferredSize(new Dimension(200, 200));
        boton3.setBorder(new EmptyBorder(0, 0, 0, 0));
        boton4.setPreferredSize(new Dimension(200, 200));
        boton4.setBorder(new EmptyBorder(0, 0, 0, 0));
        
        boton5.setPreferredSize(new Dimension(200, 200));
        boton5.setBorder(new EmptyBorder(0, 0, 0, 0));
        boton6.setPreferredSize(new Dimension(200, 200));
        boton6.setBorder(new EmptyBorder(0, 0, 0, 0));
        boton7.setPreferredSize(new Dimension(200, 200));
        boton7.setBorder(new EmptyBorder(0, 0, 0, 0));
        boton8.setPreferredSize(new Dimension(200, 200));
        boton8.setBorder(new EmptyBorder(0, 0, 0, 0));
        
        boton9.setPreferredSize(new Dimension(200, 200));
        boton9.setBorder(new EmptyBorder(0, 0, 0, 0));
        boton10.setPreferredSize(new Dimension(200, 200));
        boton10.setBorder(new EmptyBorder(0, 0, 0, 0));
        boton11.setPreferredSize(new Dimension(200, 200));
        boton11.setBorder(new EmptyBorder(0, 0, 0, 0));
        boton12.setPreferredSize(new Dimension(200, 200));
        boton12.setBorder(new EmptyBorder(0, 0, 0, 0));

        // Ajustar el tamaño de la ventana al de los componentes
        pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Obtener el botón que ha generado el evento
        JButton botonActual = (JButton) e.getSource();

        // Si no hay ningún botón pulsado previamente, guardar el botón actual
        if (botonPulsado == null) {
            botonPulsado = botonActual;
        } else {
            // Si hay un botón pulsado previamente, intercambiar las imágenes de los botones
            ImageIcon imagenPulsado = (ImageIcon) botonPulsado.getIcon();
            ImageIcon imagenActual = (ImageIcon) botonActual.getIcon();
            botonPulsado.setIcon(imagenActual);
            botonActual.setIcon(imagenPulsado);

            // Reiniciar la variable del botón pulsado
            botonPulsado = null;
        }
    }
    
    public void desordena(){
        // Crear el array de cadenas
        String[] cadenas = {
            "src/img_puzzle/a1.png", 
            "src/img_puzzle/a2.png", 
            "src/img_puzzle/a3.png", 
            "src/img_puzzle/a4.png", 
            "src/img_puzzle/a5.png", 
            "src/img_puzzle/a6.png",
            "src/img_puzzle/a7.png", 
            "src/img_puzzle/a8.png", 
            "src/img_puzzle/a9.png", 
            "src/img_puzzle/a10.png", 
            "src/img_puzzle/a11.png",
            "src/img_puzzle/a12.png"
        };
        
        // Convertir el array en una lista
        List<String> listaCadenas = Arrays.asList(cadenas);
        
        // Ordenar la lista de forma aleatoria
        Collections.shuffle(listaCadenas);
    }

    public static void main(String[] args) {
        // Crear y mostrar la ventana
        VentanaBotones_01 ventana = new VentanaBotones_01();
        ventana.setVisible(true);
        
        ventana.desordena();
    }
}
