import com.silverstein.indexer.Indexer;
import com.silverstein.parser.TextParser;

import java.io.*;
import java.util.HashMap;

public class SilverSearch {
    public static void main(String[] args) throws Exception {
        File file = new File("./text.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        TextParser textParser = new TextParser(br);
        String fileString = textParser.convertToString();

        Indexer indexer = new Indexer(fileString);
        HashMap<String, Integer> indexedFile = indexer.index();
    }
}
