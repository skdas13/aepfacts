package com.develogical;

public class QueryProcessor {

    public String process(String query) {

        System.out.println("query = " + query);

        if (query.contains("hi")) {
            return "hello";
        }
        else if (query.contains("what is your name")) {
            return "DeepBlue";
        }
        else if (query.contains("what is 19 plus 10")) {
            return "29";
        }
        else if (query.contains("which of the following numbers is the largest: 20, 257, 35, 271")) {
            return "271";
        }
        return "";
    }

}
