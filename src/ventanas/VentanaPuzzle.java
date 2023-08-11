// @author Usuario
package ventanas;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import javax.swing.border.*;

public class VentanaPuzzle extends JFrame implements ActionListener  {
   
    // Crear 12 botones con imágenes diferentes
    JButton boton1;
    JButton boton2;
    JButton boton3;
    JButton boton4;
    
    JButton boton5;
    JButton boton6;
    JButton boton7;
    JButton boton8;
    
    JButton boton9;
    JButton boton10;
    JButton boton11;
    JButton boton12;
    
    // Crear una variable para guardar el botón pulsado
    JButton botonPulsado = null;

    public VentanaPuzzle() {
        // Configurar la ventana
        setTitle("Resuelve la foto puzzle");
        setSize(800,600);
        setLocationRelativeTo(this);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        // Crear los botones
        boton1 = new JButton();
        boton2 = new JButton();
        boton3 = new JButton();
        boton4 = new JButton();

        boton5 = new JButton();
        boton6 = new JButton();
        boton7 = new JButton();
        boton8 = new JButton();

        boton9 = new JButton();
        boton10 = new JButton();
        boton11 = new JButton();
        boton12 = new JButton();

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

        //lanza la muestra miniatura de la foto puzzle
        MuestraPuzzle mp = new MuestraPuzzle(this, true);
        mp.setVisible(true);
        
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
            
            // Verificar si el puzzle está completado al iniciar
            if (puzzleCompletado()) {
                eventoPuzzleCompletado();
            }
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
        
        boton12.setIcon(new ImageIcon(listaCadenas.get(0)));
        boton1.setIcon(new ImageIcon(listaCadenas.get(1)));
        boton2.setIcon(new ImageIcon(listaCadenas.get(2)));
        boton3.setIcon(new ImageIcon(listaCadenas.get(3)));
        
        boton4.setIcon(new ImageIcon(listaCadenas.get(4)));
        boton5.setIcon(new ImageIcon(listaCadenas.get(5)));
        boton6.setIcon(new ImageIcon(listaCadenas.get(6)));
        boton7.setIcon(new ImageIcon(listaCadenas.get(7)));
        
        boton8.setIcon(new ImageIcon(listaCadenas.get(8)));
        boton9.setIcon(new ImageIcon(listaCadenas.get(9)));
        boton10.setIcon(new ImageIcon(listaCadenas.get(10)));
        boton11.setIcon(new ImageIcon(listaCadenas.get(11)));
        
    }
        // Verificar si el puzzle está completado
    private boolean puzzleCompletado() {
        // Obtener las imágenes de los botones
        ImageIcon imagen1 = (ImageIcon) boton1.getIcon();
        ImageIcon imagen2 = (ImageIcon) boton2.getIcon();
        ImageIcon imagen3 = (ImageIcon) boton3.getIcon();
        ImageIcon imagen4 = (ImageIcon) boton4.getIcon();
        ImageIcon imagen5 = (ImageIcon) boton5.getIcon();
        ImageIcon imagen6 = (ImageIcon) boton6.getIcon();
        ImageIcon imagen7 = (ImageIcon) boton7.getIcon();
        ImageIcon imagen8 = (ImageIcon) boton8.getIcon();
        ImageIcon imagen9 = (ImageIcon) boton9.getIcon();
        ImageIcon imagen10 = (ImageIcon) boton10.getIcon();
        ImageIcon imagen11 = (ImageIcon) boton11.getIcon();
        ImageIcon imagen12 = (ImageIcon) boton12.getIcon();
        
        // Verificar si las imágenes están en el orden correcto
        return (imagen1.getDescription().equals("src/img_puzzle/a1.png") &&
                imagen2.getDescription().equals("src/img_puzzle/a2.png") &&
                imagen3.getDescription().equals("src/img_puzzle/a3.png") &&
                imagen4.getDescription().equals("src/img_puzzle/a4.png") &&
                imagen5.getDescription().equals("src/img_puzzle/a5.png") &&
                imagen6.getDescription().equals("src/img_puzzle/a6.png") &&
                imagen7.getDescription().equals("src/img_puzzle/a7.png") &&
                imagen8.getDescription().equals("src/img_puzzle/a8.png") &&
                imagen9.getDescription().equals("src/img_puzzle/a9.png") &&
                imagen10.getDescription().equals("src/img_puzzle/a10.png") &&
                imagen11.getDescription().equals("src/img_puzzle/a11.png") &&
                imagen12.getDescription().equals("src/img_puzzle/a12.png"));        
        }
    
    // Evento al completar el puzzle
    private void eventoPuzzleCompletado() {
        // Reproducir un sonido
        // Crea un objeto de AudioClip y carga el archivo de sonido
//OBSOLETO        AudioClip sonido = java.applet.Applet.newAudioClip(getClass().getResource("src/sonido/aplausoPeque.wav"));
        // Reproduce el sonido
//        sonido.play();
        this.suena();
        // Mostrar un mensaje con JOptionPane
        JOptionPane.showMessageDialog(this, "¡Puzzle completado!");

        // Realizar otras acciones o eventos al completar el puzzle
        // ...
        
    }
    
    private void suena(){
        try {
                    // Obtener el archivo de sonido
                    Clip clip = AudioSystem.getClip();
                    clip.open(AudioSystem.getAudioInputStream(
                            SonidoClick.class.getResourceAsStream("/sonido/aplausoPeque.wav")));
                    clip.start();
                } catch (IOException | LineUnavailableException | UnsupportedAudioFileException ex) {
                }
    }
    
    public void main(String[]args){
        VentanaPuzzle ventana = new VentanaPuzzle();
            ventana.desordena();
            ventana.setVisible(true);
    }   
    
}

