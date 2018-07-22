package com.silverstein.indexer;

import java.util.HashMap;

public class Indexer {
    private String fileString;

    public Indexer() {
    }

    public Indexer(String fileString) {
        this.fileString = fileString;
    }

    public HashMap<String, Integer> index() throws Exception {
        if (this.fileString != null) {
            return index(fileString);
        } else {
            throw new Exception("Must pass string to indexer method");
        }

    }

    public HashMap<String, Integer> index(String str) {
        HashMap<String, Integer> wordsWithCount =  new HashMap<String, Integer>();
        String[] strArr = str.split(" ");

        for (int i = 0; i < strArr.length; i++) {
            if(wordsWithCount.get(strArr[i]) != null) {
                wordsWithCount.put(strArr[i], wordsWithCount.get(strArr[i]) + 1);
            } else {
                wordsWithCount.put(strArr[i], 1);
            }
        }

        return wordsWithCount;
    }
}
