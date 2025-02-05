package filereader.counttheoccurrenceofawordinafile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static filereader.counttheoccurrenceofawordinafile.OccurrenceWordCount.countOccurrenceWord;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String fileName = "OccurrenceWord.txt";
            System.out.println("Enter the word: ");
            String word = br.readLine();
            // Handle the io exception
            System.out.println(countOccurrenceWord(fileName, word));
        }
        catch(IOException e){
            System.out.println("Error Occurred " + e.getMessage());
        }
    }
}
