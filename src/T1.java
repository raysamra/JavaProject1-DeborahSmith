public class T1 {
    public static void main(String[] args) {
        int [] temps={32,55,43,30,45,51,39};

        int highest=temps[0];
        int lowest=temps[0];

        for (int week = 0; week < temps.length; week++) {
            if (temps[week] > highest) {
                highest = temps[week];
            }

            if (temps[week] < lowest) {
                lowest = temps[week];
            }
        }
        System.out.println("Highest temperature for the week: " + highest);
        System.out.println("Lowest temperature for the week: " + lowest);

    }
}
