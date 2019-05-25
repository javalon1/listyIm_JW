package com.sda.algorytmy;

public class ListTest {
    public static void main(String[] args) {

        MyList<Integer> list = new ListImpl<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(20);
        list.add(22);
        list.add(25);
        list.add(29);
        list.add(45);
        list.add(55);
        list.add(80);
        list.remove(2);
    }
}
