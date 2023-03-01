package org.example.task1;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.HashMap;
import java.util.Map;

/**
 * Подсчитать количество вхождения каждого слова
 * Пример:
 * Россия идет вперед всей планеты. Планета — это не Россия.
 * toLoverCase().
 */
public class Main {


    public static void main(String[] args) {
        Map<String, Integer> valWords = new HashMap<>();
        String str = "Россия идет вперед всей планеты. Планета - это не Россия.";
        str = str.toLowerCase().replaceAll("\\p{Punct}", "");
        String[] words = str.split("\\s+");
        for (String word : words) {
            if (valWords.containsKey(word)){
                valWords.put(word, valWords.get(word) + 1);
            }
            else {valWords.put(word, 0);}
        }

        for (String word : valWords.keySet())
        {
            System.out.println(word + " " + valWords.get(word));
        }

    }
}
