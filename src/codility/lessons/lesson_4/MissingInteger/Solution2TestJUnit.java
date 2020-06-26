package codility.lessons.lesson_4.MissingInteger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution2TestJUnit {

    @Test
    public void asd() {
        Solution2 solution = new Solution2();

        int[] ints = new int[100000];
        for (int i = 0; i < 100000; i++) {
            ints[i] = i + 1;
        }

        int solution1 = solution.solution(ints);

        Assertions.assertEquals(100001, solution1);
    }

}
