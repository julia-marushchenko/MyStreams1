/**
 * Java program to create Stream, add elements to it and print them.
 */

package com.mystreams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

/**
 * Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating ArrayList.
        ArrayList<String> myList = new ArrayList<>();

        // Adding elemets to a list.
        myList.add("a");
        myList.add("b");
        myList.add("c");
        myList.add("d");

        // Stream of Collection.
        Stream<String> myStream = myList.stream();

        // Printing elements of myStream to console.
        myStream.forEach(System.out::print);

    }
}