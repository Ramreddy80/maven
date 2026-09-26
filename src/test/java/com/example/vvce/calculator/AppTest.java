package com.example.vvce.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {
	App app = new App();

    @Test
    public void testAdd() {
        assertEquals(25, app.add(20, 5));
    }

    @Test
    public void testSubtract() {
        assertEquals(15, app.sub(20, 5));
    }
}
