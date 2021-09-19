package catchup.launchcode;

import java.util.*;

public class Animal {
    private String name;
    private Integer age;
    private Date date;
    private
    Double weight;

    private Animal(String aName, Integer aAge, Date aDate, Double aWeight) {
        this.name = aName;
        this.age = aAge;
        this.date = aDate;
        this.weight = aWeight;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }
}
