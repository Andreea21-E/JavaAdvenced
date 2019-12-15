package com.sdaacademy.javaadvenced;

import org.junit.Test;

public class DogTest {
    // create an object of dog
    @Test
    public void TestConstructor() {
        Dog dog = new Dog("Azor", (byte) 5, "Male", "ciobanesc", 20);
        // sa fac convertirea pt age, si la weight fara 0
        assert dog.getAge() == (byte) 5;
        assert dog.getWeight() == 20;
    }

    @Test
    public void TestConstructor1() {
        Dog dog = new Dog("Male", "ciobanesc");
        assert dog.getAge() == (byte) 0;
        assert dog.getWeight() == 0;

        // assert arunca o assetion error
        // trebuie sa fie valoare de la age si weight  = valorea default( adica 0 si 0 );
    }

    //f
    @Test
    public void setAge() {
        Dog dog = new Dog("Male", "ciobanesc");

        dog.setAge((byte) -1);
        assert dog.getAge() == 0; // este 0 pt ca l-am initializat cu valoare 0 din costructor    this("",(byte)0,"",race,(float)0.0);

        dog.setAge((byte) 2);
        assert dog.getAge() == (byte) 2; // merge si fara (byte )- pt ca se converteste automat upcast adica nu tre
    }

    @Test
    public void setWeight() {
        Dog dog = new Dog("Male", "ciobanesc");

        dog.setWeight((byte) -1);
        assert dog.getWeight() == 0;

        dog.setWeight(10);
        assert dog.getWeight() == 10;
    }
}
