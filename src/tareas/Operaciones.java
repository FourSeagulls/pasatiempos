// @author Usuario
package tareas;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Operaciones {

    public Operaciones() {
    }
    public static void operar(){
        
           Scanner sc = new Scanner(System.in);
       System.out.println();
       String option = JOptionPane.showInputDialog(null, """
                                                         Si quieres SUMAR pulsa la letra => S
                                                         Si quieres RESTAR pulsa la letra => R
                                                         Si quieres MULTIPLICAR pulsa la letra => M
                                                         Si quieres DIVIDIR pulsa la letra => D
                                                         Si quieres ELEVAR A LA POTENCIA pulsa la letra => P
                                                         Si quieres hayar ÁREAS pulsa la letra A =Z
                                                         Puedes cancelar para salir
                                                         """);
        if("S".equals(option)||"s".equals(option)){
           sumar();
       }else
       if("R".equals(option)||"r".equals(option)){
           restar();
       }else
       if("M".equals(option)||"m".equals(option)){
           multiplicar();
       }else    
       if("D".equals(option)||"d".equals(option)){
           dividir();
       }else
       if("P".equals(option)||"p".equals(option)){
           potenciar();
       }else if("A".equals(option)||"a".equals(option)){
           Area.areas();
       }else{
           JOptionPane.showMessageDialog(null, "Opción equivocada");
       }
       
    }   //Fin método operar

    private static void sumar() {
        int num =0;
        int result =0;
        num = Integer.parseInt(JOptionPane.showInputDialog("Vas a introducir cuantos sumandos quieras"
                + "para salir introduce un 0"));
        
        while(num!=0){
            result += num;
            num = Integer.parseInt(JOptionPane.showInputDialog("Suma "+result));
            if(num==0){
                System.out.println("Total suma: "+result);
                operar();
            }
        }
    }

    private static void restar() {
        JOptionPane.showInputDialog("Vas a introducir cuantos restandos quieras"
                + "para salir introduce un 0");
    }

    private static void multiplicar() {
        JOptionPane.showInputDialog("Vas a introducir cuantos multiplicandos quieras"
                + "para salir introduce un 0");
    }

    private static void dividir() {
        JOptionPane.showInputDialog("Vas a introducir cuantos dividandos quieras"
                + "para salir introduce un 0");
    }

    private static void potenciar() {
        JOptionPane.showInputDialog("Vas a introducir cuantos potenciandos quieras"
                + "para salir introduce un 0");
    }
    
}   //  Fin clase Operaciones


