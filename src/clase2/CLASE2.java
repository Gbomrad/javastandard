
package clase2;

import java.util.Scanner;

public class CLASE2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        System.out.println("Ingresar palabra y te digo si es un palindromo");
        Scanner palabra = new Scanner(System.in);
        String palabra1 = palabra.nextLine();

        Boolean espalindromo= true;
        int hasta = palabra1.length();
        
    for (int i= 0, j= palabra1.length()-1; i< hasta; i++, j--) {
            if (palabra1.charAt(i) != palabra1.charAt(j)){
        espalindromo = false;
       }
       break; 
    }
        System.out.println("¿Es palindromo?"+ espalindromo);

    }
}
