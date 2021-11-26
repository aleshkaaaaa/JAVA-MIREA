public class ArrayQueue<E> implements AbstractQueue<E> {

    private Object[] data;
    private int size, start, currentPosition;

    public ArrayQueue() {
        this.data = new Object[16];
        this.size = 0;
        this.start = 0;
        this.currentPosition = 0;
    }


    @Override
    public void add(E element) {
        if (start == currentPosition) {
            start = mod(start + 1, data.length);
        }
        data[currentPosition] = element;
        currentPosition = mod(currentPosition + 1, data.length);
        size = Math.min(size + 1, 16);
    }

    @Override
    @SuppressWarnings("unchecked")
    public E poll() {
        if (size == 0) {
            return null;
        }
        E element = (E) data[start];
        data[start] = null;
        start = mod(start + 1, data.length);
        size -= 1;
        return element;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private int mod(int a, int b) {
        int c = a % b;
        if (c >= 0) {
            return c;
        } else {
            return c + b;
        }
    }

}
