package com.develogical;

import org.junit.Test;

import java.util.Map;

import static junit.framework.Assert.assertNotNull;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class QueryProcessorTest {

    @Test
    public void canGreetYou() {
        String result = new QueryProcessor().process("hi");
        assertNotNull(result);
        assertThat(result, is("hello"));
    }

    @Test
    public void canGreetWhatIsYourName() {
        String result = new QueryProcessor().process("what is your name");
        assertNotNull(result);
        assertThat(result, is("DeepBlue"));
    }

    @Test
         public void canTestPlus() {
        String result = new QueryProcessor().process("d8ea3280: what is 16 plus 10");
        assertNotNull(result);
        assertThat(result, is("26"));
    }

    @Test
    public void canTestMinus() {
        String result = new QueryProcessor().process("d8ea3280: what is 16 minus 10");
        assertNotNull(result);
        assertThat(result, is("6"));
    }

    @Test
    public void canTestMultiply() {
        String result = new QueryProcessor().process("d8ea3280: what is 16 multiplied by 10");
        assertNotNull(result);
        assertThat(result, is("160"));
    }

    @Test
    public void canTestFibbonacci() {
        String result = new QueryProcessor().process("e602ab40: what is the 6th number in the Fibonacci sequence");
        assertNotNull(result);
        assertThat(result, is("5"));
    }

    @Test
    public void canTestLargest() {
        String result = new QueryProcessor().process("ac197f80: which of the following numbers is the largest: 434, 28, 872, 77");
        assertNotNull(result);
        assertThat(result, is("872"));
    }

    @Test
    public void canTestPrimes() {
        String result = new QueryProcessor().process("df696090: which of the following numbers are primes: 3, 7, 6, 5");
        assertNotNull(result);
        assertThat(result, is("3, 7, 5"));
    }

    @Test
    public void canTestSqandCube() {
        String result = new QueryProcessor().process("df696090: which of the following numbers are primes: 3, 7, 6, 5");
        assertNotNull(result);
        assertThat(result, is("3, 7, 5"));
    }

    @Test
    public void returnsEmptyStringForUnknownQueries() {
        String result = new QueryProcessor().process("unknown");
        assertNotNull(result);
        assertThat(result, is(""));

        java.lang.Math.sqrt(0);
        java.lang.Math.cbrt(0);

    }
}



