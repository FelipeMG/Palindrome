package com.felipemg.palindrome;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class PalindromeTest {

    @Test
    public void emptyStringIsPalindrome(){
        assertThat(Sentence.isPalindrome(""),is(true));
    }


}
