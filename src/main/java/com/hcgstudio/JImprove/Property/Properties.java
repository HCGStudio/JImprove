package com.hcgstudio.JImprove.Property;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * 属性的静态工厂方法类
 */
public class Properties
{
    /**
     * 构造只读的自动属性
     * @param value 属性的值
     * @param <T> 类型
     * @return 构造的属性
     */
    @NotNull
    public static <T> ReadOnlyProperty<T> ofReadOnly(T value)
    {
        return new AutoReadOnlyProperty<>(value);
    }

    /**
     * 构造可读写的自动属性
     * @param value 属性的初值
     * @param <T> 类型
     * @return 构造的属性
     */
    @NotNull
    public static <T> Property<T> of(T value)
    {
        return new AutoProperty<>(value);
    }

    /**
     * 构造带Null检查的属性
     * @param value 属性的初值，不可为Null
     * @param <T> 类型
     * @return 构造的属性
     */
    @NotNull
    public static <T> OptionalProperty<T> ofOptional(@NotNull T value)
    {
        return new AutoOptionalProperty<>(value);
    }

    /**
     * 构造初值可为空的带Null检查的属性
     * @param value 属性的初值，可以为Null
     * @param <T> 类型
     * @return 构造的属性
     */
    @NotNull
    public static <T> OptionalProperty<T> ofNullable(@Nullable T value)
    {
        return new AutoOptionalProperty<>(value);
    }
}
