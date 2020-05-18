package com.hcgstudio.JImprove.Property;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.NoSuchElementException;
import java.util.Objects;


class AutoOptionalProperty<T> implements OptionalProperty<T>
{
    protected T value;
    @Override
    public ReadOnlyProperty<Boolean> IsPresent()
    {
        return () -> value != null;
    }

    AutoOptionalProperty(T value)
    {
        if (value == null)
            throw new NullPointerException();
        this.value = value;
    }

    @Override
    public void set(@NotNull T value)
    {
        this.value = value;
    }

    @Override
    public void setNullable(@Nullable T value)
    {
        this.value = value;
    }

    @Override
    @NotNull
    public T get()
    {
        if (value == null)
        {
            throw new NoSuchElementException("No value present");
        }
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
