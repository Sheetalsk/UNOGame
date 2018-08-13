package com.tic.search;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Optional;

public class DateAnalyzer implements Analyzer {
    public Optional<Type> analyze(String text) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(text.trim());
        } catch (ParseException pe) {
            return Optional.empty();
        }
        return Optional.of(Type.DATE);
    }
}
