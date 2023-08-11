// @author FourSeagulls
package principalClass;

import ventanas.VPrincipal;
import ventanas.VentanaPuzzle;

public class Principal {

    public static void main(String[] args) {
        iniciar();

    }   //  Fin main
       
    private static void iniciar(){
        VPrincipal principal = new VPrincipal();
        principal.setVisible(true);
    }
    
    private static void puzzlear(){
        VentanaPuzzle vb = new VentanaPuzzle();
        vb.desordena();//hay que desordenar antes de lanzar el Puzzle, si no no funciona
        vb.setVisible(true);
    }
    
}   //Fin class

