package com.hcgstudio.JImprove.Property;

import org.jetbrains.annotations.Nullable;

/**
 * 属性
 * @param <T> 属性的类型
 */
public interface Property<T> extends ReadOnlyProperty<T>
{
    /**
     * 设置属性的值
     * @param value 属性的新值
     */
    void set(T value);
}