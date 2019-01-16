package pl.sda.javastart.day6;

import java.math.BigDecimal;

public abstract class Person {
    private String firstName;
    private String lastName;
    private Integer identity;
    private Integer age; // int ma wartosc 0 , Integer ma null

    public Person(String firstName, String lastName, Integer identity, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identity = identity;
        this.age = age;
    }

    protected void introduction() {
        System.out.print("Jestem czlowiekiem");
    }

    public abstract BigDecimal showIncome();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
