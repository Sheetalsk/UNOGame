package com.tic.search;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Tuple<X,Y> {
    private X x;
    private Y y;
}
