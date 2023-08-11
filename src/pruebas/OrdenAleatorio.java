// @author Usuario
package pruebas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenAleatorio {
    public static void main(String[] args) {
        // Crear el array de cadenas
        String[] cadenas = {
            "src/img_puzzle/a1.png", 
            "src/img_puzzle/a2.png", 
            "src/img_puzzle/a3.png", 
            "src/img_puzzle/a4.png", 
            "src/img_puzzle/a5.png", 
            "src/img_puzzle/a6.png",
            "src/img_puzzle/a7.png", 
            "src/img_puzzle/a8.png", 
            "src/img_puzzle/a9.png", 
            "src/img_puzzle/a10.png", 
            "src/img_puzzle/a11.png",
            "src/img_puzzle/a12.png"
        };
        
        // Convertir el array en una lista
        List<String> listaCadenas = Arrays.asList(cadenas);
        
        // Ordenar la lista de forma aleatoria
        Collections.shuffle(listaCadenas);
        
        // Imprimir el orden aleatorio de las cadenas
        System.out.println("Orden aleatorio:");
        for (String cadena : listaCadenas) {
            System.out.println(cadena);
        }
        
    }
}

