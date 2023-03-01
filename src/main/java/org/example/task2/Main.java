package org.example.task2;


import java.util.HashMap;
import java.util.Map;

/**
 * Подсчитать количество искомого слова, через map
 * (наполнением значение, где искомое слово будет являться ключом)
 */
public class Main {
    public static int findCountWord(String str, String wordKey){
        wordKey = wordKey.toLowerCase();
        Map<String, Integer> valWords = new HashMap<>();
        str = str.toLowerCase().replaceAll("\\p{Punct}", "");
        String[] words = str.split("\\s+");

        Integer count = 0;

        for (String word : words) {
            if (wordKey.equals(word)) {
                count = valWords.getOrDefault(wordKey, 0);
                valWords.put(word, ++count);
            }
        }
        return count;
    }
    public static void main(String[] args) {

        System.out.println(findCountWord("Россия идет вперед всей планеты. Планета - это не Россия.", "Россия"));
        System.out.println(findCountWord("Россия россия россия Россия.","Россия"));
        System.out.println(findCountWord("Россия", "Россия"));
        System.out.println(findCountWord("Идёт","Россия"));

    }
}
