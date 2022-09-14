package Data;

import Files.fileLoader;
import IO.InOut;
import Interfaces.Printer;

import java.io.IOException;
import java.util.Comparator;
import java.util.TreeSet;

public class Data implements Printer{
    fileLoader fl = new fileLoader();
    InOut io = new InOut();


    public void Data() throws IOException {

        String[] names = fl.fileLoader();
        sort sort = new sort();
        TreeSet<String> set = new TreeSet<>(sort);
        for (int i = 0; i < names.length; i++) {
            set.add(names[i]);
        }
        io.InOut(set);


    }

    private class sort implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return -o1.compareTo(o2);
        }
    }
}
