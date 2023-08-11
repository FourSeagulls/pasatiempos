// @author Usuario
package extra;

import javax.swing.JOptionPane;

public class CaracteresEspeciales {

    public CaracteresEspeciales() {
        JOptionPane.showMessageDialog(null, """
                           Si quieres poner acentos este es el código.
                           \u00C1 = \\u00C1
                           \u00E1 = \\u00E1
                           \u00C9 = \\u00C9
                           \u00E9 = \\u00E9
                           \u00CD = \\u00CD
                           \u00ED = \\u00ED
                           \u00D3 = \\u00D3
                           \u00F3 = \\u00F3
                           \u00DA = \\u00DA
                           \u00FA = \\u00FA
                           \u00DC = \\u00DC
                           \u00FC = \\u00FC
                           \u00D1 = \\u00D1
                           \u00F1 = \\u00F1
                           """);
        JOptionPane.showMessageDialog(null, """
                           \u0022 = //u0022
                           \u003C = //u003C
                           \u003E = //u003E
                           \u00ED = //u00ED
                           \u00A0 = //u00A0
                           \u0022 = //u0022
                           \u0027 = //u0027
                           \u00A9 = //u00A9
                           \u00AE = //u00AE
                           \u20AC = //u20AC
                           \u00B0 = //u00B0
                           \u00B2 = //u00B2
                           \u00B3 = //u00B3
                           \u00B5 = //u00B5
                           \u00BC = //u00BC
                           \u00BD = //u00BD
                           \u00BE = //u00BE
                           \u03C0 = //u03C0
                           """);
    }

    public static void main (String[]args){
        CaracteresEspeciales ce = new CaracteresEspeciales();
       
    }

}   //  Fin class
