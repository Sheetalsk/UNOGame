package com.tic.search;

import java.util.Optional;

public interface Analyzer {
    Optional<Type> analyze(String text);
}
