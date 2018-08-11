package com.tic.search;

import javax.management.Query;
import java.util.Set;

public class SqlQueryTranslator implements Translator<Query> {

    @Override
    public Query translate(Set<Tuple<String, Type>> tuples) {
        String query = "";
    }
}
