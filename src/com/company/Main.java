package com.company;

import org.w3c.dom.Text;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        String buffer = "";
        int menuChoose;
        System.out.println("MENU\n1: use existing text\n2: user input('end' to exit)");
        Scanner scanner = new Scanner(System.in);

        switch (menuChoose = scanner.nextInt()){
            case (1): buffer = TextWorker.useExistingText();
            case (2): buffer = TextWorker.readTextFromTheUserInput();
            default: break;
        }

        System.out.println("MENU\n1: to upper case\n2: delete selected arg from txt");
        switch (menuChoose = scanner.nextInt()){
            case (1):
                FileWorker.write("Files\\ShakspeareEdited.txt", FileWorker.textEveryWordFirstLetterToUpperCase(buffer));
            case (2):
                FileWorker.write("Files\\TextWithDeletedWords.txt", FileWorker.deleteFromTextSelectedArg(buffer));
        }
    }
}
