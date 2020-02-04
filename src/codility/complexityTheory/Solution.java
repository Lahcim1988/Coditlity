package codility.complexityTheory;

import static java.util.Arrays.copyOf;

public class Solution {

    static int[] tab1 = {3, 1, 4, 2, 7};

    static int[] tab2 = {8, 2, 5, 4, 6};

    public static int[] res(int[] tab1, int[] tab2) {

        int[] res = new int[0];
        int c = 0;

        for (int value : tab1) {
            for (int i : tab2) {
                if (value == i) {
                    res = copyOf(res, c + 1);
                    res[c] = value;
                    c++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {

        int[] result = Solution.res(tab1, tab2);

        for (int value : result) {
            System.out.println(value);
        }
        System.out.println();
    }
}
