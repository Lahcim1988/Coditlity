package codility.lessons.lesson_4.frogRiverOne;

import java.util.HashSet;
import java.util.Set;

public class Solution2 {
    public int solution(int X, int[] A) {
        Set requiredLeavesSet = new HashSet();
        for (int i = 0; i <= X; i++) {
            requiredLeavesSet.add(i);
        }

        Set currentLeavesSet = new HashSet();

        for (int i = 0; i < A.length; i++) {
            currentLeavesSet.add(A[i]);
            if (currentLeavesSet.size() < requiredLeavesSet.size()) continue;

            if (currentLeavesSet.containsAll(requiredLeavesSet)) {
                return i;
            }
        }
        return -1;
    }
}
