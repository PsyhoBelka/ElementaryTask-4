package ua.rozhkov;

import com.sun.deploy.util.StringUtils;

import java.io.*;
import java.util.Scanner;

public class FileParser {

    String fileString = "";

    private void readFile(String source) {

        try {
            FileReader fileReader = new FileReader(source);
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNext()) {
                fileString += scanner.nextLine();
            }
            fileReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
        catch (IOException e) {
            System.out.println("Error in file opening!");
        }
    }

    public int parseF(String source, String strCount) {

        int count = 0;
        readFile(source);
        if (fileString.contains(strCount)) {
            int tmpIndex = 0;
            while (tmpIndex >= 0) {
                tmpIndex = fileString.indexOf(strCount, tmpIndex + strCount.length());
                if (tmpIndex < 0) {
                    break;
                } else {
                    count++;
                }
            }
        }
        return count;
    }

    public void parseF(String source, String strSearch, String strReplace) {

        readFile(source);
        if (fileString.contains(strSearch)) {
            fileString.replace(strSearch, strReplace);
        }
    }
}
