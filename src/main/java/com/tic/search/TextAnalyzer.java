package com.tic.search;

import com.tic.common.Tuple;
import org.h2.util.StringUtils;

import javax.xml.soap.Text;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Set;

public class TextAnalyzer implements Analyzer {
    public static void main(String[] args) {
        TextAnalyzer analyzer = new TextAnalyzer();
        for (Tuple<String, Type> a : analyzer.analyze("Hello thida & lone "))
            System.out.println(a);
    }


    public Set<Tuple<String, Type>> analyze(String input) {
        return Collections.emptySet();
    }
}

