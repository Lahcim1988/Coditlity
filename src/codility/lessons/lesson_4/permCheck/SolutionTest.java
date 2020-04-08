package codility.lessons.lesson_4.permCheck;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void test1(){
        int [] input = {1, 2, 3, 4, 5};
        int result = solution.solution(input);

        Assertions.assertEquals(1, result);
    }

    @Test
    void test2(){
        int [] input = {2, 3, 4, 5};
        int result = solution.solution(input);

        Assertions.assertEquals(0, result);
    }

    @Test
    void test3(){
        int [] input = {1, 2, 3, 4, 5, 7, 8, 9, 10, 11};
        int result = solution.solution(input);

        Assertions.assertEquals(0, result);
    }

    @Test
    void test4(){
        int [] input = {9, 5, 7, 3, 2, 7, 3, 1, 10, 8};
        int result = solution.solution(input);

        Assertions.assertEquals(0, result);
    }

    @Test
    void test5(){
        int [] input = {1, 2, 3, 4, 5, 7, 8, 9, 10, 11};
        int result = solution.solution(input);

        Assertions.assertEquals(0, result);
    }

    @Test
    void test6(){
        int [] input = {100_001};
        int result = solution.solution(input);

        Assertions.assertEquals(0, result);
    }

}
