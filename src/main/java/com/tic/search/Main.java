package com.tic.search;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        MainAnalyzer analyzer = new MainAnalyzer();
        Set<Tuple<String, Type>> tuples =  analyzer.analyze("hello world 2018-01-13");
        tuples.forEach(tuple -> System.out.println(tuple.getX() + ", " + tuple.getY()));

        System.out.println("---------------------------------------------------------------------------------------");

        Translator<String> translator = new FileSearchQueryTranslator();
        String query = translator.translate(tuples);
        System.out.println(query);
    }
}
