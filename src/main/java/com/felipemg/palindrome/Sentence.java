package com.felipemg.palindrome;

public final class Sentence{

    private Sentence(){
        throw new AssertionError("This class should not be instantiated");
    }

    public static boolean isPalindrome(String sentence) {
        if (removeSpecialCharacters(sentence)) {
            String readableLowerCaseSentence = readableSentence.toLowerCase();
            return isPalindromeStringWithoutSpecialCharacters(readableLowerCaseSentence);
        } else {
            return false;
        }
    }

    private static boolean removeSpecialCharacters(String sentence) {
        return sentence.chars().allMatch(b -> Character.isLetter(b)) ? true : false;
    }

    private static boolean isPalindromeStringWithoutSpecialCharacters(String sentence) {
        if(sentence.isEmpty() || isAOneCharacterSentence(sentence)){
            return true;
        }
        else if ( areFirstAndLastCharacterEqual(sentence) ){
            return isPalindromeStringWithoutSpecialCharacters(substringWithoutFirstAndLastCharacter(sentence));
        }
        else{
            return false;
        }
    }

    private static boolean isAOneCharacterSentence(String sentence) {
        return sentence.length() == 1;
    }

    private static boolean areFirstAndLastCharacterEqual(String sentence) {
        return sentence.charAt(0) == sentence.charAt(sentence.length()-1);
    }

    private static String substringWithoutFirstAndLastCharacter(String sentence) {
        return sentence.substring(1,sentence.length()-1);
    }
}
