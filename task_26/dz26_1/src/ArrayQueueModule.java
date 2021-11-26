public class ArrayQueueModule {

    private static Object[] data;
    private static int size, start, currentPosition;

    static {
        clear();
    }

    public static void enqueue(Object element) {
        if (start == currentPosition) {
            start = mod(start + 1, data.length);
        }
        data[currentPosition] = element;
        currentPosition = mod(currentPosition + 1, data.length);
        size = Math.min(size + 1, 16);
    }

    public static Object element() {
        return data[start];
    }

    public static Object dequeue() {
        if (size == 0) {
            return null;
        }
        Object element = element();
        data[start] = null;
        start = mod(start + 1, data.length);
        size -= 1;
        return element;
    }

    public static int size() {
        return size;
    }

    public static boolean isEmpty() {
        return size == 0;
    }

    public static void clear() {
        data = new Object[16];
        size = 0;
        start = 0;
        currentPosition = 0;
    }

    private static int mod(int a, int b) {
        int c = a % b;
        if (c >= 0) {
            return c;
        } else {
            return c + b;
        }
    }
}