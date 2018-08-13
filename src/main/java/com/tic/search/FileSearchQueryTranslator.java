package com.tic.search;

import com.tic.util.SetUtils;

import java.util.Set;

public class FileSearchQueryTranslator implements Translator<String> {
    private static final String SPACE = " ";
    private static final String LIKE = "LIKE";
    private static final String OR = "OR";
    private static final String AND = "AND";
    private static final String SINGLE_QUOTE = "'";
    private static final String EQUALS = "=";
    private static final String BREAK_LINE = "\n";
    private static final String SEMI_COLON = ";";

    private ColumnManager columnManager;

    public FileSearchQueryTranslator() {
        this.columnManager = new FileSearchColumnManager();
    }

    @Override
    public String translate(Set<Tuple<String, Type>> tuples) {
        StringBuilder query = new StringBuilder("SELECT *")
                .append(BREAK_LINE)
                .append("FROM file")
                .append(BREAK_LINE)
                .append("WHERE");

        Tuple<String, Type> lastTuple = SetUtils.getLast(tuples);
        tuples.forEach(tuple -> {
            Set<Column> columns = columnManager.manage(tuple);
            Column lastColumn = SetUtils.getLast(columns);
            for (Column column : columns) {
                query.append(SPACE)
                        .append(column.getName())
                        .append(SPACE);
                if (Type.TEXT.equals(tuple.getY())) {
                    query.append(LIKE)
                            .append(SPACE)
                            .append(SINGLE_QUOTE).append(tuple.getX()).append(SINGLE_QUOTE);
                } else if (Type.DATE.equals(tuple.getY())) {
                    query.append(EQUALS)
                            .append(SPACE)
                            .append(SINGLE_QUOTE).append(tuple.getX()).append(SINGLE_QUOTE);
                }
                if (!lastColumn.equals(column)) {
                    query.append(SPACE)
                            .append(OR);
                }
            }

            if (!lastTuple.equals(tuple)) {
                query.append(BREAK_LINE)
                        .append(AND);
            }
        });
        return query.append(SEMI_COLON).toString();
    }

    /*
        SELECT *
            FROM file
            WHERE file_name LIKE 'hello' or branch LIKE 'hello' or tag_name LIKE 'hello'
            AND file_name LIKE 'world' or branch LIKE 'world' or tag_name LIKE 'world'
            AND date = '2018-08-13';
     */
}
