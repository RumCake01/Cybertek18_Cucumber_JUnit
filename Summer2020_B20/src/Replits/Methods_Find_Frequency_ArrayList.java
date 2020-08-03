package Replits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Methods_Find_Frequency_ArrayList {


        public static int getDuplicates(String[] r) {
            int count = 0;
            int result = 0;

            ArrayList<String> getEach = new ArrayList<>(Arrays.asList(r));

            for (int i = 0; i <= getEach.size() - 1; i++) {
                count = Collections.frequency(getEach, r[i]);
                if (count > 1) {
                    result++;
                }
                result = 0;
            }
            return result;
        }
    }

