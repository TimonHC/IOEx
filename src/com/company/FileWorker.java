package com.company;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringJoiner;

public class FileWorker {

    public static void write(String fileName, String text) {
        //define the file
        File file = new File(fileName);

        try {
            //checks is the file exists and creates it if not
            if(!file.exists()){
                file.createNewFile();
            }

            //PrintWriter provides the possibility to write in the file
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());

            try {
                //writes text in the file
                out.print(text);
            } finally {
                //we need to close the file, bcause data will be not written
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String textEveryWordFirstLetterToUpperCase(String text) {
        //defines the delimiter between to concat the edited words
        StringJoiner joiner = new StringJoiner(" ");
        //loop through text and splits it on words
        for (String word : text.split(" ")) {
            //changes first letter in every word  to uppercase
            word = word.substring(0, 1).toUpperCase() + word.substring(1);
            //concats all edited words to text
            joiner.add(word);
            text = joiner.toString();
        }
        return text;
    }
    public static String deleteFromTextSelectedArg(String text){
        Scanner scanner = new Scanner(System.in);
        //select string to delete from source text
        String toDelete = scanner.nextLine();
        //loop through source text and replace choosed string to delete and space after it with empty string
        text = text.replace(toDelete+" ", "");
        System.out.println(text);
        return text;
    }
}
