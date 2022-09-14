package IO;

import Interfaces.Printer;

import java.util.TreeSet;

public class InOut implements Printer {

    public void InOut(TreeSet<String> set){
        print("Elements inside of TreeSet:");
        print(set);
        print("First Element:");
        print(set.first());
        print("Last Element:");
        print(set.last());

    }
}
