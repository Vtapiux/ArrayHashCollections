import java.util.*;

public class ArrayHash {
    public static void main(String[] args) {
        // Create an ArrayList and a HashSet
        List<Person> myFriends = new ArrayList<>();
        Map<Person,Integer> mySisters = new HashMap<>();

        // Insert 3 objects into each
        myFriends.add(new Person("Favio"));
        myFriends.add(new Person("Paulina"));
        myFriends.add(new Person("Natalia"));

        mySisters.put(new Person("Michelle"), 18);
        mySisters.put(new Person("Nicole"), 15);
        mySisters.put(new Person("Janet"), 22);

        // Iterate over each collection and print each object
        System.out.println("Elements in myFriends:");
        for (Person item : myFriends) {
            System.out.println(item);
        }

        System.out.println("\nElements in mySisters:");
        for (var entry : mySisters.entrySet()) {
            System.out.println(entry.getKey() + " - Age: " + entry.getValue());
        }

        // Sorting using Comparable
        Collections.sort(myFriends);
        System.out.println("\nMy Friends ordered:");
        for (Person friend : myFriends) {
            System.out.println(friend);
        }

        // Sorting using Comparator (Reverse order)
        System.out.println("\nMy Friends sorted in reverse order:");
        myFriends.sort(new ReverseNameComparator());
        myFriends.forEach(System.out::println);

    }
}

