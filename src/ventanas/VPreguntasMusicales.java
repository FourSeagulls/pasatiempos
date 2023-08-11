// @author Fourseagulls
package ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class VPreguntasMusicales extends JFrame {
    private final JPanel panelPregunta;
    private final JLabel labelPregunta;
    private JCheckBox[] checkboxes;
    private final JButton botonResolver;
    static int puntos=0;
    static int contadorAciertos;
    static int contadorErrores;

    private final Pregunta[] preguntas = {
            new Pregunta("¿Quién es conocido como el \"Rey del Pop\"?",
                    new Respuesta("Michael Jackson", true),
                    new Respuesta("Elvis Presley", false),
                    new Respuesta("Prince", false),
                    new Respuesta("Madonna", false)),
            new Pregunta("¿Cuál es el álbum más vendido de todos los tiempos?",
                    new Respuesta("Thriller - Michael Jackson", true),
                    new Respuesta("Back in Black - AC/DC", false),
                    new Respuesta("Dark Side of the Moon - Pink Floyd", false),
                    new Respuesta("Rumours - Fleetwood Mac", false)),
            new Pregunta("¿Qué banda británica es conocida por canciones como \"Bohemian Rhapsody\" y \"We Will Rock You\"?",
                    new Respuesta("The Beatles", false),
                    new Respuesta("The Rolling Stones", false),
                    new Respuesta("Queen", true),
                    new Respuesta("Led Zeppelin", false)),
            new Pregunta("¿Cuál es el nombre real de la cantante conocida como \"Lady Gaga\"?",
                    new Respuesta("Stefani Joanne Angelina Germanotta", true),
                    new Respuesta("Katheryn Elizabeth Hudson", false),
                    new Respuesta("Onika Tanya Maraj", false),
                    new Respuesta("Aubrey Drake Graham", false)),
            //--------------------------------------------------------------
            // Agrega las veinte preguntas adicionales aquí
            new Pregunta("¿Cuál es el álbum debut de la banda Nirvana?",
                    new Respuesta("Nevermind", false),
                    new Respuesta("In Utero", false),
                    new Respuesta("Bleach", true),
                    new Respuesta("Incesticide", false)),
            new Pregunta("¿Cuál de estos artistas es conocido por su estilo de guitarra llamado \"shredding\"?",
                    new Respuesta("Eric Clapton", false),
                    new Respuesta("Jimi Hendrix", false),
                    new Respuesta("Eddie Van Halen", true),
                    new Respuesta("Jimmy Page", false)),
            new Pregunta("¿Qué grupo musical interpretó la canción \"Stairway to Heaven\"?",
                    new Respuesta("The Doors", false),
                    new Respuesta("Pink Floyd", false),
                    new Respuesta("Led Zeppelin", true),
                    new Respuesta("The Rolling Stones", false)),
            new Pregunta("¿Cuál es el nombre real del cantante conocido como \"Sting\"?",
                    new Respuesta("Gordon Matthew Thomas Sumner", true),
                    new Respuesta("Freddie Mercury", false),
                    new Respuesta("David Bowie", false),
                    new Respuesta("Steven Tyler", false)),
            new Pregunta("¿Qué género musical es conocido por sus raíces en el reggae y el punk?",
                    new Respuesta("Ska", true),
                    new Respuesta("Jazz", false),
                    new Respuesta("Hip-hop", false),
                    new Respuesta("Blues", false)),
            //------------------------------------------------
            new Pregunta("¿Cuál de los siguientes artistas es conocido como el \"Rey del Rock and Roll\"?",
                    new Respuesta("Elvis Presley", true),
                    new Respuesta("Michael Jackson", false),
                    new Respuesta("Bob Dylan", false),
                    new Respuesta("Bruce Springsteen", false)),
            new Pregunta("¿Qué banda es conocida por su álbum \"The Joshua Tree\"?",
                    new Respuesta("U2", true),
                    new Respuesta("Coldplay", false),
                    new Respuesta("Radiohead", false),
                    new Respuesta("Oasis", false)),
            new Pregunta("¿Cuál es el nombre real del rapero conocido como \"Eminem\"?",
                    new Respuesta("Marshall Bruce Mathers III", true),
                    new Respuesta("Christopher George Latore Wallace", false),
                    new Respuesta("Calvin Cordozar Broadus Jr.", false),
                    new Respuesta("Curtis James Jackson III", false)),
            new Pregunta("¿Qué banda es conocida por su álbum \"Appetite for Destruction\"?",
                    new Respuesta("Guns N' Roses", true),
                    new Respuesta("Metallica", false),
                    new Respuesta("Nirvana", false),
                    new Respuesta("Red Hot Chili Peppers", false)),
            new Pregunta("¿Cuál de los siguientes artistas es conocido como \"El Rey del Reggaetón\"?",
                    new Respuesta("Daddy Yankee", true),
                    new Respuesta("Maluma", false),
                    new Respuesta("J Balvin", false),
                    new Respuesta("Ozuna", false)),
            new Pregunta("¿Cuál es el álbum más vendido de la historia de la música latina?",
                    new Respuesta("Supernatural - Santana", false),
                    new Respuesta("Mi Sangre - Juanes", false),
                    new Respuesta("Vuelve - Ricky Martin", false),
                    new Respuesta("The Emancipation of Mimi - Mariah Carey", true)),
            new Pregunta("¿Qué cantante interpretó la canción \"Like a Virgin\"?",
                    new Respuesta("Madonna", true),
                    new Respuesta("Celine Dion", false),
                    new Respuesta("Whitney Houston", false),
                    new Respuesta("Britney Spears", false)),
            new Pregunta("¿Cuál es el nombre real del músico conocido como \"Stevie Wonder\"?",
                    new Respuesta("Stevland Hardaway Morris", true),
                    new Respuesta("Ray Charles", false),
                    new Respuesta("James Brown", false),
                    new Respuesta("Prince", false)),
            new Pregunta("¿Qué banda es conocida por su álbum \"Hotel California\"?",
                    new Respuesta("Eagles", true),
                    new Respuesta("The Beach Boys", false),
                    new Respuesta("Queen", false),
                    new Respuesta("Fleetwood Mac", false)),
            new Pregunta("¿Cuál de los siguientes artistas es conocido como \"El Buki\"?",
                    new Respuesta("Marco Antonio Solís", true),
                    new Respuesta("Alejandro Fernández", false),
                    new Respuesta("Luis Miguel", false),
                    new Respuesta("Juan Gabriel", false))
    
    };

    private int preguntaActual;

    public VPreguntasMusicales() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Ventana de Preguntas");
        setSize(600, 200);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(new BorderLayout());

        panelPregunta = new JPanel(new GridLayout(5, 1));
        labelPregunta = new JLabel();
        checkboxes = new JCheckBox[4];
        for (int i = 0; i < checkboxes.length; i++) {
            checkboxes[i] = new JCheckBox();
            panelPregunta.add(checkboxes[i]);
        }
        botonResolver = new JButton("Resolver");
        botonResolver.addActionListener((ActionEvent e) -> {
            resolverPregunta();
///////////////////////////////////////
// Verificar respuestas seleccionadas
for (int i = 0; i < checkboxes.length; i++) {
    if (checkboxes[i].isSelected()) {
        Respuesta[] respuestas = null;
        Respuesta respuesta = respuestas[i];
        if (respuesta.isCorrect()) {
            contadorAciertos++;
        } else {
            contadorErrores++;
        }
    }
}

///////////////////////////////////////
        });

        add(labelPregunta, BorderLayout.NORTH);
        add(panelPregunta, BorderLayout.CENTER);
        add(botonResolver, BorderLayout.SOUTH);

        preguntaActual = 0;
        mostrarPregunta(preguntaActual);
    }

    private void mostrarPregunta(int index) {
        Pregunta pregunta = preguntas[index];
        labelPregunta.setText(pregunta.getQuestion());
        Respuesta[] respuestas = pregunta.getAnswers();
        for (int i = 0; i < checkboxes.length; i++) {
            checkboxes[i].setText(respuestas[i].getText());
            checkboxes[i].setSelected(false);
        }
    }

    private void resolverPregunta() {
        boolean respuestaCorrecta = true;
        Pregunta pregunta = preguntas[preguntaActual];
        Respuesta[] respuestas = pregunta.getAnswers();
        for (int i = 0; i < checkboxes.length; i++) {
            if (checkboxes[i].isSelected() && !respuestas[i].isCorrect()) {
                respuestaCorrecta = false;
                break;
            }
            

            //----------------------------
                        if (!checkboxes[i].isSelected() && respuestas[i].isCorrect()) {
                respuestaCorrecta = false;
                break;
            }
        }
        JOptionPane.showMessageDialog(this, respuestaCorrecta ? "Respuesta correcta" : "Respuesta incorrecta");

        preguntaActual++;
        if (preguntaActual < preguntas.length) {
            mostrarPregunta(preguntaActual);
        } else {
            JOptionPane.showMessageDialog(this, "¡Has completado todas las preguntas! con "+puntos+" puntos");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new VPreguntasMusicales().setVisible(true);
        });
    }

    private static class Pregunta {
        private final String question;
        private final Respuesta[] answers;

        public Pregunta(String question, Respuesta... answers) {
            this.question = question;
            this.answers = answers;
        }

        public String getQuestion() {
            return question;
        }

        public Respuesta[] getAnswers() {
            return answers;
        }
    }

    private static class Respuesta {
        private final String text;
        private final boolean correct;

        public Respuesta(String text, boolean correct) {
            this.text = text;
            this.correct = correct;
        }

        public String getText() {
            return text;
        }

        public boolean isCorrect() {
            return correct;
        }
    }
}

           
