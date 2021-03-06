package com.hcgstudio.JImprove.Property;

import java.util.Objects;

final class AutoProperty<T> implements Property<T>
{
    private T value;

    AutoProperty(T value)
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

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof ReadOnlyProperty)) return false;

        ReadOnlyProperty<?> that = (ReadOnlyProperty<?>) o;

        return Objects.equals(value, that.get());
    }

    @Override
    public int hashCode()
    {
        return value != null ? value.hashCode() : 0;
    }
}
