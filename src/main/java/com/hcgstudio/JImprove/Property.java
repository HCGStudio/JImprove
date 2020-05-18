package com.hcgstudio.JImprove;

public interface Property<T> extends ReadOnlyProperty<T>
{
    void set(T value);
}