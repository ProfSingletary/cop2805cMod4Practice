//HashSets.java
//Alan Schmitt
//May 20th, 2019

import java.util.*;

public class HashSets
{
    public static void main(String args[])
    {
        System.out.print("Please enter a string: ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        s = s.toUpperCase();
        
        Character[] list1 = {'A','E','I','O','U'};
        
        Set<Character> vowels = new HashSet<>(Arrays.asList(list1));
        Set<Character> vowelsInString = new HashSet<>();
        Set<Character> consonantsInString = new HashSet<>();
        
        int vowelCount = 0;
        int consonantCount = 0;
        
        for (int index = 0; index < s.length(); index++)
        {            
            char letter = s.charAt(index);
            
            if (vowels.contains(letter))
            {
                vowelsInString.add(letter);
                //vowelCount++;
            }
            else if (letter == ' ')
            {
                continue;
            }
            else
            {
                consonantsInString.add(letter);
                //consonantCount++;
            }
        }
        
        System.out.println(vowelsInString);
        System.out.println(consonantsInString);
        
//        System.out.println("Number of vowels: " + vowelCount);
//        System.out.println("Number of consonants: " + consonantCount);
        
        System.out.println("Number of vowels: " + vowelsInString.size());
        System.out.println("Number of consonants: " + consonantsInString.size());
    }
}
