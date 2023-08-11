// @author Usuario
package complementos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class BotonSonido extends JButton implements ActionListener{

    private Clip clip;
    private boolean reproduciendo;
    private boolean pausado;
    private long pausaFrame;

    public BotonSonido(String archi) {
        setText("Start");
        reproduciendo = false;
        pausado = false;
        pausaFrame = 0;

        try {
            String ruta = "src/sonido/" + archi + ".wav";
            File archivo = new File(ruta);
            AudioInputStream audio = AudioSystem.getAudioInputStream(archivo);
            clip = AudioSystem.getClip();
            clip.open(audio);
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            JOptionPane.showMessageDialog(this, "No se pudo cargar el sonido: " + e.getMessage());
        }

        addActionListener((ActionEvent e) -> {
            if (reproduciendo) {
                if (pausado) {
                    reanudar();
                } else {
                    pausar();
                }
            } else {
                reproducir();
            }
        });

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    reiniciar();
                }
            }
        });
    }

    public void reproducir() {
        if (clip != null) {
            clip.setFramePosition(0);
            clip.start();
            reproduciendo = true;
            pausado = false;
            setText("Pausa");
        }
    }

    public void pausar() {
        if (clip != null && reproduciendo && !pausado) {
            pausaFrame = clip.getFramePosition();
            clip.stop();
            pausado = true;
            setText("Reanudar");
        }
    }

    public void reanudar() {
        if (clip != null && reproduciendo && pausado) {
            clip.setFramePosition((int) pausaFrame);
            clip.start();
            pausado = false;
            setText("Pausa");
        }
    }

    public void reiniciar() {
        if (clip != null) {
            clip.stop();
            clip.setFramePosition(0);
            reproduciendo = false;
            pausado = false;
            setText("Start");
        }
    }

    public boolean estaReproduciendo() {
        return reproduciendo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
