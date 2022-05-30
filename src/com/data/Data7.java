package com.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
    Given is list of numbers: {5, 5, 3, 10, 3, 5).
    Your task is to return count of odd occurrence.
    Example:
    - 5 occurred 3 times
    - 3 occurred 2 times
    - 10 occurred 1 times
    The number of odd occurrence is 2.
 */

public class Data7 {
    public void data() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(5);
        numbers.add(3);
        numbers.add(10);
        numbers.add(3);
        numbers.add(5);

        System.out.println("Number of odd occurrences: " + countingOdd(numbers));
    }
    public static int countingOdd(List numbers){
        int countOfOdds = 0;

        Map<Object, Integer> countOfNumbers = new HashMap<>();
        for (Object i : numbers){
            if (countOfNumbers.get(i) == null){
                countOfNumbers.put(i, 1);
            } else {
                countOfNumbers.put(i, countOfNumbers.get(i)+1);
            }
        }

        for (Map.Entry<Object, Integer> entry : countOfNumbers.entrySet()){
            if ((entry.getValue() % 2) > 0){
                countOfOdds+=1;
            }
        }

        return countOfOdds;
    }
}
