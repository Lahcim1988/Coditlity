package codility.lessons.lesson_4.frogRiverOne;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int solution(int X, int[] A) {

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= X) set.add(A[i]);
            if (set.size() == X) return i;
        }
        return -1;
    }
}

