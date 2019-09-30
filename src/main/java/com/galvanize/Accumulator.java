package com.galvanize;

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

}
