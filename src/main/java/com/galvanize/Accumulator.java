package com.galvanize;

import com.sun.tools.javac.util.StringUtils;
import java.util.ArrayList;
import java.util.List;

public class Accumulator {

    // EXAMPLE No. 1
    int sum(List<Integer> input) {
        int result = 0;

        for (int number : input) {
            result += number;
        }

        return result;
    }

    // EXAMPLE No. 2
    List<String> shortWords(String input, int maxLength) {
        ArrayList<String> result = new ArrayList<>();

        String[] words = input.split(",");

        for (String word : words) {
            if (word.length() < maxLength) {
                result.add(word);
            }
        }

        return result;
    }

    // Test Question
    String toSentence(String[] test) {
        String result = "";
        int totalSize = test.length;
        int limit = totalSize - 1;
        String seperator = ", ";
        String finalSeperator = "and ";
        if (totalSize > 1) {
            String concat;
            String next;
            for(int i = 0; i < limit; i++) {
                next = test[i] + seperator;
                concat = result + next;
                result = concat;
            }
            next = finalSeperator + test[limit];
            concat = result + next;
            result = concat;
        }

        return result;
    }

}
