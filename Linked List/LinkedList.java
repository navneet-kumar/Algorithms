package linkedlist;

public class LinkedList<T> {
    Node<T> head;

    LinkedList() {
        head = null;
    }

    LinkedList(T data) {
        head = new Node<T>(data);
    }

    LinkedList<T> add(T data) {
        if (head == null) {
            head = new Node<T>(data);
        } else {
            Node<T> node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node<T>(data);
        }
        return this;
    }

    /**
     *    P  C   N
     *      []  []  []
     *      n = c.next
     *      c.next = p
     *      p = c
     *      n = c
     * @return
     */
    LinkedList<T> reverse() {
        if (head == null) {
            return null;
        }

        Node<T> prev = null, next = null;
        Node<T> current = head;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return this;
    }

    @Override
    public String toString() {
        Node<T> node = head;
        StringBuilder s = new StringBuilder();
        while (node != null) {
            s.append(" " + node.data);
            node = node.next;
        }
        return s.toString();
    }

    public class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            next = null;
        }
    }
}
