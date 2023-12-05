public class T2 {
    public static void main(String[] args) {

        int [] values={20,99,54,5,23,19,75};
        int sum=0;
        for(int i=0; i< values.length; i++) {
            sum = sum+values[i];
        }
        System.out.println("The sum of all values in the array is "+sum);
    }
}
