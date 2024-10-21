/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.voulcount;

/**
 *
 * @author RC_Student_lab
 */
public class VoulCount {

    
   // Method to count vowels in a given string
    public static int countVowels(String sentence) {
        // Convert the sentence to lowercase
        String lowerCaseSentence = sentence.toLowerCase();
        int vowelCount = 0;

        // String containing all the vowels
        String vowels = "aeiou";

        // Iterate through each character of the sentence
        for (int i = 0; i < lowerCaseSentence.length(); i++) {
            // Get the current character
            char currentChar = lowerCaseSentence.charAt(i);
            
            // Check if the character is a vowel by looking for its index in the 'vowels' string
            if (vowels.indexOf(currentChar) != -1) {
                vowelCount++;
            }
        }

        return vowelCount;
    }

    public static void main(String[] args) {
        // Test the function
        String sentence = "Hello, how many vowels are here?";
        int numberOfVowels = countVowels(sentence);
        System.out.println("Number of vowels in the sentence: " + numberOfVowels);
    }
}

