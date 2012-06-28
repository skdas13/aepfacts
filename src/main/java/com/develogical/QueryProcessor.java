package com.develogical;

public class QueryProcessor {

    public String process(String query) {

        System.out.println("query = " + query);

        if (query.equals("hi")) {
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
        else if (query.contains("which of the following numbers is the largest")) {
            String response = "" + largest(query);
            System.out.println("response = " + response);
            return response;
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

    int largest (String s)
    {
        int largest = -1;

        String [] s1 = s.split(":") ;
        String s2 = s1[2];
        String [] s3 = s2.split(",");

        for (String s4 : s3) {
            int n = Integer.parseInt(s4.trim());
            if (n > largest)
                largest = n;
        }

        return largest;


    }




}
