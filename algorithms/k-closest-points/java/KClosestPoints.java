import java.util.Random;
import java.lang.Math;

public class KClosestPoints {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        int[][] points = new int[n][2];

       // points[0] = new int[] {-2, 4};
       // points[1] = new int[] {0, -2};
       // points[2] = new int[] {-1, 0};
       // points[3] = new int[] {3, 5};
       // points[4] = new int[] {-2, -3};
       // points[5] = new int[] {3, 2};

        for (int i = 0 ; i < n ; i++) {
            Random rand = new Random();
            points[i] = new int[] {rand.nextInt(50) - 24, rand.nextInt(50) - 24};
        }

        double[] distances = new double[n];
        for (int i = 0 ; i < n ; i++) {
            double distance = Math.sqrt(points[i][0] * points[i][0] + points[i][1] * points[i][1]);
            distances[i] = distance;
            System.out.println(distance);
        }

        int[] pointIndices = new int[k];
        int counter = 0;
        while (counter < k) {
            double minVal = Integer.MAX_VALUE;
            int minIndex = 0;
            for (int j = 0 ; j < n ; j++) {
                if (distances[j] < minVal) {
                    minVal = distances[j];
                    minIndex = j;
                }
            }
            distances[minIndex] = Integer.MAX_VALUE;
            pointIndices[counter] = minIndex;
            counter++;
        }
        for (int i = 0 ; i < k ; i++) {
            System.out.println("(" + String.valueOf(points[pointIndices[i]][0]) + ", " + String.valueOf(points[pointIndices[i]][1]) + ")");
        }
    }

}
