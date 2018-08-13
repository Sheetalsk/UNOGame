package com.tic.search;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.Set;

@Getter
@Builder
public class QueryMap {
    private Tuple<String, Type> tuple;
    private Set<Column> columns;
}
