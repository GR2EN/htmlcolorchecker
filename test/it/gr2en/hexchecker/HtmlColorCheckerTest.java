package it.gr2en.hexchecker;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class HtmlColorCheckerTest {

    private String source;
    private boolean expectedResult;

    @Parameterized.Parameters
    public static Collection<Object []> data() {
        Object[][] data = new Object[][] {
                { "#FF0000", true },
                { "#c0c0c0", true },
                { "#000000", true },
                { "#eeeeee", true },
                { "#g1g2g3", false },
                { "#zzzzzz", false },
                { "eee", false },
                { "ff00", false }
        };

        return Arrays.asList(data);
    }

    public HtmlColorCheckerTest(String source, boolean expectedResult) {
        this.source = source;
        this.expectedResult = expectedResult;
    }

    @Test
    public void check() {
        assertEquals(expectedResult, HtmlColorChecker.check(source));
    }

}