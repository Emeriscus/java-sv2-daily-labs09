package day02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringListsTest {

    @Test
    void shortestWordsTest() {

        StringLists stringLists = new StringLists();
        List<String> words = Arrays.asList("aaa", "aa", "bb", "cccc", "dd");

        List<String> expected = stringLists.shortestWords(words);

        assertEquals(3, expected.size());
        assertEquals("bb", expected.get(1));
    }
}