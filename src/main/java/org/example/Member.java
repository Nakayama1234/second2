package org.example;

public class Member {
    private String name;
    private int age;
    private String technique;
    private int bounty;

    public Member(String name, int age, String technique, int bounty) {
        this.name = name;
        this.age = age;
        this.technique = technique;
        this.bounty = bounty;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTechnique() {
        return technique;
    }

    public int getBounty() {
        return bounty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTechnique(String technique) {
        this.technique = technique;
    }

    public void setBounty(int bounty) {
        this.bounty = bounty;
    }
}


