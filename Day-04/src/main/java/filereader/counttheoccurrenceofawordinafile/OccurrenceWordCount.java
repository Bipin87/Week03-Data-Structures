package filereader.counttheoccurrenceofawordinafile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class OccurrenceWordCount {
    public static int countOccurrenceWord(String fileName, String word){

        String myPath = "src/main/java/filereader/counttheoccurrenceofawordinafile/" + fileName;
        int count = 0;
        try{
            BufferedReader bfr = new BufferedReader(new FileReader(myPath));
            String str;
            try {
                while((str = bfr.readLine()) != null ){
                    // split by whitespace
                    String [] words = str.split("\\s+");
                    for (String w : words) {
                        if (w.equalsIgnoreCase(word)) count++;
                    }
                }
            }
            catch (IOException e){
                System.out.println("Error occurred IO Exception " + e.getMessage());
            }


        }
        catch (FileNotFoundException e) {
            System.out.println("Exception occurred File Not Found " + e.getMessage());
        }
        return count;
    }

}
