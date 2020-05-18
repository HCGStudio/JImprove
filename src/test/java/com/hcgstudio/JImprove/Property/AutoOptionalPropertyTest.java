package com.hcgstudio.JImprove.Property;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoOptionalPropertyTest
{
    private OptionalProperty<String> property;

    @BeforeEach
    void setUp()
    {
        property = Properties.ofOptional("test");
    }

    @Test
    void set()
    {
        assertThrows(IllegalArgumentException.class,() -> property.set(null));
        property.set("test2");
        assertEquals("test2", property.get());
    }

    @Test
    void setNullable()
    {
        assertTrue(property.IsPresent().get());
        assertDoesNotThrow(() ->property.setNullable(null));
        assertFalse(property.IsPresent().get());
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