package com.hcgstudio.JImprove;

public class Properties
{
    public static <T> ReadOnlyProperty<T> ofReadOnly(T value)
    {
        return new AutoReadOnlyProperty<>(value);
    }

    public static <T> Property<T> of(T value)
    {
        return new AutoProperty<>(value);
    }

}
