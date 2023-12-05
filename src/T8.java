public class T8 {
    public static void main(String[] args) {
        int[][] num = {
                {7, 9, 11, 13, 15, 17},
                {2, 4, 6, 8, 10, 12},
                {25, 30, 45, 50, 65, 70}
        };
        int highest = num[0][0];
        int lowest = num[0][0];

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j] > highest) {
                    highest = num[i][j];
                }
                if (num[i][j] < lowest) {
                    lowest = num[i][j];
                }
            }
        }
        System.out.println("The highest number in the array is " + highest);
        System.out.println("The lowest number in the array is " + lowest);
    }
}
