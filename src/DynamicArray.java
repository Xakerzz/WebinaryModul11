import java.util.Arrays;

public class DynamicArray {
    private static final int MAX_CAPACITY = 20;
    private int capacity;
    private int size;
    private String[] todos;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        todos = new String[capacity];
    }

    public DynamicArray() {
        this.capacity = MAX_CAPACITY;
    }

    public void add(String item) {
        if (size > capacity) {
            todos = Arrays.copyOf(todos, todos.length * 2);
            capacity = todos.length;
        }
        todos[size++] = item;
    }

    @Override
    public String toString() {
        return Arrays.toString(todos);
    }
}
