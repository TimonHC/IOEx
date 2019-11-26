package com.company;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringJoiner;

public class FileWorker {

    public static void write(String fileName, String text) {
        //Определяем файл
        File file = new File(fileName);

        try {
            //проверяем, что если файл не существует то создаем его
            if(!file.exists()){
                file.createNewFile();
            }

            //PrintWriter обеспечит возможности записи в файл
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());

            try {
                //Записываем текст у файл
                out.print(text);
            } finally {
                //После чего мы должны закрыть файл
                //Иначе файл не запишется
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String textEveryWordFirstLetterToUpperCase(String text) {
        StringJoiner joiner = new StringJoiner(" ");
        for (String word : text.split(" ")) {
            word = word.substring(0, 1).toUpperCase() + word.substring(1);
            joiner.add(word);
            text = joiner.toString();
        }
        return text;
    }

}
