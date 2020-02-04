package codility.sortingAlgorithms;

import java.util.Arrays;

public class Solution100 {

    public static void main(String[] args) {

        Solution100 solution100 = new Solution100();
        int [] A = {1, 5, 2, 1, 4, 0};
        System.out.println(solution100.solution(A));

    }

    public int solution(int A[]) {

        int len = A.length;
        Circle[] circleLog = new Circle[len * 2];           // contain start and end of each circle
        int j = 0;
        for (int i = 0; i < len; i++) {
            circleLog[j++] = new Circle(i - (long) A[i], 1);    // start of the circle A[1] = 5  start = -4, mark 1
            circleLog[j++] = new Circle(i + (long) A[i], -1);   // end = 6, mark - 1
        }
        Arrays.sort(circleLog);         // use compareTo method
        int intersection = 0;
        int currentIntersection = 0;        // cumulative variable of event log

        for (Circle elem : circleLog) {
            currentIntersection += elem.startEnd;
            if (elem.startEnd > 0) {                            // only if its start of the circle
                intersection += currentIntersection - 1;        // it's a pair (1, -1) have to remove -1
            }
            if (intersection > 10000000) {
                return -1;
            }
        }
        return intersection;
    }


    public class Circle implements Comparable<Circle> {     // we can sort the collection of Circle - first by x then startEnd

        private final long x;               // x-axis - where circle started and ended on x-axis
        private final int startEnd;         // start 1, end -1;

        Circle(long x, int startEnd) {
            this.x = x;
            this.startEnd = startEnd;
        }

        @Override
        public int compareTo(Circle circle) {

            return this.x != circle.x ?
                    Long.compare(this.x, circle.x) :                            // if diff sort by x
                    Integer.compare(circle.startEnd, this.startEnd);            // simply sort in descending order start -> end
        }
    }
}
