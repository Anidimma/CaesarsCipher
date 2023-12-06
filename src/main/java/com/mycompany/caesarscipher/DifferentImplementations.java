/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caesarscipher;

import java.lang.String;
import java.util.Vector;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.function.Consumer;

/**
/**
 *
 * @author Divin
 */
public class DifferentImplementations {
    public static void main(String[] args){
       String inputString = "bannanna";
//       Vector<Character> inputVector = new Vector<>();
//       char[] inputChar = inputString.toCharArray();
//       ArrayList<Character> inputArrayList = new ArrayList<>();
//       
//       IntStream.range(0,inputChar.length).forEach(i -> {inputVector.add(inputChar[i]);});
//       
//       System.out.println(inputVector);
//       
//       Vector<String> inputVector2 = new Vector<>(Arrays.asList("bsds","retr","toer"));
//       
//       inputVector2.replaceAll(String::toUpperCase);
//       System.out.println(inputVector2);
//       char[] charArray = inputString.toCharArray();
//       Vector<Character> charVector = new Vector<>();
//       
//       IntStream.range(0, charArray.length).forEach(i -> {
//           System.out.println("Index: " + i + " Character: " + charArray[i]);
//       });
//       
       HashMap<Integer, Character> charMap = new HashMap<>();
       charMap.put(1,'a');
       charMap.put(2,'b');
       charMap.put(3,'c');
       
       System.out.println(charMap.get(1));
       
       charMap.compute(1, (k, v) -> (v == null) ? 'e' :'d');
       System.out.println(charMap);
       charMap.forEach((k,v) -> System.out.println(v));
       
       
//       ArrayList<Integer> numbers = new ArrayList<>();
//       IntStream.range(0, 9).forEach(i -> {numbers.add(i);});
//       numbers.forEach(i -> {System.out.println(i);});
//       IntStream.range(2, 16)
//                .forEach(System.out::println);
       
   
       
    }
}
