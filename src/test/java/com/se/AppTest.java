package com.se;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void testMessage() {
        assertEquals(
                "Jenkins CI/CD Assignment - Roll No 05DZ",
                App.getMessage()
        );
    }
}
