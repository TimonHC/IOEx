package com.company;

import org.w3c.dom.Text;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        String buffer = "";
        Scanner scanner = new Scanner(new File("Files\\Shakespeare.txt"));
        while(scanner.hasNext()){
        buffer += (scanner.nextLine() + "\r\n");}

        FileWorker.write("Files\\ShakspeareEdited.txt", FileWorker.textEveryWordFirstLetterToUpperCase(buffer));
        FileWorker.write("Files\\TextWithDeletedWords.txt", FileWorker.deleteFromTextSelectedArg(buffer));

    }
}