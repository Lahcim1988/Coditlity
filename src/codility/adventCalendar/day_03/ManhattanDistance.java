package codility.adventCalendar.day_03;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManhattanDistance {

    public static void main(String[] args) throws FileNotFoundException {

        String[] tab = reader();
        String[] tab2 = reader();



    }


    public static List<Point> distance(String[] dist) {


        Point point = new Point(0, 0);
        List<Point> myPoints = new ArrayList<>();


        for (int s = 0; s < dist.length; s++) {

            int x = point.x;
            int y = point.y;

            if (dist[s].charAt(0) == 'R') {
                x++;
            } else if (dist[s].charAt(0) == 'L') {
                x--;
            } else if (dist[s].charAt(0) == 'U') {
                y--;
            } else if (dist[s].charAt(0) == 'D') {
                y++;
            }

            point.x = x;
            point.y = y;
        }
        System.out.println(myPoints.size());

        return myPoints;
    }

    private static String[] reader() throws FileNotFoundException {

        File file = new File("/home/michal/Downloads/adventCalendar/src/com/day_03/task2.txt");
        //  String [] str = file.toString().split("\\s*,\\s*");

        Scanner scanner = new Scanner(file);
        StringBuilder stringBuilder = new StringBuilder();
        while (scanner.hasNextLine()) {
            stringBuilder.append(scanner.nextLine());
            stringBuilder.append(",");
        }
        String[] string = stringBuilder.toString().split("\\s*,\\s*");
        return string;
    }

}
