package com.tic.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Tuple<T,V> {
    private T first;
    private V second;
}
