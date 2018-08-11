package com.tic.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Tuple<T,V> {
    private T first;
    private V second;
}
