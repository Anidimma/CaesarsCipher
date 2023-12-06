/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.caesarscipher;
import java.lang.String;
/**
 *
 * @author Divin
 */
public class CaesarsCipher {
    private String my_message;
    private final String allCharacters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ ";
    
    public CaesarsCipher(String my_message){
        this.my_message = my_message;
    }
    
    public String getMessage(){
        return this.my_message;
    }
    
    private int get_specifier(int n_specifier){
        int result = n_specifier >= 0? n_specifier: (n_specifier/-1);
        
        return result;
    }
    
    private String get_encryption(String message, int n_specifier){
       String encrypted_string = "";
       Character newChar;
       
       for(Integer i = 0; i < message.length(); i++){
           Character character_toFind = message.charAt(i);
           int index_allCharacters = allCharacters.
                   indexOf(character_toFind) + this.get_specifier(n_specifier);
           
           if(allCharacters.length() > index_allCharacters){
               newChar = allCharacters.charAt(index_allCharacters);
           } 
           else{newChar = allCharacters.charAt(0);}
           
          encrypted_string = encrypted_string.concat(newChar.toString());
        }
       
       return encrypted_string;
    }
    
    public String encrypt(String message, int n_specifier){
       String result = get_encryption(message, n_specifier);
       System.out.println(result);
       return result;
    }
   
    public static void main(String[] args){
      
   }
}
