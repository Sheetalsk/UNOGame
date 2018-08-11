package com.tic.search;

import org.h2.util.StringUtils;

import javax.xml.soap.Text;
import java.lang.reflect.Array;

public class TextAnalyzer implements Analyzer {


    public String[] analyze(String userInput) {
        return StringUtils.toLowerEnglish(userInput).split(" ");
    }

    public static void main(String[] args) {
        TextAnalyzer analyzer = new TextAnalyzer();
        for (String a : analyzer.analyze("Hello thida & lone "))
            System.out.println(a);
    }
}

