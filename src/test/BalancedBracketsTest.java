package test;

import org.junit.Test;

import static main.BalancedBrackets.hasBalancedBrackets;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void emptyString () {

        assertTrue(hasBalancedBrackets(""));

    }

    @Test
    public void simpleBracket () {

        assertTrue(hasBalancedBrackets("[]"));

    }

    public void simpleBracketWithWordsBetween () {

        assertTrue(hasBalancedBrackets("[LaunchCode]"));

    }

    @Test
    public void wordsWithBracketsInTheMiddle () {

        assertTrue(hasBalancedBrackets("Launch[Code]"));

    }

    @Test
    public void bracketsWithWordsAfter () {

        assertTrue(hasBalancedBrackets("[]LaunchCode"));

    }

    @Test
    public void incompleteBracket () {

        assertFalse(hasBalancedBrackets("["));

    }

    @Test
    public void incompleteBracketWithWordsAfter () {

        assertFalse(hasBalancedBrackets("[LaunchCode"));

    }

    @Test
    public void reversedBracket () {

        assertFalse(hasBalancedBrackets("]["));

    }

    @Test
    public void wordsWithReverseBracket () {

        assertFalse(hasBalancedBrackets("]LaunchCode["));

    }

    @Test
    public void wordsWithReverseBracketInTheMiddle () {

        assertFalse(hasBalancedBrackets("Launch]Code["));

    }

    @Test
    public void properlyNestedBrackets () {

        assertTrue(hasBalancedBrackets("[[][][][][][][][[[]]]]"));

    }

    @Test
    public void improperNestedBrackets () {

        assertFalse(hasBalancedBrackets("[[][][][][]]][][][][][][][][]][][][][][[]][]]][][][]"));

    }

    @Test
    public void bracketsWithEverythingInThem () {

        assertTrue(hasBalancedBrackets("[asdiheruifh[i]ew8r[[yu98]23y4v 8923r4786 y87 ryft87hs7x8]rfuighvbhdbfv()&*#($&(*@#&(*$&@(#*()@*#()&@*#)]"));

    }

}
