package Algorithms;

import java.util.Arrays;
import java.util.Collections;

public class GreedyAlgorithms {
    public static void main(String[] args) {
      /*     int[] digits = { 4, 7, 1, 4, 9, 2};
        System.out.println(maxNumberFormDigits(digits));*/

        int[] station = {0, 200, 375, 550, 750, 950};
        System.out.println(minStops(station, 400));
    }
    // O(log n)
    public static String maxNumberFormDigits(int [] digits){

        return String.join("", Arrays.stream(digits).boxed().sorted(Collections.reverseOrder())
                .map(String::valueOf).toArray(String[]::new));
       /* Arrays.sort(digits);

        String result = "";
        for(int i = digits.length-1; i >= 0; i--){
            result += digits[i];
        }
        return result;*/
    }
    public static int minStops(int[] stations, int capacity){
        int result = 0;
        int currentStop = 0;

        while (currentStop < stations.length - 1){
            int nextStop = currentStop;

            while (nextStop < stations.length - 1 && stations[nextStop + 1] - stations[currentStop] <= capacity){
               nextStop++;
            }
            if(currentStop == nextStop){
                System.out.println("impossible to get from A to B!");
                return -1;
            }
            if(nextStop < stations.length - 1){
                result ++;
            }
            currentStop = nextStop;
        }
        return result;
    }
}
