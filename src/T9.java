public class T9 {
    public static void main(String[] args) {
        int[][] num = {
                {7, 9, 11, 13, 15, 17},
                {2, 4, 6, 8, 10, 12},
                {25, 30, 45, 50, 65, 70}
        };

        int large = 0;
        int secondLargest = 0;

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j] > large) {
                    secondLargest = large;
                    large = num[i][j];
                } else if (num[i][j] > secondLargest && num[i][j] < large) {
                    secondLargest = num[i][j];
                }
            }
        }
        System.out.println("The 2nd largest number in the array is "+secondLargest);
    }
}
