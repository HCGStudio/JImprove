package com.hcgstudio.JImprove.Property;

/**
 * 只读属性
 * @param <T> 属性的类型
 */
public interface ReadOnlyProperty<T>
{
    /**
     * 获取属性的值
     * @return 属性的值
     */
    T get();
}
