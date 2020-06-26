package codility.amzon.recursiveStaircaseProblem;

// save a space

public class Solution2 {

    public static void main(String[] args) {

        System.out.println(num_ways(0));
        System.out.println(num_ways(1));
        System.out.println(num_ways(2));
        System.out.println(num_ways(3));
        System.out.println(num_ways(4));
        System.out.println(num_ways(5));

    }

    public static int num_ways(int N) {

        if (N == 0 || N == 1) {
            return 1;
        }

        int[] tab = new int[2];
        tab[0] = 1;
        tab[1] = 1;

        for (int i = 2; i < N; i++) {
            int temp = tab[0];
            tab[0] = tab[1];
            tab[1] = temp + tab[1];
        }
        return tab[0] + tab[1];
    }
}
