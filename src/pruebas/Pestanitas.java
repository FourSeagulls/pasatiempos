// @author Usuario
package pruebas;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;


public class Pestanitas {
    
    public JTabbedPane tablero;

    public Pestanitas() {
        tablero = new JTabbedPane();
        tablero.add(new JLabel("Soy el contenido 1", JLabel.CENTER),"Titulo 1");
        tablero.addTab("Pestaña 2", new JLabel("Contenido segundo", JLabel.CENTER));
        
    }

    public JTabbedPane getTablero() {
        return tablero;
    }

    public void setTablero(JTabbedPane tablero) {
        this.tablero = tablero;
    }
    
    public static void main(String[]args){
        JFrame ventana = new JFrame("Uso pestañitas");
        ventana.getContentPane().add(new Pestanitas().getTablero());
/*        LA LÍNEA ANYERIOR Y LAS TRES SIGUIENTES SON EQUIVALENTES
        ventana.getContentPane();
        Pestanitas pestanitas = new Pestanitas();
        ventana.add(pestanitas.getTablero());
*/
        ventana.setSize(400, 300);
        ventana.setLocationRelativeTo(ventana);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }

}
