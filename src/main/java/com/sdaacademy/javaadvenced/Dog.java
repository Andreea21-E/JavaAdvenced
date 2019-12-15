package com.sdaacademy.javaadvenced;

public class Dog {
    // punctul a private filds
    private String name;
    private byte age;
    private String gender;
    private String race;
    private float weight;
    // facem constructorul , click dreapta generate-constructor le selectam pe toate asta e b de la exercitiu

    public Dog(String name, byte age, String gender, String race, float weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.race = race;
        this.weight = weight;


    }
    // c de la ex
    public Dog (String gender,String race){
        this("",(byte)0,"",race,(float)0.0);
                // apeleaza constrctorul -overload,overwrite
    }
// creem get and set pt age and weight
    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
       if ( weight>0 ) {
        this.weight = weight;
        }
    }
}

