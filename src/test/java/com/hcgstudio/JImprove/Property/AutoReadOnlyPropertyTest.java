package com.hcgstudio.JImprove.Property;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoReadOnlyPropertyTest
{
    private ReadOnlyProperty<String> property;

    @BeforeEach
    void setUp()
    {
        property = Properties.ofReadOnly("test");
    }

    @Test
    void get()
    {
        assertEquals("test",property.get());
    }

    @Test
    void testEquals()
    {
        assertEquals(Properties.ofReadOnly("test"),property);
    }
}