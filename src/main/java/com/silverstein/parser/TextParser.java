package com.silverstein.parser;

import java.io.BufferedReader;
import java.io.IOException;

public class TextParser {
    private BufferedReader bufferReader;

    public TextParser(BufferedReader br) {
        this.bufferReader = br;
    }

    public String convertToString() throws IOException {
        String fileString = "";
        String str;

        while((str = bufferReader.readLine()) != null) {
            fileString += " " + str.toLowerCase();
        }

        String withoutPunctuation =  removePunctuation(fileString);

        return withoutPunctuation;
    }

    private String removePunctuation(String fileString) {
        return fileString.replaceAll("[^a-zA-Z ]", "");
    }

    public BufferedReader getBufferReader() {
        return bufferReader;
    }

    public void setBufferReader(BufferedReader bufferReader) {
        this.bufferReader = bufferReader;
    }
}
