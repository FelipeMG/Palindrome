package com.felipemg.palindrome;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class PalindromeTest {

    @Test
    public void emptyStringIsPalindrome(){
        assertThat(Sentence.isPalindrome(""),is(true));
    }

    @Test
    public void oneCharacterStringIsPalindrome(){
        assertThat(Sentence.isPalindrome("a"),is(true));
    }

    @Test
    public void abIsNotPalindrome(){
        assertThat(Sentence.isPalindrome("ab"),is(false));
    }

    @Test
    public void abaIsPalindrome(){
        assertThat(Sentence.isPalindrome("aba"),is(true));
    }

    @Test
    public void abbaIsPalindrome(){
        assertThat(Sentence.isPalindrome("abba"),is(true));
    }

    @Test
    public void readerIsNotPalindrome(){
        assertThat(Sentence.isPalindrome("reader"),is(false));
    }

    @Test
    public void radarIsPalindrome(){
        assertThat(Sentence.isPalindrome("radar"),is(true));
    }

    @Test
    public void aStringWithSpacesCanAlsoBePalindrome(){
        assertThat(Sentence.isPalindrome("anita lava la tina"),is(true));
    }

    @Test
    public void aStringWithSpacesAndSpecialCharactersCanAlsoBePalindrome(){
        assertThat(Sentence.isPalindrome("¡anita, lava, la tina!"),is(true));
    }

    @Test
    public void aStringWithCapitalLettersCanAlsoBePalindrome(){
        assertThat(Sentence.isPalindrome("¡anita, lava, la Tina!"),is(true));
    }

}
