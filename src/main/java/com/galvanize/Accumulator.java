package com.galvanize;

import java.util.List;

public class Accumulator {

    int sum(List<Integer> input) {
        int result = 0;

        for (int number : input) {
            result += number;
        }

        return result;

    }
}
