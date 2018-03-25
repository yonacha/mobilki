package com.example.s416201.zaj1dwa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by s416201 on 25.03.2018.
 */

public class Credentials {
        private String first;
        private String second;

        public void setFirst(String x){
            first = x;
        }
        public void setSecond(String x){
            second = x;
        }

        public void loadCred() throws FileNotFoundException {
            int licznik = 0;

            Scanner scanner = new Scanner(new File("src/Credentials.csv"));
            scanner.useDelimiter(",");
            while (scanner.hasNext()) {
                if (licznik == 0) {
                    setFirst(scanner.next());
                    licznik++;
                } else {
                    setSecond(scanner.next());
                }
            }
            scanner.close();
        }

        public String getFirst(){
            return first;
        }
        public String getSecond(){
            return second;
        }

}


