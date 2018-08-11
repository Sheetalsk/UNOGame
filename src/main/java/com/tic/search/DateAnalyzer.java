package com.tic.search;

import javax.persistence.Tuple;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

public class DateAnalyzer implements Analyzer {
    public String[] analyze(String userInput) {
        return null;
    }

    public boolean isThisDateValid(String dateToValidate, String dateFormat) {

        if (dateToValidate == null) {
            return false;
        }

        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        sdf.setLenient(false);

        try {

            //if not valid, it will throw ParseException
            Date date = sdf.parse(dateToValidate);
            System.out.println(date);

        } catch (ParseException e) {

            e.printStackTrace();
            return false;
        }

        return true;
    }

    public static void main(String[] args)
    {
        DateAnalyzer dateAnalyzer = new DateAnalyzer();
        System.out.println(dateAnalyzer.isThisDateValid("08-09-2018","dd-mm-yy"));

    }

}
