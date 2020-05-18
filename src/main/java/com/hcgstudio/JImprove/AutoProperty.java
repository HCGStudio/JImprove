package com.hcgstudio.JImprove;

public class AutoProperty<T> implements Property<T>
{
    private T value;

    public AutoProperty(T value)
    {
        this.value = value;
    }

    @Override
    public void set(T value)
    {
        this.value = value;
    }

    @Override
    public T get()
    {
        return value;
    }
}
