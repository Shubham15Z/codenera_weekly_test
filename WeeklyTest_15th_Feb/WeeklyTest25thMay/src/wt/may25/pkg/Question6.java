/*
Q6. Calculate the frequency of each word in the given string using HashMap.
 */
package wt.may25.pkg;

import java.util.HashMap;
import java.util.Map;

public class Question6 {
    public static void main(String[] args) {
        String input = "this is a test this is only a test";

        Map<String, Integer> wordFrequency = calculateFrequency(input);

        System.out.println("Word Frequencies:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static Map<String, Integer> calculateFrequency(String text) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        
        String[] words = text.split("\\s+");

        for (String word : words) {
            word = word.toLowerCase();
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        return frequencyMap;
    }
}
