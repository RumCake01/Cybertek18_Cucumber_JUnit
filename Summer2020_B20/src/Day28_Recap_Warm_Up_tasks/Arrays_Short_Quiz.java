package Day28_Recap_Warm_Up_tasks;

import java.util.Arrays;

public class Arrays_Short_Quiz {
    public static void main(String[] args) {
        char [] array = {'D', 'C', 'A', 'B'};
        Arrays.sort(array);

        for(char each : array){
            System.out.println(each + "");
            if(each == 'D'){
                continue;// prints ABCD and skips eveything else after that
            }
        }
        System.out.println("===========================");
        int wd = 0;
        String [] days = {"sun", "mon", "wed", "sat"};

        for (int b = 0; b<days.length; b++){
            switch (days[b]){
                case "sat":
                case "sun":
                    wd-=1;
                    break;
                case"mon":
                    wd++;
                case "wed":
                    wd +=2;
            }
        }
        System.out.println(wd);
        System.out.println("===========================");
        int [] intArr = {15, 30, 45, 60, 75};
        intArr [2] = intArr[4]; // at index 2 we assign the value of index 4 which is 75
        // so index 2 now equal to 75
        intArr[4] =90;
        // now we assign 90 value to the index 4 which was 75, now became 90
        System.out.println(Arrays.toString(intArr));
        System.out.println("===========================");

    int arr[] = {1,2 ,3 ,4};

    int i = 0;
    do{
        System.out.println(arr[i] + "");
        i++;

    }while (i<arr.length-1);


    }
}
