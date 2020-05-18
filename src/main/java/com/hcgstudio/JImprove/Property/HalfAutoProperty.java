package com.hcgstudio.JImprove.Property;

/**
 * 半自动属性，用于构建自定义访问级别的属性
 * @param <T> 属性的类型
 */
public abstract class HalfAutoProperty<T> implements ReadOnlyProperty<T>
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
