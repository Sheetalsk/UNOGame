package com.tic.search;

import java.util.HashSet;
import java.util.Set;

public class FileSearchColumnManager implements ColumnManager {
    @Override
    public Set<Column> manage(Tuple<String, Type> tuple) {
        Set<Column> columns = new HashSet<>();
        if (tuple.getY().equals(Type.TEXT)) {
            columns.add(FileColumn.FILE_NAME);
            columns.add(FileColumn.BRANCH);
            columns.add(FileColumn.TAG_NAME);
        } else if (tuple.getY().equals(Type.DATE)) {
            columns.add(FileColumn.DATE);
        }
        return columns;
    }
}
