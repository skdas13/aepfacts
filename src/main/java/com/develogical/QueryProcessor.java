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
        else if (query.contains("which of the following numbers are primes")) {
            String response = "" + primes(query);
            System.out.println("response = " + response);
            return response;
        }
        else if (query.contains("which of the following numbers is both a square and a cube")) {
            String response = "" + squaresandcubes(query);
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
        else if ("multiplied".equals(ss[4])) {

            int i1 = Integer.parseInt(ss[3]);
            int i2 = Integer.parseInt(ss[6]);

            return i1 * i2;
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


    String primes (String s)
    {
        String primes = "";

        String [] s1 = s.split(":") ;
        String s2 = s1[2];
        String [] s3 = s2.split(",");

        for (String s4 : s3) {
            if (isPrime(Integer.parseInt(s4.trim()))) {
                if (!"".equals(primes))
                {
                    primes += ", ";
                }
                primes += s4.trim();
            }

        }

        return primes;


    }

    String squaresandcubes (String s)
    {
        String sqcbs = "";

        String [] s1 = s.split(":") ;
        String s2 = s1[2];
        String [] s3 = s2.split(",");

        for (String s4 : s3) {
            int n =  Integer.parseInt(s4.trim());

            if (isSquare(n) && isCube(n)) {
                if (!"".equals(sqcbs))
                {
                    sqcbs += ", ";
                }
                sqcbs += s4.trim();
            }

        }

        return sqcbs;


    }

    boolean isSquare(int n)
    {
        if (Math.sqrt(n) == Math.abs(Math.sqrt(n)))
            return true;
        else
            return false;
    }

    boolean isCube(int n)
    {
        if (Math.cbrt(n) == Math.abs(Math.cbrt(n)))
            return true;
        else
            return false;
    }

    boolean isPrime(int n) {
        //check if n is a multiple of 2
        if (n%2==0) return false;
        //if not, then just check the odds
        for(int i=3;i*i<=n;i+=2) {
            if(n%i==0)
                return false;
        }
        return true;
    }






}
