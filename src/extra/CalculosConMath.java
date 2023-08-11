
package extra;

import java.util.Scanner;


public class CalculosConMath {

    public CalculosConMath() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elije la operación que quieres realizar \n Escribe aleatorio o raiz");
        String respuesta = sc.nextLine();
        if("raiz".equals(respuesta)){
            raiz();
        }else if("aleatorio".equals(respuesta)){
            aleatorio();
        }else{System.out.println("Respuesta incorrecta");}
        sc.close();
    }
    public void raiz(){
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número para obtener su raiz cuadrada");
        double num = entrada.nextDouble();
        double raiz = Math.sqrt(num);
        System.out.println("La raíz cuadrada de "+num+" es:");
        System.out.println(raiz);
        System.out.println("");
        System.out.println("""
                           Si el resultado decimal lo redondeo con
                           la clase Math.round
                           se redondea al entero m\u00E1s cercano.
                           """);        
        int resultado = (int) Math.round(raiz);
        System.out.println(resultado);
        
        System.out.println("""
                           Si hacemos una refundici\u00F3n - casting
                           tan s\u00F3lo le quita el decimal
                           """);
        int resultado2 = (int)raiz;
        System.out.println(resultado2);
        
        entrada.close();
    }   //Fin raiz
    
    public void aleatorio(){
        
        double aleas = (Math.random()*100);
        System.out.println((int)aleas);
    }
    
}   // Fin class
