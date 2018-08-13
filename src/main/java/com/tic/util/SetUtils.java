package com.tic.util;

import java.util.ArrayList;
import java.util.Set;

public class SetUtils {
    public static <T> T getLast(Set<T> set) {
        return new ArrayList<>(set).get(set.size() - 1);
    }
}
