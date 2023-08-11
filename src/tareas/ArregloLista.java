// @author Usuario
package tareas;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ArregloLista {

    public static void main(String[] args) {
        
        ArrayList<String> ingredientes = new ArrayList<String>();
        ingredientes.add("harina");
        ingredientes.add("huevos");
        ingredientes.add("leche");
        ingredientes.add("aceite");
        ingredientes.add("sal");
        ingredientes.add("yogurt");
        ingredientes.add("levafura");
        
        System.out.println(ingredientes.size());
        System.out.println(ingredientes);
        
        ingredientes.remove(6);
        
        ingredientes.set(1, "bicarbonato");
        
        System.out.println(ingredientes);
        
        for(int i=0; i<ingredientes.size(); i++){
            System.out.print("º ");
            System.out.println(
                    ingredientes.get(
                    i));
        }
        
        ingredientes.
                set(
                0,
                        JOptionPane.
                                showInputDialog(
                        "Introduce otro ingrediente para tu pastel"));
        
        ingredientes.add(
                JOptionPane.showInputDialog(
                        "Y otro más"));
        System.
                out.
                println(
                        "------------------------------------");
        
        JOptionPane.
                showMessageDialog(
                null,ingredientes);
        
        for(int i=0;
                i<ingredientes.
                size();
                i++){
            System.out.println(
                    ingredientes.get(i));
        }
        
    }   //Fin método main

}   //Fin class
