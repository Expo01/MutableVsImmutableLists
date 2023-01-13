import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] originalArray = new String[] {"First", "Second", "Third"};
        var originalList = Arrays.asList(originalArray);

        originalList.set(0,"one");
        System.out.println("list: " + originalList);
        System.out.println("array " + Arrays.toString(originalArray)); //both originalArray and originalList will display
        // the change of the first index value since originalList is backed by originalArray

        originalList.sort(Comparator.naturalOrder()); //here list backed by array uses inbuilt list method which affects
        System.out.println("array: " + Arrays.toString(originalArray)); // the array its backed by

//        originalList.add("fourth");  cannot add items to list as it is backed by an array which is by nature immutable

        List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday");
        System.out.println(newList);


        var mutableList = Arrays.asList("ichi", "ni", "san"); //mutable but not resizable list

        String [] countingArray = new String[] {"ichi", "ni", "san"};
        List<String> mutableListTwo = Arrays.asList(countingArray); //mutable but not resizable list

        var immutableList = List.of("ichi", "ni", "san"); //immutable list

        String[] otherCountingArray = new String [] {"ichi", "ni", "san"};
        List<String> immutableListTwo = List.of(otherCountingArray); //immutable list

        ArrayList<String> stringLists = new ArrayList<>(List.of("Jan", "Feb", "Mar"));
        String[] stringArray = stringLists.toArray(new String[0]); //creation of array from arrayList

    }
}