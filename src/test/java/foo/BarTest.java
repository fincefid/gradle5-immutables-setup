package foo;

import org.junit.Test;

import static org.junit.Assert.*;

public class BarTest {

    @Test
    public void shouldModelHaveBuilder() {
        Bar bar1 = ImmutableBar.builder().name("Bar 1").value(1).build();
        assertEquals("Bar 1", bar1.getName());
    }

}