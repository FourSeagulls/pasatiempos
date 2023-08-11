// @author Elias
package complementos;

// Importar las clases necesarias
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import javax.sound.sampled.*;

// Crear una clase que extienda de JFrame e implemente ActionListener
public class SonidoBotonComentado extends JFrame implements ActionListener {

    // Declarar los componentes de la interfaz gráfica
    private JButton boton; // El botón que al pulsarlo reproduce el sonido
    private Clip clip; // El objeto que contiene el sonido a reproducir

    // Crear el constructor de la clase
    public SonidoBotonComentado() {
        // Inicializar los componentes de la interfaz gráfica
        boton = new JButton("Reproducir sonido"); // Crear el botón con el texto "Reproducir sonido"
        boton.addActionListener(this); // Añadir un escuchador de eventos al botón para que responda al clic
        add(boton); // Añadir el botón al panel principal del marco

        // Cargar el sonido desde un archivo de audio
        try {
            // Obtener la ruta del archivo de audio (cambiar según la ubicación del archivo)
            String ruta = "src/sonido/vozBoton.wav";
            // Crear un objeto File con la ruta del archivo
            File archivo = new File(ruta);
            // Crear un objeto AudioInputStream con el archivo
            AudioInputStream audio = AudioSystem.getAudioInputStream(archivo);
            // Obtener un objeto Clip del sistema de audio
            clip = AudioSystem.getClip();
            // Abrir el clip con el audio
            clip.open(audio);
        } catch (Exception e) {
            // Mostrar un mensaje de error si ocurre alguna excepción al cargar el sonido
            JOptionPane.showMessageDialog(this, "No se pudo cargar el sonido: " + e.getMessage());
        }

        // Configurar las propiedades del marco
        setTitle("Sonido Botón"); // Establecer el título del marco
        setSize(300, 100); // Establecer el tamaño del marco
        setLocationRelativeTo(null); // Centrar el marco en la pantalla
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Establecer la operación de cierre del marco
        setVisible(true); // Hacer visible el marco
    }

    // Sobrescribir el método actionPerformed para responder al clic del botón
    @Override
    public void actionPerformed(ActionEvent e) {
        // Comprobar si el origen del evento es el botón
        if (e.getSource() == boton) {
            // Reproducir el sonido del clip si no está nulo
            if (clip != null) {
                clip.setFramePosition(0); // Reiniciar la posición del clip al inicio
                clip.start(); // Iniciar la reproducción del clip
            }
        }
    }

    // Crear el método main para ejecutar la aplicación
    public static void main(String[] args) {
        // Crear una instancia de la clase SonidoBoton
        new SonidoBotonComentado();
    }
}

