package main.java.com.example;

import java.util.concurrent.atomic.AtomicInteger;

class Counted {
    private static final AtomicInteger COUNTER = new AtomicInteger(1);

    private final int id;

    public Counted() {
        id = COUNTER.getAndIncrement();
    }

    public int getId() {
        return id;
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println(new Counted().getId()); // 1
        System.out.println(new Counted().getId()); // 2
        System.out.println(new Counted().getId()); // 3
    }
}