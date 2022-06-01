import java.util.*;

public class CountVowelsAndConsonants {
    public static void main(String args[]) {
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
        
        for (int index = 0; index < s.length(); index++) {            
            char letter = s.charAt(index);
            
            if (vowels.contains(letter)) {
                vowelsInString.add(letter);
            }
            else if (letter == ' ') {
                continue;
            }
            else {
                consonantsInString.add(letter);
            }
        }
        
        System.out.println(vowelsInString);
        System.out.println(consonantsInString);
        
        System.out.println("Number of vowels: " + vowelsInString.size());
        System.out.println("Number of consonants: " + consonantsInString.size());
    }
}
