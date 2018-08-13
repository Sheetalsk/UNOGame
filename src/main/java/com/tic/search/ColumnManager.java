package com.tic.search;

import java.util.Set;

public interface ColumnManager {
    Set<Column> manage(Tuple<String, Type> tuple);
}
