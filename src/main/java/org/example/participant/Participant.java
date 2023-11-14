package org.example.participant;

public abstract class Participant {
    private String name;
    private int age;
    private int ID;

    public Participant(String name, int age, int ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ID=" + ID;
    }
}
