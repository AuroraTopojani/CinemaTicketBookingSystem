package com.example.cinema.pojo.input;


public class CustomerInput {

    private String name;
    private String surname;
    private String email;
    private Integer age;

    public CustomerInput() {
    }

    public CustomerInput(String name, String surname, String email, Integer age) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
