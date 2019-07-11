/*
 * This functions returns first repeated word in the book
 */
package LambdaAPIGateway;

import java.util.HashMap;

public class Library {
    public String repeatedWord(String book) {
        if (!book.isEmpty()) {
            String[] parsedBook = book.split("\\s+");
            return firstWord(parsedBook);
        }
        return book;
    }

    private String firstWord(String[] parsedBook) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String each : parsedBook) {
            if (map.containsKey(each)) {
                return each;
            }else {
                if (each != "," ) {
                    if(each.charAt(each.length()-1) == ','){
                        each = each.substring(0,each.length()-1);
                    }
                    map.put(each.toLowerCase(),0);
                }
            }
        }
        return "No-repeat";
    }
}
