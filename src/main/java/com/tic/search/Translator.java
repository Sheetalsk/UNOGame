package com.tic.search;

import java.util.Set;

public interface Translator<T> {
    T translate(Set<Tuple<String, Type>> tuples);
}
