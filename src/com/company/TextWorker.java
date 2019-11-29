package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.StringJoiner;

public class TextWorker {
    static String buffer = "";
    private static String SOURCE_TEXT_PATH = ("Files\\Shakespeare.txt");

    public static String useExistingText() throws IOException {
        String buffer = new String(Files.readAllBytes(Paths.get(SOURCE_TEXT_PATH)));
        return buffer;
    }
    public static String readTextFromTheUserInput(){
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        String buffer;
        while (!(buffer = scanner.nextLine()).isEmpty()) {
            stringBuilder.append("\n"+buffer);
            }
        buffer = stringBuilder.toString();
        return buffer;
    }
    public static String textEveryWordFirstLetterToUpperCase(String buffer) {
        //defines the delimiter between to concat the edited words
        StringJoiner joiner = new StringJoiner(" ");
        //loop through text and splits it on words
        for (String word : buffer.split(" ")) {
            //changes first letter in every word  to uppercase
            word = word.substring(0, 1).toUpperCase() + word.substring(1);
            //concats all edited words to text
            joiner.add(word);
            buffer = joiner.toString();
        }
        return buffer;
    }
    public static String deleteFromTextSelectedArg(String text){
        Scanner scanner = new Scanner(System.in);
        //select string to delete from source text
        String toDelete = scanner.nextLine();
        //loop through source text and replace choosed string to delete and space after it with empty string
        text = text.replace(toDelete+" ", "");
        return text;
    }
}
