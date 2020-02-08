package codility.adventCalendar.day_04;

public class SecureContainer {

    // 6 digits
    // 22, 33 itd
    // never decrease
    // range 134564-585159


    public static void main(String[] args) {

        int min = 134564;
        int max = 585159;
        int count = 0;

        for (int i = 0; i < (585159 - 134564); i++) {
            int randomInt = min + i;
            System.out.println(randomInt);
            if (checkConditions(checkNumber(randomInt))) {
                count++;
            }
        }

        System.out.println(count);
    }

    private static int[] checkNumber(int num) {

        int n, a, counter = 5;
        n = num;
        int[] tab = new int[6];

        while (n > 0) {
            a = n % 10;
            //      System.out.println(a);
            tab[counter] = a;
            n = n / 10;
            counter--;
        }
        //  System.out.println(Arrays.toString(tab));
        return tab;
    }

    private static boolean checkConditions(int[] tab) {

        /*for (int i = 0; i < tab.length; i++) {
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[i] == (tab[j])) {
                    for (int x = 0; x < tab.length; x++) {
                        for (int y = x + 1; y < tab.length; y++) {
                            if (tab[x] < tab[y]) {
                                return true;
                            }
                        }
                    }
                }
            }
        }

        return false;
    }*/
                                                            // Part 1. remove all && conditions
        if ((tab[0] == tab[1] & tab[1] != tab[2]) ||
                (tab[1] == tab[2] && tab[0] != tab[1] && tab[2] != tab[3]) ||
                (tab[2] == tab[3] && tab[1] != tab[2] && tab[3] != tab[4]) ||
                (tab[3] == tab[4] && tab[2] != tab[3] && tab[4] != tab[5]) ||
                (tab[4] == tab[5] && tab[3] != tab[4])) {

            if (tab[0] <= tab[1]) {
                if (tab[1] <= tab[2]) {
                    if (tab[2] <= tab[3]) {
                        if (tab[3] <= tab[4]) {
                            if (tab[4] <= tab[5]) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}

