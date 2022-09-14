package App;



import Data.Data;

import java.io.IOException;

public class AppControler {
    Data data = new Data();
    public void AppControler(){
        try {
            data.Data();
        }
        catch (IOException e){
            System.err.println("File not loaded");
        }

    }
}
