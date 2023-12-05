public class T5 {
    public static void main(String[] args) {
        int[][] num = {
                {7, 9, 11, 13, 15, 17},
                {2, 4, 6, 8, 10, 12},
                {25, 30, 45, 50, 65, 70}
        };
        int num1Before=2;
        int num2Before=2;
        int num1After=0;
        int num2After=0;
        System.out.println("Before swapping 2 numbers in the array: ");
        for (int[] i : num) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        num[num1Before][num2Before]=num[num1Before][num2Before]+num[num1After][num2After];
        num[num1After][num2After]=num[num1Before][num2Before]-num[num1After][num2After];
        num[num1Before][num2Before]=num[num1Before][num2Before]-num[num1After][num2After];

        System.out.println("After swapping 2 numbers in the array: ");
        for (int[] i : num) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
