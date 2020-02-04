package codility.complexityTheory;

import java.util.Arrays;

import static java.util.Arrays.copyOf;

public class Solution2 {

    static int[] tab1 = {3, 1, 4, 2, 7};

    static int[] tab2 = {8, 2, 5, 4, 6};

    public static int [] res(int [] tab1, int [] tab2){

        Arrays.sort(tab1);
        Arrays.sort(tab2);

        int [] res = new int[0];
        int c = 0;

        for (int item : tab1) {
            for (int value : tab2) {
                if (item != value) {
                    continue;
                } else {
                    res = copyOf(res, c + 1);
                    res[c] = item;
                    c++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {

        int[] result = Solution2.res(tab1, tab2);

        for (int value : result) {
            System.out.println(value);
        }

        System.out.println();

    }

}
