// @author Usuario
package tareas;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Area {
    
    public static void areas(){
    
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("""
                           Elige una opción:
                           1: Cuadrado
                           2: Rectángulo
                           3: Triángulo
                           4: Círculo
                           """);
        int figura = entrada.nextInt();
        
        switch(figura){
            case 1:
                int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado del cuadrado"));
                JOptionPane.showMessageDialog(null, "El área es: "+lado*lado);
                break;
            case 2:
                int ancho, largo;
                ancho=Integer.parseInt(JOptionPane.showInputDialog("Introduce el ancho del rectángulo:"));
                largo=Integer.parseInt(JOptionPane.showInputDialog("Introduce la longitud del rectángulo:")); 
                JOptionPane.showMessageDialog(null, "El área del rectángulo es: "+largo*ancho);
                break;
            case 3:
                int base, altura;
                base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base del triángulo:"));
                altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura del triángulo:")); 
                JOptionPane.showMessageDialog(null, "El área del rectángulo es: "+(base*altura)/2);
                break;
            case 4:
                int radio;
                radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio del circulo:"));
                JOptionPane.showMessageDialog(null, "El área del rectángulo es: "+3.1416*radio*radio);
                System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
                break;
            default:
        }
        
    }   //Fin main
}   //Fin class
