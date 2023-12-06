/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.caesarscipher;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
/**
 *
 * @author Divin
 */
public class CaesarsCipherTest {
    CaesarsCipher my_cipher = new CaesarsCipher("I AM BATMAN!!! Yeah 888");
    @Test
    void test_takesNegativeSpecifier(){
        String result = my_cipher.encrypt(my_cipher.getMessage(), -94);
        assertNotNull(result);
    }
    @Test
    void test_nNumberSpecifier(){
        String result = my_cipher.encrypt(my_cipher.getMessage(), -7);
        String result2 = my_cipher.encrypt(my_cipher.getMessage(), -10);
        String result3 = my_cipher.encrypt(my_cipher.getMessage(), -14);
        assertNotNull(result);
        assertNotNull(result2);
        assertNotNull(result3);
    }
    @Test
    void test_TakesInput(){
        assertNotNull(my_cipher.getMessage());
    }
    @Test
    void test_Encryption(){
        assertNotEquals(my_cipher.getMessage(),my_cipher.encrypt(my_cipher.getMessage(),3));
    }
    
    @Test
    void testInputExists(){
        assertNotNull(my_cipher.getMessage());
    }
    
    @Test
    void testInputType(){
        assertTrue(my_cipher.getMessage() instanceof String);
    }
    
    @Test
    void test_EncryptReturns(){
        assertNotNull(my_cipher.encrypt(my_cipher.getMessage(),8));
    }
    
    @Test
    void test_lenIO(){
        assertEquals(my_cipher.getMessage().length(), my_cipher.encrypt(my_cipher.getMessage(),1).length());
    }
    
    @Test
    void test_differentIO(){
        assertFalse(my_cipher.getMessage().contains(my_cipher.encrypt(my_cipher.getMessage(),4)));
    }
    
    @Test
    void testOutputType(){
        assertTrue(my_cipher.encrypt(my_cipher.getMessage(),1) instanceof String);
    }
    
    
  
    
}
