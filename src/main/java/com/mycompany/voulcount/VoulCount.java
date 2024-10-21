/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.voulcount;

/**
 *
 * @author RC_Student_lab
 */
public class VoulCount {

    
    public static int countVowels(String sentence) {
        
        String lowerCaseSentence = sentence.toLowerCase();
        int vowelCount = 0;

        
        String vowels = "aeiou";

       
        for (int i = 0; i < lowerCaseSentence.length(); i++) {
            
            char currentChar = lowerCaseSentence.charAt(i);
            
            
            if (vowels.indexOf(currentChar) != -1) {
                vowelCount++;
            }
        }

        return vowelCount;
    }

    
}

