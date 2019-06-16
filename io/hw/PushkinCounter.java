package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;

public class PushkinCounter {
    private static String PATH = "C:\\Users\\Loki\\IdeaProjects\\JavaHomeWork\\src\\io";

    public static Map<Character, Integer> readText() throws IOException {
        Map<Character, Integer> letters = new TreeMap<>();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(PATH + "\\anchar"))){
            String line;
            while ((line = reader.readLine()) != null) {
                for (char letter : line.replaceAll("\\s+", "").toLowerCase().toCharArray()) {
                    if (letters.get(letter) == null) {
                        letters.put(letter, 1);
                    } else {
                        letters.put(letter, letters.get(letter) + 1);
                    }
                }
                line.toCharArray();
            }
        }
        try (BufferedWriter out = new BufferedWriter(new FileWriter(PATH + "\\anchar.txt"))){
            for (Map.Entry<Character, Integer> entry : letters.entrySet()) {
                out.write(entry.getKey() + " - " + entry.getValue() + "\n");
            }
        }
        return letters;
    }
}
