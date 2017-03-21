package com.wdxxl.auto.value;

import com.google.auto.value.AutoValue;

@AutoValue
abstract class Animal {
    abstract String name();
    abstract int numberOfLegs();

    public static Animal create(String name, int numberOfLegs) {
        return new AutoValue_Animal(name, numberOfLegs);
    }

}
