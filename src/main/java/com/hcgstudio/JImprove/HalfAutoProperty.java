package com.hcgstudio.JImprove;

public class HalfAutoProperty<T> implements ReadOnlyProperty<T>
{
    private T value;

    public HalfAutoProperty(T value)
    {
        this.value = value;
    }

    protected void set(T value)
    {
        this.value = value;
    }

    @Override
    public T get()
    {
        return value;
    }
}
