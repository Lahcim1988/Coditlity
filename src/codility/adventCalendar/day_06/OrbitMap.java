package codility.adventCalendar.day_06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class OrbitMap {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner s = new Scanner(new File("/home/michal/workspace2/adventCalendar/src/com/day_06/data.txt"));
        ArrayList<String> list = new ArrayList<String>();
        while (s.hasNextLine()) {
            list.add(s.next());
        }
        s.close();
        int answer = orbit(list);
        System.out.println(answer);
        int answer2 = orbit2(list);
        System.out.println(answer2);

    }


    private static int orbit(List<String> orb) {

        Map<String, String> orbits = new HashMap<>();
        for (String str : orb) {
            String[] split = str.split("\\)");
            orbits.put(split[1], split[0]);
        }
        int ret = 0;
        for (String str2 : orbits.keySet()) {
            while (!str2.equals("COM")) {
                ret++;
                str2 = orbits.get(str2);
            }
        }
        return ret;

    }

    private static int orbit2(List<String> orb) {
        Map<String, String> orbits = new HashMap<>();
        for (String str : orb) {
            String[] split = str.split("\\)");
            orbits.put(split[1], split[0]);
        }
        String you = "YOU";
        int i = 0;
        Map<String, Integer> result = new HashMap<>();
        while (you != null) {
            you = orbits.get(you);
            result.put(you, i++);
        }
        String end = "SAN";
        int ans = 0;
        while (!result.containsKey(end)) {
            end = orbits.get(end);
            ans++;
        }
        return result.get(end) + ans - 1;


    }
}
