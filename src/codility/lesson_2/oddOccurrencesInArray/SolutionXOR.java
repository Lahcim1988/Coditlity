package codility.lesson_2.oddOccurrencesInArray;

// 100 %
// Detected time complexity: O(N) or O(N*log(N))

// Binary XOR Operator copies the bit if it is set in one operand but not both.

// ^ (bitwise XOR)

public class SolutionXOR {

    public static void main(String[] args) {

        int [] tab = {9, 3, 9, 3, 9, 7, 9};

        SolutionXOR solution = new SolutionXOR();

        System.out.println(solution.solution(tab));

    }

    public int solution(int[] A) {

        int singleElement = 0;

        for (int i = 0; i < A.length; i++) {
            singleElement ^= A[i];
        }
        return singleElement;
    }

}
