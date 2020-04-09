package codility.lessons.lesson_4.frogRiverOne;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void asd() {
        int actual = solution.solution(3, new int[]{2, 1, 3});

        Assertions.assertEquals(2, actual);
    }

    // If never happen

    @Test
    void asd2() {
        int actual = solution.solution(3, new int[]{1, 1, 1});

        Assertions.assertEquals(-1, actual);
    }

    @Test
    void asd3() {
        int actual = solution.solution(2, new int[]{2, 2, 2, 2, 2});

        Assertions.assertEquals(-1, actual);
    }

    @Test
    void asd4() {
        int actual = solution.solution(3, new int[]{1, 3, 1, 3, 2, 1, 3});

        Assertions.assertEquals(4, actual);
    }
}
