package day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringLists {

    public List<String> shortestWords(List<String> words) {

        List<Integer> wordsLenghts = new ArrayList<>();
        for (String actual : words) {
            wordsLenghts.add(actual.length());
        }

        int minLength = Integer.MAX_VALUE;
        for (Integer actual : wordsLenghts) {
            if (actual < minLength) {
                minLength = actual;
            }
        }

        List<String> result = new ArrayList<>();
        for (String actual : words) {
            if (actual.length() == minLength) {
                result.add(actual);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        StringLists stringLists=new StringLists();
        List<String> words= Arrays.asList("aaa", "aa", "bb", "cccc", "dd");

        System.out.println(stringLists.shortestWords(words));
    }
}
