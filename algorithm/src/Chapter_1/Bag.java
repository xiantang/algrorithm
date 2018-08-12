package Chapter_1;

import java.util.Iterator;

public class Bag<Item> implements Iterable<Item> {
    private Node first;
    private class Node{
        Item item;
        Node next;
    }

    @Override
    public Iterator<Item> iterator() {
        return null;
    }
    private class ListIterator implements Iterator<Item>{
        private Node current = first;
        @Override
        public boolean hasNext() {
            return current !=null;
        }
        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    public void add(Item item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
    }

}