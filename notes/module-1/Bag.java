import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A collection that stores elements and allows duplicates.
 *
 * @param <T> the type of elements stored in the bag
 */
public class Bag<T> {
    private final List<T> items = new ArrayList<>();

    /** Adds one occurrence of an item to the bag. */
    public void add(T item) {
        items.add(item);
    }

    /** Removes the first matching occurrence, if the item is present. */
    public void remove(T item) {
        int index = items.indexOf(item);
        if (index >= 0) {
            items.remove(index);
        }
    }

    /** Returns true when the bag contains at least one matching item. */
    public boolean contains(T item) {
        return items.contains(item);
    }

    /** Returns the number of occurrences of an item in the bag. */
    public int count(T item) {
        int occurrences = 0;
        for (T currentItem : items) {
            if (Objects.equals(currentItem, item)) {
                occurrences++;
            }
        }
        return occurrences;
    }

    /** Returns the bag's contents for display. */
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
        fruitBag.add("banana");
        System.out.println("Bag contents: " + fruitBag);

        System.out.println("Contains banana: " + fruitBag.contains("banana"));
        System.out.println("Contains grape: " + fruitBag.contains("grape"));
        System.out.println("Count of apple: " + fruitBag.count("apple"));
        System.out.println("Count of grape: " + fruitBag.count("grape"));

        fruitBag.remove("orange");
        System.out.println("After removing orange: " + fruitBag);
        System.out.println("Contains orange: " + fruitBag.contains("orange"));
        System.out.println("Count of orange: " + fruitBag.count("orange"));
    }
}
