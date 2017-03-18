package com.sdajava.zadanie_zaliczeniowe_SZ;

/**
 * Created by RENT on 2017-03-18.
 */
public class Worker {

public String name;
public String surname;
public char sex;
public int divisionNumber;
public float salary;
public int age;
public int children;
public boolean martialStatus = true;

public Worker(){}

    public Worker(String name, String surname, char sex, int divisionNumber, float salary, int age, int children, boolean martialStatus) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.divisionNumber = divisionNumber;
        this.salary = salary;
        this.age = age;
        this.children = children;
        this.martialStatus = martialStatus;


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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getDivisionNumber() {
        return divisionNumber;
    }

    public void setDivisionNumber(int divisionNumber) {
        this.divisionNumber = divisionNumber;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public boolean isMartialStatus() {
        return martialStatus;
    }

    public void setMartialStatus(boolean martialStatus) {
        this.martialStatus = martialStatus;
    }

}
