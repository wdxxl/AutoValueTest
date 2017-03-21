package com.wdxxl.auto.value;

import org.junit.Assert;
import org.junit.Test;

public class TestAnimal {

    @Test
    public void testAnimalAutoValue(){
        Animal dog = Animal.create("dog" , 4);
        Assert.assertEquals("dog", dog.name());
        Assert.assertEquals(4, dog.numberOfLegs());

        Assert.assertTrue(Animal.create("dog",4).equals(dog));
        Assert.assertFalse(Animal.create("cat",4).equals(dog));
        Assert.assertFalse(Animal.create("dog",2).equals(dog));

        Assert.assertEquals("Animal{name=dog, numberOfLegs=4}", dog.toString());

    }
}
