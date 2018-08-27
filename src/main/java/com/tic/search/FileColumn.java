package com.tic.search;

import lombok.Getter;

@Getter
public enum FileColumn implements Column {
    FILE_NAME("file_name"),
    BRANCH("branch"),
    DATE("date"),
    TAG_NAME("tag_name");

    private String name;

    FileColumn(String name) {
        this.name = name;
    }
}
