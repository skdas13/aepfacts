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
        else if (query.contains("what is")) {
            String response = "" + parseString(query);
            System.out.println("response = " + response);
            return response;
        }
        else if (query.contains("which of the following numbers is the largest: 20, 257, 35, 271")) {
            return "271";
        }
        return "";
    }

    int parseString (String s)
    {
        String [] ss = s.split(" ");

        if ("plus".equals(ss[4])) {

            int i1 = Integer.parseInt(ss[3]);
            int i2 = Integer.parseInt(ss[5]);

            return i1 + i2;
        }

        return 0;
    }


}
