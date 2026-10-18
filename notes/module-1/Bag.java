import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** A collection that stores elements and allows duplicates. */
public class Bag<T> {
    private final List<T> items = new ArrayList<>();

    /** Adds an item to the bag. */
    public void add(T item) {
        items.add(item);
    }

    /** Removes one occurrence of an item, if present. */
    public void remove(T item) {
        items.remove(item);
    }

    /** Returns true if the item is in the bag. */
    public boolean contains(T item) {
        return items.contains(item);
    }

    /** Returns the number of times the item appears in the bag. */
    public int count(T item) {
        int occurrences = 0;
        for (T currentItem : items) {
            if (Objects.equals(currentItem, item)) {
                occurrences++;
            }
        }
        return occurrences;
    }

    /** Returns the bag's contents. */
    @Override
    public String toString() {
        return items.toString();
    }

    /** Demonstrates the bag operations. */
    public static void main(String[] args) {
        Bag<String> fruitBag = new Bag<>();

        fruitBag.add("apple");
        fruitBag.add("banana");
        fruitBag.add("apple");
        fruitBag.add("orange");
        fruitBag.add("apple");
        System.out.println("Bag contents: " + fruitBag);

        System.out.println("Contains apple: " + fruitBag.contains("apple"));
        System.out.println("Contains grape: " + fruitBag.contains("grape"));
        System.out.println("Count of apple: " + fruitBag.count("apple"));
        System.out.println("Count of grape: " + fruitBag.count("grape"));

        fruitBag.remove("apple");
        System.out.println("After removing one apple: " + fruitBag);
        System.out.println("Contains apple: " + fruitBag.contains("apple"));
        System.out.println("Count of apple: " + fruitBag.count("apple"));
    }
}
