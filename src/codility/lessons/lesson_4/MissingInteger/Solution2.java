package codility.lessons.lesson_4.MissingInteger;

public class Solution2 {

    public int solution(int[] A) {

        boolean[] flag = new boolean[100001];

        for (int i : A) {
            if(i >= 1 && i <= 100001) flag[i - 1] = true;
        }

        for (int i = 0; i < flag.length; i++) {
            if(!flag[i]){
                return i + 1;
            }
        }

        return 1;
    }
}
