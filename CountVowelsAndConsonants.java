// CountVowelsAndConsonants.java
// Uses HashSets to count and display vowels and consonants
// in response to an input string from the user.
// Assume A, E, I, O, and U are the vowels. The same vowels
// or consonants are counted only once.
// The letters are case-insensitive.

import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

// counts unique vowels and consonants in a String
public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
       
        Character[] list1 = {'A', 'E', 'I', 'O', 'U'};
       
        // store our vowels and consonants in HashSets
        Set<Character> vowels = new HashSet<>(Arrays.asList(list1));
        Set<Character> vowelsInString = new HashSet<>();
        Set<Character> consonantsInString = new HashSet<>();
       
        int numberOfVowels = 0;
        int numberOfConsonants = 0;
       
        for (int i = 0; i < s.length(); i++) {
              char ch = Character.toUpperCase(s.charAt(i));
             
              // if current character is not a letter, don't do anything   
              if (Character.isLetter(ch)) {
                    if (vowels.contains(ch)) {
                         // found a vowel, see if we've already counted it
                         if (!vowelsInString.contains(ch)) {
                            vowelsInString.add(ch);
                            numberOfVowels++;
                         }
                    }
                    // else we have a consonant, see if it is already counted
                    else if (!consonantsInString.contains(ch)) {
                        consonantsInString.add(ch);
                        numberOfConsonants++;
                    }
              }
        }
    
        System.out.println("The number of vowels is " + numberOfVowels);
        System.out.println("The number of consonants is " + numberOfConsonants);
    }
}
