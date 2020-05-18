package com.hcgstudio.JImprove.Property;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoPropertyTest
{
    private Property<String> property;

    @BeforeEach
    void setUp()
    {
        property = Properties.of("test");
    }

    @Test
    void set()
    {
        property.set("test2");
        assertEquals("test2", property.get());
    }

    @Test
    void get()
    {
        assertEquals("test", property.get());
    }

    @Test
    void testEquals()
    {
        assertEquals(Properties.of("test"), property);
    }
}