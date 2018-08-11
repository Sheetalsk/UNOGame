package com.tic.search;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        MainAnalyzer analyzer = new MainAnalyzer();
        Set<Tuple<String, Type>> tuples =  analyzer.analyze("hello world 13-07-2018");
        tuples.forEach(tuple -> System.out.println(tuple.getX() + ", " + tuple.getY()));
    }
}
