package com.tic.search;

import com.tic.common.Tuple;

import java.util.Set;

public class DuongDuongTest {
    public static void main(String[] args) {
        String userInput = "aloha this is my search ";

        Analyzer searchAnalyzer = new SearchAnalyzer();
        Set<Tuple<String, Type>> results = searchAnalyzer.analyze(userInput);
        System.out.println(results);
    }

}
