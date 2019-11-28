package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class TextWorker {
    private static final String SOURCE_FILE_NAME = "Files\\Shakespeare.txt";


    public static String useExistingText() throws IOException {
        String buffer = new String(Files.readAllBytes(Paths.get(SOURCE_FILE_NAME)));
        return buffer;
    }
    public static String readTextFromTheUserInput(){
        Scanner scanner = new Scanner(System.in);
        String buffer = "";
        String inputBuffer = "";
        while (!((inputBuffer = scanner.nextLine()).isEmpty())){
            String newString = ("\n" + inputBuffer);
            buffer+= (newString);
            System.out.println(buffer);
        }

        return buffer;
    }
}
