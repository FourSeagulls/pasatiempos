// @author Fourseagulls
package ventanas;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class VClick extends JFrame{

    public VClick() {
        setTitle("Botón con sonido");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JButton button = new JButton("Reproducir sonido");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Obtener el archivo de sonido
                    Clip clip = AudioSystem.getClip();
                    clip.open(AudioSystem.getAudioInputStream(VClick.class.getResourceAsStream("/sonido/plin.wav")));
                    clip.start();
                } catch (IOException | LineUnavailableException | UnsupportedAudioFileException ex) {
                }
            }
        });

        getContentPane().add(button);
        pack();
        setVisible(true);
    }
}

