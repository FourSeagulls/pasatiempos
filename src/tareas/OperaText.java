// @author Usuario
package tareas;

import javax.swing.JOptionPane;


public class OperaText {
    static String mensaje="Supongo que quires manupular un texto.\nPues tendrás que tomar una opción";
    public OperaText(){
    }
    public static void iniciar(){
        
        JOptionPane.showMessageDialog(null,mensaje);
    }
    
    public static void main(String[]args){
        iniciar();
        char letra = mensaje.charAt(12);
        int codigoLetra=mensaje.codePointAt(12);
        boolean que=mensaje.contains("que");
        int codigoMensaje=mensaje.hashCode();
        boolean enBlanco=mensaje.isBlank();
        boolean esVacio=mensaje.isEmpty();
        int longitud = mensaje.length();
        JOptionPane.showInputDialog(mensaje.repeat(2));
        String mayusculas=mensaje.toUpperCase();
        String juntito=mensaje.strip();
        byte[]botes=mensaje.getBytes();
        
        System.out.println(letra);
        System.out.println(codigoLetra);
        System.out.println(que);
        System.out.println(codigoMensaje);
        System.out.println(enBlanco);
        System.out.println(esVacio);
        System.out.println(longitud);
        System.out.println(mayusculas);
        System.out.println(juntito);
        System.out.println(botes);
    }

}   //  Fin clase
