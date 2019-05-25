package com.sda.algorytmy;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
//        Box<Integer> box1 = new Box(new Integer(12));
//
//        Box<Float> box2 = new Box(new Float(12.32));
        List<Integer> integerList = new ArrayList<>();
        integerList.add(21);
        integerList.add(211);
        integerList.add(212);
        integerList.add(213);

        for (Integer element : integerList) {
            System.out.println(element);
        }
        List<String> stringList = new ArrayList<>();
        stringList.add("Zosia");
        stringList.add("Basia");
        stringList.add("Tomek");

        for (String el : stringList) {
            System.out.println(el);


//        }        List<Integer> integerList = new ArrayList<>();
//        integerList.add(21);
//        integerList.add(211);
//        integerList.add(212);
//        integerList.add(213);
//
//        for (Integer element : integerList) {
//            System.out.println(element);
//        }
//        List<String> stringList = new ArrayList<>();
//        stringList.add("Zosia");
//        stringList.add("Basia");
//        stringList.add("Tomek");
//
//        for (String el : stringList) {
//            System.out.println(el);
//
//
//        }
        }
        Zadanie.zad1();
    }}

