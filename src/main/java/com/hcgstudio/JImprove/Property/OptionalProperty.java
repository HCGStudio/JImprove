package com.hcgstudio.JImprove.Property;

/**
 * 可为Null的属性
 * @param <T> 属性的类型
 */
public interface OptionalProperty<T> extends Property<T>
{
    /**
     * 获取当前属性是否有值
     */
    ReadOnlyProperty<Boolean> IsPresent();

    /**
     * 可为Null地设置属性的值
     * @param value 属性的新值
     */
    void setNullable(T value);
}
