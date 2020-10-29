package com.ljnpng.generics;

import com.ljnpng.generics.util.Generator;

public class BasicGenerator<T> implements Generator<T> {
    Class<T> type;

    public BasicGenerator(Class<T> tClass) {
        type = tClass;
    }

    @Override
    public T next() {
        try {
            return type.newInstance();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public static <T> Generator<T> create(Class<T> tClass) {
        return new BasicGenerator<>(tClass);
    }
}
