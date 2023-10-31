package com.siva;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stream1 {
    public static void run() {
        String input = "ilovejavatechie";

        //Map of letters and their occurance.
        Map<String, Long> map = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);

        //List of repeating letters.
        List<String> duplicateElements = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(e -> e.getKey())
                .collect(Collectors.toList());
        System.out.println(duplicateElements);

        //List of unique letters
        List<String> uniqueElements = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(uniqueElements);

        //First non-repeating character in the string.

        Optional<String> firstNonRepeatingCharacter = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();

        firstNonRepeatingCharacter.ifPresentOrElse(e -> System.out.println("First non-repeationg character: " + e),
                () -> System.out.println("Non-repeating characters not found"));

        int numArr[] = { 5, 9, 11, 2, 8, 21, 1 };
        //Second highest number in the array.
        Optional<Integer> findFirst = Arrays.stream(numArr).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        findFirst.ifPresent(e -> System.out.println(e));

        //Find the numbers starting with one.
        List<Integer> numStartinWith1 = Arrays.stream(numArr)
                .boxed()
                .map(e -> e + "")
                .filter(e -> e.startsWith("1"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(numStartinWith1);

        String strArr[] = { "java", "techie", "springboot", "microservices" };
        //Finding the spring with largest size.
        Optional<String> largestStr = Arrays.stream(strArr)
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2);
        largestStr.ifPresent(e -> System.out.println(e));
    }
}
