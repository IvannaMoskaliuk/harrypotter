/*
 * Classname Main
 *
 * Version info 1
 *
 * Copyright Moskaliuk Ivanna KNUTE
 */
package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        String text = new String(Files.readAllBytes(Paths.get("C:\\java\\" +
                "harrypotter\\harry.txt")));

 /*       String cleanerText = text
                .replaceAll("\\.", "")
                .replaceAll(",", "")
                .replaceAll("\"", "")
                .replaceAll("!", "")
                .replaceAll(";", "")
                .replaceAll(":", "")
                .replaceAll("\\(", "")
                .replaceAll("\\)", "")
                .replaceAll("\\?", "");
*/
        String cleanerText = text.toLowerCase();

        String[] words = cleanerText.split("\\W+");

        String distinktString = " ";

        for (int i = 0; i < words.length; i++) {

            if (!distinktString.contains(words[i])) {
                distinktString += words[i] + " ";
            }
        }

        //System.out.println(distinktString);

        String[] distrinctArray = distinktString.split(" ");
        Arrays.sort(distrinctArray);

        for (int i = 0; i < distrinctArray.length; i++) {
            System.out.println(distrinctArray[i]);
        }
    }
}
