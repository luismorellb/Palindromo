/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.palindromo.business;

/**
 * Clase que proporciona un método para verificar si una frase es un palíndromo.
 * 
 * @author luismorellb
 */
public class Palindromo {
    
    /**
     * Verifica si la frase ingresada es un palíndromo, ignorando espacios, signos de puntuación y caracteres especiales.
     * @param phrase la frase que se desea verificar.
     * @return true si la frase es un palíndromo y false si no lo es.
     */
    
    public static boolean isPalindrome(String phrase){
        try{
            phrase = phrase.toLowerCase();
            phrase = phrase.replace(" ", "").replace("¿","").replace("?","").replace("¡","").replace("!","").replace(".", "").replace(",", "");
            phrase = phrase.replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u"); 
                
            int left = 0;
            int right = phrase.length() - 1;
        
            while(left < right){
                if(phrase.charAt(left) == phrase.charAt(right)){
                   left++;
                   right--;
            } else{
                   return false;
            }
            }           
        
            return true;
        } catch (Exception ex){
            System.out.println("Se produjo un error: " + ex.getMessage());
            return false;
        }
    }
}