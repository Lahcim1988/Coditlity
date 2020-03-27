package codility.others.numberWhichDontRepeatPrimeTimes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2 {

    public static void main(String[] args) {

        int[] table1 = {2, 3, 9, 2, 5, 1, 3, 7, 10};
        int[] table2 = {2, 1, 3, 4, 3, 10, 6, 6, 1, 7, 10, 10, 10};
        int[] C = {2, 9, 2, 5, 7, 10};


//87690400
//499376
        long startTime = System.nanoTime();

        System.out.println(Arrays.toString(getNumberWhichDontRepeatPrimeTimes(table1, table2)));


        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);



        /*int[] table3 = {1, 2, 3, 4, 5};
        int[] table4 = {1, 1, 1, 1, 1, 1, 1, 2, 4, 4, 5, 5, 5, 5, 5, 5, 5};
        int[] F = {2, 3};

        System.out.println(Arrays.toString(getNumberWhichDontRepeatPrimeTimes(table3, table4)));*/
    }

    // O(n) or O(n) + (n)logn
    public static Object[] getNumberWhichDontRepeatPrimeTimes(int[] table1, int[] table2) {
        List<Integer> result = new ArrayList<>();
        for (int number1 : table1) {
            if (result.contains(number1)) {
                result.add(number1);
            } else {
                int countOfNumber1inTable2 = ((int) Arrays.stream(table2).filter(number2 -> number2 == number1).count());
                if ((countOfNumber1inTable2 == 0) || (countOfNumber1inTable2 == 1)) {
                    result.add(number1);
                } else if (countOfNumber1inTable2 == 2) {
                    continue;
                } else {
                    for (int i = 2; i <= countOfNumber1inTable2 / 2; i++) {
                        if (countOfNumber1inTable2 % i == 0) {
                            result.add(number1);
                        }
                    }
                }
            }
        }
        return result.toArray();
    }
}
