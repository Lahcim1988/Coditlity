package codility.lesson_2.oddOccurrencesInArray;

import java.util.HashSet;
import java.util.Set;

// Detected time complexity: O(N) or O(N*log(N))
// 100%

public class SolutionSet {

    public static void main(String[] args) {

        int[] tab = {9, 3, 9, 3, 9, 7, 9};

        SolutionSet solution = new SolutionSet();

        System.out.println(solution.solution(tab));

    }

    public int solution(int[] A) {

        Set<Integer> ints = new HashSet<>();

        for (int i : A) {
            if (ints.contains(i)) {
                ints.remove(i);
            } else {
                ints.add(i);
            }
        }

        for (int a : ints) {
            return a;
        }
        return 0;
    }
}
