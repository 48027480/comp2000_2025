import java.util.ArrayList;
import java.util.List;

/**
 * A generic container that can store items of any type.
 * Demonstrates intelligent use of generics in a game setting.
 */
public class Inventory<T> {
    private List<T> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    /** Add an item to the inventory */
    public void add(T item) {
        items.add(item);
    }

    /** Remove an item from the inventory */
    public boolean remove(T item) {
        return items.remove(item);
    }

    /** @return all items currently in the inventory */
    public List<T> getItems() {
        return items;
    }

    /** @return true if the inventory is empty */
    public boolean isEmpty() {
        return items.isEmpty();
    }

    /** @return the number of items in the inventory */
    public int size() {
        return items.size();
    }
}
