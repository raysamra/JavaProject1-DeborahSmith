public class T4 {
    public static void main(String[] args) {
        int[][] num = {
                {7, 9, 11, 13, 15, 17},
                {2, 4, 6, 8, 10, 12},
                {25, 30, 45, 50, 65, 70}
        };
        int sumEven=0;
        int sumOdd=0;

        for(int i=0; i<num.length; i++){
            for(int j=0; j<num[i].length; j++){
                if(num[i][j]%2==0) {
                    sumEven = sumEven + num[i][j];
                }else{
                    sumOdd= sumOdd+num[i][j];
                }
            }
        }
        System.out.println("The sum of all even numbers in the array is "+sumEven);
        System.out.println("The sum of all odd numbers in the array is "+sumOdd);
    }
}
