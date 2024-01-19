package org.example;

import java.util.LinkedList;

public class MyHashMap<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private static final float DEFAULT_LOAD_FACTOR = 0.75f;

    private int capacity;
    private float loadFactor;
    private int size;
    private LinkedList<Node<K, V>>[] table;

    public MyHashMap() {
        this(DEFAULT_CAPACITY, DEFAULT_LOAD_FACTOR);
    }

    public MyHashMap(int capacity, float loadFactor) {
        this.capacity = capacity;
        this.loadFactor = loadFactor;
        this.table = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private static class Node<K, V> {
        K key;
        V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int hash(K key) {
        return key.hashCode() % capacity;
    }

    public void put(K key, V value) {
        int index = hash(key);
        Node<K, V> node = new Node<>(key, value);
        table[index].addFirst(node);
        size++;
        if (size > capacity * loadFactor) {
            resize();
        }
    }

    public V get(K key) {
        int index = hash(key);
        for (Node<K, V> node : table[index]) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }
        return null;
    }

    public void remove(K key) {
        int index = hash(key);
        for (Node<K, V> node : table[index]) {
            if (node.key.equals(key)) {
                table[index].remove(node);
                size--;
                return;
            }
        }
    }

    private void resize() {
        int newCapacity = capacity * 2;
        LinkedList<Node<K, V>>[] newTable = new LinkedList[newCapacity];
        for (int i = 0; i < newCapacity; i++) {
            newTable[i] = new LinkedList<>();
        }
        for (LinkedList<Node<K, V>> bucket : table) {
            for (Node<K, V> node : bucket) {
                int newIndex = node.key.hashCode() % newCapacity;
                newTable[newIndex].addLast(node);
            }
        }
        table = newTable;
        capacity = newCapacity;
    }
}
