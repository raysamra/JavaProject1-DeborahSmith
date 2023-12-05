import java.util.HashSet;

public class T10 {
    public static void main(String[] args) {
        String [] colors= {"Black", "Red", "Pink", "White", "Black", "White", "Pink"};
        HashSet<String> unique = new HashSet<>();
        HashSet<String> duplicate = new HashSet<>();

        for (String element : colors) {
            if (!unique.add(element)) {
                duplicate.add(element);
            }
        }
        System.out.println("The duplicate colors in the array are ");
        for (String duplicate2 : duplicate) {
            System.out.print(duplicate2+" ");
        }

    }
}
