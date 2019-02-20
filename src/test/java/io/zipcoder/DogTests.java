package io.zipcoder;

import io.zipcoder.Dog;
import io.zipcoder.Pet;
import org.junit.Assert;
import org.junit.Test;

public class DogTests {

    @Test
    public void DogNullConstructorTest(){
        // Given
        Dog dog = new Dog();

        // When
        String actual = dog.getName();

        // Then
        Assert.assertEquals("", actual);
    }


    @Test
    public void DogConstructorWithName(){
        // Given
        String expected = "Puffy Fluffy";
        Dog dog = new Dog(expected);

        // When
        String actual = dog.getName();

        // Then
        Assert.assertEquals(actual, expected);
    }


    @Test
    public void DogSpeakTest(){
        // Given
        Dog dog = new Dog();
        String expected = "Bark!";

        // When
        String actual = dog.speak();

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void DogPolymorphismTest(){
        // Given
        Dog dog = new Dog();

        // When
        Boolean actual = dog instanceof Pet;

        // Then
        Assert.assertTrue(actual);
    }

}
