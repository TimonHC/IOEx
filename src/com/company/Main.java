package com.company;

import org.w3c.dom.Text;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        int menuChoose;
        System.out.println("MENU\n1: use existing text\n2: user input\n(double enter to confirm)");
        Scanner scanner = new Scanner(System.in);



            switch (menuChoose = scanner.nextInt()){
            case (1): TextWorker.buffer = (TextWorker.useExistingText());
            break;
            case (2): TextWorker.buffer = TextWorker.readTextFromTheUserInput();
            break;
            default: break;
        }


        System.out.println("MENU\n1: to upper case\n2: delete selected arg from txt:");
        switch (menuChoose = scanner.nextInt()){
            case (1):
                FileWorker.write("Files\\FirstLetterToUppEditedText.txt", TextWorker.textEveryWordFirstLetterToUpperCase(TextWorker.buffer));
                FileWorker.print("Files\\FirstLetterToUppEditedText.txt");
                break;
            case (2):
                FileWorker.write("Files\\TextWithDeletedWords.txt", TextWorker.deleteFromTextSelectedArg(TextWorker.buffer));
                FileWorker.print("Files\\TextWithDeletedWords.txt");
                break;
            default: break;
        }
    }
}
