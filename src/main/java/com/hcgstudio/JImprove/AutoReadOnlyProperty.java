package com.hcgstudio.JImprove;

public class AutoReadOnlyProperty<T> implements ReadOnlyProperty<T>
{
    protected final T value;

    public AutoReadOnlyProperty(T value)
    {
        this.value = value;
    }

    @Override
    public T get()
    {
        return value;
    }
}
