public class LinkedQueue<E> implements AbstractQueue<E> {

    private static class Node<E> {

        Node<E> next;
        E value;

        public Node(E value) {
            this.value = value;
        }
    }

    private Node<E> head = null, tail = null;

    @Override
    public void add(E element) {
        if (head == null) {
            head = tail = new Node<>(element);
        } else {
            tail.next = new Node<>(element);
            tail = tail.next;
        }
    }

    @Override
    public E poll() {
        if (head == null) {
            return null;
        }
        E value = head.value;
        head = head.next;
        return value;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }
}
