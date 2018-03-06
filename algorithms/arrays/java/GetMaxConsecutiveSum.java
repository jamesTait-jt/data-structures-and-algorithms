import java.util.Random;
import java.lang.Math;

public class GetMaxConsecutiveSum {

    private int[] numbers;
    // n is the number of elements in the array, max is the maximum value of any
    // given integer in the array.
    public GetMaxConsecutiveSum(int n, int max) {
        this.numbers = new int[n];
        for (int i = 0 ; i < n ; i++) {
            Random rand = new Random();
            int randNum = rand.nextInt(max + 1) - 25; 
            this.numbers[i] = randNum;
        }
        int maximum = 0;
        // i is the left boundary
        for (int i = 0 ; i < n - 1 ; i++) {
            System.out.println(this.numbers[i]);
            // j is the right boundary
            for (int j = i ; j < n ; j++) {
                int counter = 0;
                // k is a counter that goes from i to j
                for (int k = i ; k <= j ; k++) {
                    counter += this.numbers[k];
                }
                if (counter > maximum) {
                    maximum = counter;
                }
            }
        }
        System.out.println("--- " + String.valueOf(maximum) + " ---");
        
        int localMax = this.numbers[0];
        int globalMax = this.numbers[0];

        int localStart = 0;
        int localEnd = 0;

        int globalStart = 0; 
        int globalEnd = 0 ;

        for (int i = 1 ; i < n ; i++) {
            System.out.println(this.numbers[i]);
            if (this.numbers[i] > localMax + this.numbers[i]) {
                localMax = this.numbers[i];
                localStart = i;
                localEnd = i;
            } else {
                localMax = this.numbers[i] + localMax;
                localEnd = i;
            }
            if (localMax > globalMax) {
                globalMax = localMax;
                globalStart = localStart;
                globalEnd = localEnd;
            }
        }
        System.out.println("--- " + String.valueOf(globalMax) + " ---");
        System.out.println(globalStart);
        System.out.println(globalEnd);
    }

    public static void main(String[] args) {
        GetMaxConsecutiveSum sum = new GetMaxConsecutiveSum(10, 50);        
    }

}
