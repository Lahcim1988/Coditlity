package codility.lessons.lesson_4.permCheck;

import org.junit.jupiter.api.Assertions;

class Solution2Test {

    Solution2 solution2 = new Solution2();

    @org.junit.jupiter.api.Test
    void asd() {
        int[] input = {4, 1, 3, 2};
        int result = solution2.solution(input);

        Assertions.assertEquals(1, result);
    }

    @org.junit.jupiter.api.Test
    void asd2() {
        int[] input = {1,2,3};
        int result = solution2.solution(input);

        Assertions.assertEquals(1, result);
    }

    @org.junit.jupiter.api.Test
    void asd3() {
        int[] input = {1, 2, 3, 4, 5, 7, 8, 9, 10, 11};
        int result = solution2.solution(input);

        Assertions.assertEquals(0, result);
    }

    @org.junit.jupiter.api.Test
    void asd4() {
        int[] input = {1, 2, 3, 4, 9999, 12345, 23535532};
        int result = solution2.solution(input);

        Assertions.assertEquals(0, result);
    }

    @org.junit.jupiter.api.Test
    void asd5() {
        int[] input = {9, 5, 7, 3, 2, 7, 3, 1, 10, 8};
        int result = solution2.solution(input);

        Assertions.assertEquals(0, result);
    }

    @org.junit.jupiter.api.Test
    void asd6() {
        int[] input = {2, 3, 4, 5};
        int result = solution2.solution(input);

        Assertions.assertEquals(0, result);
    }

    @org.junit.jupiter.api.Test
    void asd7() {
        int[] input = {1, 2, 3, 4, 5};
        int result = solution2.solution(input);

        Assertions.assertEquals(1, result);
    }

    @org.junit.jupiter.api.Test
    void asd8() {
        int[] input = {100001};
        int result = solution2.solution(input);

        Assertions.assertEquals(0, result);
    }
}
