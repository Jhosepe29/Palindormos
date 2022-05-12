
package com.mycompany.palindormo;

import java.util.Scanner;

/**
 *
 * @author Jhosepe11
 */
public class Palindormo {
    
    public Boolean IsaPalindromo(String txt){
        boolean exit = false;
            int larg = txt.length();
            for (int i = 0; i < larg; i++) {
                if(txt.charAt(i)==(txt.charAt(larg-(i+1)))){
                    exit = true;
                }else{
                    exit=false;
                    break;
                }
                         
        }
                            
        return exit;
    }

    public static void main(String[] args) {
        Palindormo pl = new Palindormo();
        Scanner in = new Scanner(System.in);
        boolean seguir = true;
        while (seguir){
        System.out.println("ingresa el texto");
        String txt = in.next();
            if(pl.IsaPalindromo(txt)){
                System.out.println("Es un palindromo \n\n");
            }else{
                System.out.println("No es un palindomo \n");
            }
            
            System.out.println("seguira agregando? y/n");
            String enter = in.next();
            if(enter.equals("y")){
                seguir= true;
            }
             if(enter.equals("n")){
                seguir= false;
            }
        }
        
    }
}
