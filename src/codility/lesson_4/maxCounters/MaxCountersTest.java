package codility.lesson_4.maxCounters;

import org.junit.jupiter.api.Assertions;

class MaxCountersTest {

    private MaxCounters maxCounters = new MaxCounters();

    @org.junit.jupiter.api.Test
    void solution() {
        int [] output = {3,4,4,6,1,4,4};
        int [] expected = {3,2,2,4,2};
        int N = 5;
        Assertions.assertArrayEquals(expected, maxCounters.solution(N, output));

    }

    @org.junit.jupiter.api.Test
    void solution2() {
        int [] output = {3,4,4,6,1,4,4};
        int [] expected = {3,2,2,4,2};
        int N = 5;
        Assertions.assertArrayEquals(expected, maxCounters.solution(N, output));

    }

    @org.junit.jupiter.api.Test
    void solution3() {
        int [] output = {3,4,4,6,1,4,4};
        int [] expected = {3,2,2,4,2};
        int N = 5;
        Assertions.assertArrayEquals(expected, maxCounters.solution(N, output));

    }
}
