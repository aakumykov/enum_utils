package com.github.aakumykov.enum_utils;

public class EnumUtils {

    public static <T> void throwUnknownValue(T value) throws IllegalArgumentException {
        throw new IllegalArgumentException("Unknown enum value: "+value);
    }
}