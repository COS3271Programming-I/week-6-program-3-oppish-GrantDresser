// oopish.java
// Grant Dresser
// 2/27/2026

import java.util.Scanner;

public class oppish {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine().toLowerCase();

        for (int i = 0; i < sentence.length(); i++) {

            char current = sentence.charAt(i);
            System.out.print(current);

            // check if current letter is a consonant
            if (isConsonant(current)) {

                // IF next letter ends consonant group 
                if (i == sentence.length() - 1 ||
                    !isConsonant(sentence.charAt(i + 1))) {

                    System.out.print("opp");
                }
            }
        }

        input.close();
    }

    // check consonant 
    public static boolean isConsonant(char c) {
        return Character.isLetter(c) &&
               "aeiouy".indexOf(c) == -1;
    }
}