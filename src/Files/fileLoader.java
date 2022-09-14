package Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class fileLoader {

    private final String FILENAME="/Users/mdziuba/Downloads/namespl.txt";
    private final int BEGINNINGTABLELENGTH = 0;
    public String[] fileLoader() throws IOException {


        var fileReader = new FileReader(FILENAME);
        var bufferedFileReader = new BufferedReader(fileReader);
        String nextLine = null;
        int index = 0;
        String[] names = new String[BEGINNINGTABLELENGTH];
        while ((nextLine = bufferedFileReader.readLine()) != null){
            names = Arrays.copyOf(names, names.length+1);
            names[index] = nextLine;
            index++;
        }
        return names;

    }
}
